package com.example.blockchainservice.repositories;

import com.example.blockchainservice.entities.Block;
import com.example.blockchainservice.entities.Blockchain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockchainRepository  extends JpaRepository<Blockchain, String> {
}
