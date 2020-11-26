package com.demo.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "EMPLOYEE")
@Entity
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private String title;
	private String businessUnit;
	private String place;
	private String supervisorId;
	private String competencies;
	private Long salary;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEEID")
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	@Column(name = "EMPLOYEENAME")
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Column(name = "TITLE")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "BUSINESSUNIT")
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	@Column(name = "PLACE")
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Column(name = "SUPERVISORID")
	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	
	@Column(name = "COMPETENCIES")
	public String getCompetencies() {
		return competencies;
	}
	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}
	
	@Column(name = "SALARY")
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
}
