package com.marlabs.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public String showData(@RequestParam(name="ID",required = false,defaultValue="101") String ID, @RequestParam(name="name",required = false,defaultValue="Amruta") String name,Model model)
	{
		System.out.println("The id is "+ID+ "The name is "+name);
		model.addAttribute("id",ID);
		model.addAttribute("name",name);

		return "Data";
		
	}
}