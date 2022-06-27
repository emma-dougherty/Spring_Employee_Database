package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createEmployee(){
		Employee eric = new Employee("Eric",36, 74201, "eric@gmail.com");
		employeeRepository.save(eric);
	}

}
