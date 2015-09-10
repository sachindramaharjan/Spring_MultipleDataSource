package com.datasource.repositorytest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.datasource.entitylegacy.Employee;
import com.datasource.respositoryLegacy.EmployeeRepository;

public class EmployeeRepositoryTest extends BaseClass {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void employeeTest(){
		Employee employee = employeeRepository.findOne(1);
		Assert.assertNotNull(employee);
		Assert.assertEquals(1, employee.getId());
		Assert.assertEquals("Sachindra", employee.getName());
		
	}	
}
