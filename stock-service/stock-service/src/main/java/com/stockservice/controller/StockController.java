package com.stockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockservice.beans.Stock;
import com.stockservice.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@PostMapping("/addStock")
	public void addStock(@RequestBody Stock stock) {
		
		stockService.save(stock);
		
	}
	
	@GetMapping("/")
	public String health() {
		return "YOHOHOHO";
	}

}
