package com.example.blockchainservice.services;

import com.example.blockchainservice.entities.Block;
import com.example.blockchainservice.entities.Blockchain;

public interface BlockchainService {
     Blockchain addNewBlockToBlockchain(Block block);
     void minerBlock(String address);
     Block getLastBlock(Blockchain blockchain);
     boolean verifyBlockchain(Blockchain blockchain);
     double calculSolde(String address);

}
