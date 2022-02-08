package com.marlabs.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class TestController 
{
@RequestMapping("/reg")
public String showRegPage()
{
	return "EmpReg";
}

@PostMapping("/save")
public String readData(@ModelAttribute Employee employee,Model model)
{
	System.out.println(employee);
	model.addAttribute("emp",employee);
	return "Data";
}
}
