
package com.marlabs.training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
//crtl+shift+O

@Component
public class MyMessage2 implements CommandLineRunner,Ordered{


	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is amruta");
	}

	@Override
	public int getOrder() {
		return 2;
	}

}
