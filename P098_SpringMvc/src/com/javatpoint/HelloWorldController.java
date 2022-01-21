package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{

	@RequestMapping("/hello") //input 
	public ModelAndView helloWorld(){   //return type is ModelAndView
		String message1="Hello Spring MVC how r u";
		return new ModelAndView("hellopage","message",message1);//output jsp page is hellopage.jsp
	}
	@RequestMapping("/welcome")
	public ModelAndView welcomeWorld(){
		String message1="Hello Welcome to Spring MVC";
		return new ModelAndView("welcome","message",message1);//output jsp page is wecome.jsp
	}
	
	
}
