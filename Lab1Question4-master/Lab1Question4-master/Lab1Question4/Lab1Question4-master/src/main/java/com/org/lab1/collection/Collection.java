package com.org.lab1.collection;

import java.util.ArrayList;
import java.util.List;
import com.org.lab1.employee.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Collection {

	private List<Employee> empList= new ArrayList<Employee>();
	
	@Bean
	public List<Employee> getEmpList()
	{
		empList.add(new Employee(1000, "Rajat",780000.0));
		empList.add(new Employee(1001,"Rastogi",15000.0));
		empList.add(new Employee(1002,"kanha", 30000.0));
		empList.add(new Employee(1003,"yadav",35000.0));
		
		return empList;
	}
}
