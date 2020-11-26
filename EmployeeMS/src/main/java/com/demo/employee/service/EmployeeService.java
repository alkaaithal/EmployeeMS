package com.demo.employee.service;

import java.util.List;

import com.demo.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> increaseSalary(String place, int percentage);

	List<Employee> findEmployeeByPlace(String place, int pageNo, int pageSize);

	String getSalaryRange(String competency);

}
