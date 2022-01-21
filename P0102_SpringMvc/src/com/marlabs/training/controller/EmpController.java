//create table employee(id varchar2(30),name varchar2(30),salary varchar2(30),designation varchar2(30)) 
package com.marlabs.training.controller;

import java.sql.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marlabs.training.beans.Emp;

@Controller
public class EmpController {
	Emp emp = new Emp();

	@RequestMapping("/empform1")
	public ModelAndView showform() {
		return new ModelAndView("empform", "command", new Emp());
	}

	@RequestMapping("/updateemp")
	public ModelAndView updateform() {
		return new ModelAndView("updateform", "command", new Emp());
	}

	@RequestMapping("/deleteemp")
	public ModelAndView deleteform() {
		return new ModelAndView("deleteform", "command", new Emp());
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {

		return new ModelAndView("viewemp");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1234");
			PreparedStatement st = con.prepareStatement("insert into  employee values(?,?,?,?)");
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());
			st.setString(1, emp.getId());
			st.setString(2, emp.getName());
			st.setString(3, emp.getSalary());
			st.setString(4, emp.getDesignation());
			st.execute();
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return new ModelAndView("viewemp");
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateemp(@ModelAttribute("emp") Emp emp) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1234");
			PreparedStatement st = con.prepareStatement("update employee set name=?,salary=?,designation=? where id=?");
			emp.setId(emp.getId());
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());
			st.setString(1, emp.getName());
			st.setString(2, emp.getSalary());
			st.setString(3, emp.getDesignation());
			st.setString(4, emp.getId());

			st.execute();
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return new ModelAndView("viewemp");
	}

	@RequestMapping("/delete")
	public ModelAndView update(@ModelAttribute("emp") Emp emp) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1234");
			PreparedStatement st = con.prepareStatement("delete employee where id=?");
			System.out.println(emp.getId());
			st.setString(1, emp.getId());
			st.execute();
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return new ModelAndView("viewemp");
	}

}
