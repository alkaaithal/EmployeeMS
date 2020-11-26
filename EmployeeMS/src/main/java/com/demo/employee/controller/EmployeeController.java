package com.demo.employee.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.entity.Employee;
import com.demo.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@RequestMapping(value = "/getEmployee/{place}", method = { RequestMethod.GET })
	@ResponseBody
	public List<Employee> getEmployees(@PathVariable(value= "place") String place, @RequestParam(defaultValue = "0") Integer pageNo, 
            @RequestParam(defaultValue = "5") Integer pageSize) {
		LOGGER.info("Get EMPLOYEE by place ...", place);
	        return employeeService.findEmployeeByPlace(place,pageNo, pageSize);
		
}
	
	@RequestMapping(value = "/employee/place/{place}/salary/{percentage}", method = { RequestMethod.PUT }, produces = { "application/json" })
	@ResponseBody
	public ResponseEntity<?> salaryIncrease(@PathVariable("place") String place, @PathVariable("percentage") int percentage) {
		LOGGER.info("CONTROLLER : Inside Increase Salary API ...");

			List<Employee> e= employeeService.increaseSalary(place, percentage);
			
			return ResponseEntity.ok(e);
		
}
	
	@RequestMapping(value = "/getSalaryRange/{competency}", method = { RequestMethod.GET })
	@ResponseBody
	public String getSalaryRange(@PathVariable(value= "competency") String competency) {
		LOGGER.info("Get EMPLOYEE by place ...", competency);
	        return employeeService.getSalaryRange(competency);
		
}	
}
