package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface Empservice {
	
public Employee saveEmp(Employee emp);
	
	public List<Employee> getAllEmp();
	
	public Employee getEmpById(int id);
	
	public boolean deleteEm(int id);

	boolean deleteEmp(int id);

}
