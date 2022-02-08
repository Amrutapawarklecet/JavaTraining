package com.marlabs.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marlabs.training.dao.EmployeeDao;
import com.marlabs.training.entity.Employee;

@Service
public class EmployeeService implements ImplEmployeeService {

	@Autowired
	private EmployeeDao dao;

	/*
	 * private static List<Employee> employees = new ArrayList<Employee>(); static {
	 * Employee e1 = new Employee(1, "Afreen", "Afreen@gmail.com"); Employee e2 =
	 * new Employee(2, "Abhilasha", "Abhilasha@gmail.com"); Employee e3 = new
	 * Employee(3, "Amruta", "Amruta@gmail.com"); employees.add(e1);
	 * employees.add(e2); employees.add(e3); }
	 */
	@Override
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);

	}

	@Override
	public void updateEmployee(Employee emp, int empid) {
//		Employee record = getEmployeeById(empid);
//		employees.remove(record);
//		emp.setEmpid(empid);
//		employees.add(emp);
		dao.updateEmployee(emp);

	}

	@Override
	public boolean deleteEmployee(int empid) {
//		Employee record = getEmployeeById(empid);
//		employees.remove(record);
		dao.deleteEmployee(empid);
		return Boolean.TRUE;

	}

	@Override
	public Employee getEmployeeById(int empid) {
		return dao.getEmployeeById(empid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
