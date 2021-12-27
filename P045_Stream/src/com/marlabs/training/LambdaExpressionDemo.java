package com.marlabs.training;

import java.util.*;
import java.util.stream.Stream;

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1, "Laptop", 40000.35f));
		al.add(new Product(2, "Desktop", 30000.35f));
		al.add(new Product(3, "Keyboard", 4000.45f));
		al.add(new Product(4, "Mouse", 300.00f));
//sort on basis of product price
		Collections.sort(al, (p1, p2) -> {
			return p1.price.compareTo(p2.price);
		});

		for (Product p : al)
			System.out.println(p.id + "  " + p.name + "  " + p.price);

//sorting on basis of product name
		System.out.println("*********************************************");

		Collections.sort(al, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : al)
			System.out.println(p.id + "  " + p.name + "  " + p.price);

		System.out.println("*****************Less than 5000***************************");
		//filter the data example :- product less than Rs 5000
		//we have a class --(Stream)
		Stream<Product> fd = al.stream().filter(x -> x.price < 5000);
		fd.forEach(product -> System.out.println(product.id + "  " + product.name + "  " + product.price));

		System.out.println("*****************Greater Than 5000***************************");
		Stream<Product> fd1 = al.stream().filter(x -> x.price > 5000);
		fd1.forEach(product -> System.out.println(product.id + "  " + product.name + "  " + product.price));
	}
}
