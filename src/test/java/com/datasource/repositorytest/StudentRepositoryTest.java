package com.datasource.repositorytest;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.datasource.entity.Student;
import com.datasource.respository.StudentRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class StudentRepositoryTest {

	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void StudentRepoTest(){
		List<Student> studentList = studentRepository.findAll();
		Assert.assertNotNull(studentList);
		Assert.assertEquals(3, studentList.size());
	}
	
}
