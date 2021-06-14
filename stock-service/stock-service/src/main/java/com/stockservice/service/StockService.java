package com.stockservice.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.stockservice.beans.Stock;



@Service
public class StockService {
	
	private final AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
			.withRegion(Regions.AP_SOUTH_1)
			.build();  
    
    
    public void save(Stock stock) {
    	HashMap<String, AttributeValue> attribValue = new HashMap<String, AttributeValue>();
    	attribValue.put("companyCode", new AttributeValue(stock.getCompanyCode()));
    	attribValue.put("stockPrice", new AttributeValue(stock.getStockPrice()));
    	
  
    	client.putItem("StockTable" , attribValue);
    }
    
    

}
