package com.ourbabies.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ourbabies.springboot.model.Item;



@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    
	
   
}
