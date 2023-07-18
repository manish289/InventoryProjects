package com.springbootrestapiInventoryProject.Zyapaar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapiInventoryProject.Zyapaar.Dao.InventoryDao;
import com.springbootrestapiInventoryProject.Zyapaar.Model.Inventory;


@Service
public class InventoryServiceImpl implements InventoryServiceInterface {

	@Autowired
	InventoryDao inventorydao; 
	
	@Override
	public List<Inventory> saveAllProduct(Inventory invent) {
	
		inventorydao.save(invent);
		return inventorydao.findAll();
	}

	@Override
	public List<Inventory> getAllProducts() {
		
		return inventorydao.findAll() ;
	}


	@Override
	public  String deleteProduct(Integer productId) {
		
	    inventorydao.deleteById(productId);
		return "success";    
	}

	@Override
	public Inventory updateInventory(Integer productId, Inventory inven) {
		
		Optional<Inventory> op=inventorydao.findById(productId);
		  if(op.isPresent())
		  { 
			  Inventory invent= op.get();
			  
			   invent.setProduct1(inven.getProduct1());
			   invent.setProduct2(inven.getProduct2());
			   invent.setProduct3(inven.getProduct3());
			   invent.setProduct4(inven.getProduct4());  
		  }
		
		return inventorydao.save(inven);
	    
	}
	
	
	

}
