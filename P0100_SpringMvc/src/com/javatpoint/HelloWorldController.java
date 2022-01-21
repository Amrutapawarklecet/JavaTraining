package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.*;
@Controller
public class HelloWorldController 
{

	@RequestMapping("/cal") //input 
	public ModelAndView Calculator(HttpServletRequest req,HttpServletResponse res)
	{   
		String num1=req.getParameter("t1");
		String num2=req.getParameter("t2");
		String cal=req.getParameter("t3");
		if(cal.equals("Add"))
			{
			
			int num3=Integer.parseInt(num1)+Integer.parseInt(num2);
			
			return new ModelAndView("result","message",num3);
			}
		else if(cal.equals("Sub"))
			{
			int num3=Integer.parseInt(num1)-Integer.parseInt(num2);
			return new ModelAndView("result","message",num3);
			
			}
		else if(cal.equals("Mul"))
			{
			int num3=Integer.parseInt(num1)*Integer.parseInt(num2);
			return new ModelAndView("result","message",num3);
			}
		else
			{
			int num3=Integer.parseInt(num1)/Integer.parseInt(num2);
			return new ModelAndView("result","message",num3);
			}
	}
}
