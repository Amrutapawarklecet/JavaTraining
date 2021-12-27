package com.marlabs.training;

import java.util.*;

public class Festival {

	enum shop{SHOP1,SHOP2,SHOP3,SHOP4};
	public static void main(String[] args) {
		EnumMap<shop,ShoppingDetails>  em=new EnumMap<shop,ShoppingDetails>(shop.class);
		ShoppingDetails ob1=new ShoppingDetails("Madhu","Leecoper","Online",3000);
		ShoppingDetails ob2=new ShoppingDetails("Sandip","Levis","Online",3200);
		ShoppingDetails ob3=new ShoppingDetails("Rohit","Woodland","Offline",5000);
		ShoppingDetails ob4=new ShoppingDetails("Shohaib","Bata","Offline",4000);
		em.put(shop.SHOP1, ob1);
		em.put(shop.SHOP2, ob2);
		em.put(shop.SHOP3, ob3);
		em.put(shop.SHOP4, ob4);
		
		for(Map.Entry<shop, ShoppingDetails> ab:em.entrySet()) {
			System.out.println(ab.getKey()+"   "+ab.getValue());
		}

	}

}
