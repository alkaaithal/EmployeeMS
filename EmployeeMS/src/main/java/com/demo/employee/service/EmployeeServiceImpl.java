package com.demo.employee.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.demo.employee.dao.EmployeeRepository;
import com.demo.employee.entity.Employee;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@Override
	public List<Employee> increaseSalary(String place, int percentage) {
		List<Employee> requestList = new ArrayList<Employee>();
		List<Employee> response = empRepo.findSalaryByPlace(place);
		Employee e = null;
		for(Employee emp : response) {
			Long salary=emp.getSalary();
			double increment=(percentage * salary)/100;
			double totalSal=salary+increment;
			e= new Employee();
			e = modelMapper.map(emp, Employee.class);
			e.setSalary((new Double(totalSal)).longValue());
			empRepo.save(e);
			requestList.add(e);
		}
		return requestList;
	}

	@Override
	public List<Employee> findEmployeeByPlace(String place, int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return empRepo.findEmployeeByPlace(place, pageable);
		
	}

	@Override
	public String getSalaryRange(String competency) {
		
		Long min= empRepo.findMinSalary(competency);
		Long max= empRepo.findMaxSalary(competency);
		String range = "salary for"+" "+competency+" "+"lies between"+" "+ min+" "+"and"+" " + max;
		return range;
	}

}
