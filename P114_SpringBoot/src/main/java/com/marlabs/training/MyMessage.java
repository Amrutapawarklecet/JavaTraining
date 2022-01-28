package com.marlabs.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//ctrl+shift+O
@Component
public class MyMessage implements CommandLineRunner {
	
	@Value("${my.info.product.id}")
	private int prodid;
	@Value("${my.info.product.name}")
	private String name;
	@Value("${my.info.product.price}")
	private double price;
	@Value("${my.info.product.ver}")
	private String ver;

	@Override
	public String toString() {
		return "MyMessage [prodid=" + prodid + ", name=" + name + ", price=" + price + ", ver=" + ver + "]";
	}

	public void run(String... args) throws Exception {
		System.out.println(this);

	}
}
