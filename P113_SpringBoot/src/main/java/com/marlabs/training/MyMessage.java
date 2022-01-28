/*run-->run configuration -->argument  
--name=sandip  --db=MySql or --db=Oracle
*/
package com.marlabs.training;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//crtl+shift+O

@Component
public class MyMessage implements CommandLineRunner{


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting of CommandLine Runner");
		System.out.println(args[1]);
		System.out.println(Arrays.asList(args));
		System.out.println("Ending of CommandLine Runner");
	}

	
}
