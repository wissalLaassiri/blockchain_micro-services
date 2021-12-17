package com.example.blockchainservice.services;

import com.example.blockchainservice.entities.Block;

public interface BlockService {
    Block saveBlock(Block block);
    String calculHashBloc(Block block);
    void minerBlock(int diff);
}
