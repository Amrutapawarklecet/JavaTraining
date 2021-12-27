package com.marlabs.training;

public class ShoppingDetails {

	String Name,ProductName,ShopType;
	int price;
	public ShoppingDetails(String name, String productName, String shopType, int price) {
		super();
		Name = name;
		ProductName = productName;
		ShopType = shopType;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ShoppingDetails [Name=" + Name + ", ProductName=" + ProductName + ", ShopType=" + ShopType + ", price="
				+ price + "]";
	}
	
	
}
