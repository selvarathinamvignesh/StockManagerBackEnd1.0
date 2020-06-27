package com.vicky.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Inventory {
	
	@Id
	@GeneratedValue
	public String inventoryId;
	
	public String stockNumber;
	
	public String stockName;
	
	public float purchasingPrice;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date purchasingDate;
	
	public int Quality;

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getStockNumber() {
		return stockNumber;
	}

	public void setStockNumber(String stockNumber) {
		this.stockNumber = stockNumber;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public float getPurchasingPrice() {
		return purchasingPrice;
	}

	public void setPurchasingPrice(float purchasingPrice) {
		this.purchasingPrice = purchasingPrice;
	}

	public Date getPurchasingDate() {
		return purchasingDate;
	}

	public void setPurchasingDate(Date purchasingDate) {
		this.purchasingDate = purchasingDate;
	}

	public int getQuality() {
		return Quality;
	}

	public void setQuality(int quality) {
		Quality = quality;
	}

}
