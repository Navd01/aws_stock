package com.stockservice.beans;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="StockTable")
public class Stock {
	
	
	private String stockPrice;
		
	
	private String companyCode;
	
	
	public Stock() {
		
	}

	@DynamoDBAttribute(attributeName="stockPrice")
	public String getStockPrice() {
		return stockPrice;
	}


	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	@DynamoDBHashKey(attributeName="companyCode")
	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	
	
	
	
}
