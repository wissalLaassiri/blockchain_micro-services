package com.example.blockchainservice;

import com.example.blockchainservice.entities.Block;
import com.example.blockchainservice.entities.Blockchain;
import com.example.blockchainservice.entities.Transaction;
import com.example.blockchainservice.repositories.BlockRepository;
import com.example.blockchainservice.services.BlockService;
import com.example.blockchainservice.services.BlockchainService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BlockchainServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BlockService blockService, BlockRepository blockRepository){
//        restconfg.exposeIdsFor(Transaction.class);
//        restconfg.exposeIdsFor(Block.class);

        return  args -> {
            Block block1 =new Block("00aa",new ArrayList<>(),1);

            Transaction transaction1 = new Transaction("cl1","cl2",300);
            Transaction transaction2 = new Transaction("cl1","cl2",450);

            transaction1.setBlock(block1);
            transaction2.setBlock(block1);

            System.out.println("transactions :: ===============");
            System.out.println(transaction1);
            System.out.println(transaction2);
            System.out.println(block1.getListeTransactions());

            block1.getListeTransactions().add(transaction1);
            System.out.println("================");
            System.out.println(block1.getListeTransactions());
            System.out.println("================");

//            blockService.saveBlock(block1);
        };
    }

}
