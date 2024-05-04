package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class EmpServiceImpl implements Empservice {


	@Autowired
	private EmpRepository empRepo;

	@Override
	public Employee saveEmp(Employee emp) {
		Employee newEmp = empRepo.save(emp);
		return newEmp;
	}

	@Override
	public List<Employee> getAllEmp() {

		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		return empRepo.findById(id).get();
	}

	@Override
	public boolean deleteEmp(int id) {
		Employee emp = empRepo.findById(id).get();
		if (emp != null) {
			empRepo.delete(emp);
			return true;
		}
		return false;
	}

	public void removeSessionMessage() {
		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
				.getSession();

		session.removeAttribute("msg");

	}

	@Override
	public boolean deleteEm(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
