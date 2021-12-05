package com.example.blockchainservice.services;

import com.example.blockchainservice.entities.Block;
import com.example.blockchainservice.entities.Blockchain;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlockchainServiceImp implements BlockchainService{
    @Override
    public Blockchain addNewBlockToBlockchain(Block block) {

        return null;
    }

    @Override
    public void minerBlock(String address) {

    }

    @Override
    public Block getLastBlock(Blockchain blockchain) {

        List<Block> list_Blocks = blockchain.getListBlocks();
        return  list_Blocks.get(list_Blocks.size()-1);
    }

    @Override
    public boolean verifyBlockchain(Blockchain blockchain) {
        return false;
    }

    @Override
    public double calculSolde(String address) {
        return 0;
    }
}
