package com.marlabs.training.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/reg")
	public String showReg() {
		return "Register";
	}
	
	
	@RequestMapping("/home")
	public String showHome(Map<String,Object> model) {
		System.out.println(model.getClass().getName());
		model.put("sid", 101);
		model.put("sname", "SANDIP");
		model.put("sfee", 6500.0);
		return "Home";
	}
}

