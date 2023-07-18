package com.springbootrestapiInventoryImageProject.aap.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestapiInventoryImageProject.aap.model.Model;

@Repository
public interface DocumetDaoImpl extends JpaRepository<Model, Integer>{

	
}
