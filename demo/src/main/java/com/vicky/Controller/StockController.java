package com.vicky.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.model.Inventory;
import com.vicky.serviceImpl.StockImpl;

@RestController
public class StockController {
	
	@Autowired
	StockImpl stockrepo;
	
	//To get all the stocks from the inventory
	@GetMapping("/inventory")
	public List<Inventory> getStocks(){
		return stockrepo.findAll();
	}
	
	//To Save the stock to the inventory
	@PostMapping(path="/inventory", consumes = {"application/json"})
	public Inventory saveStocks(@RequestBody Inventory inventory) {
		stockrepo.save(inventory);
		return inventory;
	}
	
	//To Update the stock in the inventory
	@PutMapping(path="/inventory", consumes = {"application/json"})
	public Inventory updateStocks(@RequestBody Inventory inventory) {
		stockrepo.save(inventory);
		return inventory;
	}

}
