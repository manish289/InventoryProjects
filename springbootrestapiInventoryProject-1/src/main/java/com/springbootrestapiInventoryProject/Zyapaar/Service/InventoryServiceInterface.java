package com.springbootrestapiInventoryProject.Zyapaar.Service;

import java.util.List;

import com.springbootrestapiInventoryProject.Zyapaar.Model.Inventory;


public interface InventoryServiceInterface {

	public List<Inventory> saveAllProduct(Inventory invent);

	List<Inventory> getAllProducts();

	String deleteProduct(Integer productId);

	Inventory updateInventory(Integer productId, Inventory inven);
}
