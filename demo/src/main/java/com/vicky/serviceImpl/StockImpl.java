package com.vicky.serviceImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.model.Inventory;

@Repository
public interface StockImpl extends JpaRepository<Inventory, Integer>{

}
