

package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;
@Controller
public class HelloWorldController 
{

	@RequestMapping("/hello") //input 
	public ModelAndView helloWorld(HttpServletRequest req,HttpServletResponse res)
	{   
		String name=req.getParameter("t1");
		String pass=req.getParameter("t2");
		if(pass.equals("admin"))
		{
			String message1="Hello "+name;
		
		return new ModelAndView("hellopage","message",message1);
	}
		else
		{
			return new ModelAndView("welcome","message","Sorry wrong username/password");
		}
	
	}
}
