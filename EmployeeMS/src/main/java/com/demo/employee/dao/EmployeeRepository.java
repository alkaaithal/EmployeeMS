package com.demo.employee.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("select a from Employee a where a.place=:place")
	List<Employee> findEmployeeByPlace(@Param("place") String place, Pageable pageable);
	
	@Query("select a from Employee a where a.place=:place")
	List<Employee> findSalaryByPlace(@Param("place") String place);
	
	@Query("select MIN(a.salary) from Employee a where a.competencies=:competencies")
	Long findMinSalary(@Param("competencies") String competencies);
	
	@Query("select MAX(a.salary) from Employee a where a.competencies=:competencies")
	Long findMaxSalary(@Param("competencies") String competencies);


}
