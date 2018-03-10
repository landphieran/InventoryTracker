package com.andrew.gmail.domain;

import java.math.BigInteger;

public class Item {

	private String name;
	private BigInteger price;
	private int quantity;
	private BigInteger eachPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getPrice() {
		return price;
	}
	public void setPrice(BigInteger price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigInteger getEachPrice() {
		return eachPrice;
	}
	public void setEachPrice(BigInteger eachPrice) {
		this.eachPrice = eachPrice;
	}
	
}
