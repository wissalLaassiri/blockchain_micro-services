package com.example.blockchainservice.repositories;

import com.example.blockchainservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {

}
