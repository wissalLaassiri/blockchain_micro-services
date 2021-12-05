package com.example.blockchainservice.repositories;

import com.example.blockchainservice.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlockRepository extends JpaRepository<Block, String> {

}
