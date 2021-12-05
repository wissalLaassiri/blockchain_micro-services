package com.example.blockchainservice.services;

import com.example.blockchainservice.entities.Block;
import com.example.blockchainservice.entities.Transaction;
import com.example.blockchainservice.repositories.BlockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.Date;


@Service
@Transactional
public class BlockServiceImp implements BlockService{
    private BlockRepository blockRepository;

        public BlockServiceImp(BlockRepository blockRepository) {
            this.blockRepository = blockRepository;
        }

    @Override
    public Block saveBlock(Block block) {
//        Collection<Transaction> transactions = block.getListeTransactions();
        String hash = calculHashBloc(block);

        block.setHashBlock(hash);
        block.setDateCreation(new Date());
        System.out.println("in service imp ============");
        System.out.println(block);
        return blockRepository.save(block);
    }


    @Override
    public String calculHashBloc(Block block) {
        Collection<Transaction> transactions = block.getListeTransactions();
        String str = ""+block.getHashBlocPrec()+ block.getNonce()+ transactions.hashCode();
        String hash="";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(
                    str.getBytes(StandardCharsets.UTF_8));
            hash =  DatatypeConverter.printHexBinary(encodedhash);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return hash;
    }

    @Override
    public void minerBlock(int diff) {


    }
}
