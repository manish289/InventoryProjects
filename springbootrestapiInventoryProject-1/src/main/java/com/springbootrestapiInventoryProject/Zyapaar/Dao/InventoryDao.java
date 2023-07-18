package com.springbootrestapiInventoryProject.Zyapaar.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestapiInventoryProject.Zyapaar.Model.Inventory;


@Repository
public interface InventoryDao extends JpaRepository<Inventory, Integer> {

	
}
