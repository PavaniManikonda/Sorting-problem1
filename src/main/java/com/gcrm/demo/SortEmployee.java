package com.gcrm.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SortEmployee {

	public static void main(String[] args) {
		SpringApplication.run(SortEmployee.class, args);
		List<Employee> empList=new ArrayList<Employee>();
		
		List<Employee> sortedEmpList=new ArrayList<Employee>();
		
		empList.add(new Employee("Jhon",5));
		empList.add(new Employee("peter",20));
		empList.add(new Employee("Ankit",50));
		empList.add(new Employee("suhit",40));
		empList.add(new Employee("Basheer",60));
		empList.add(new Employee("Satish",10));
		
		//Sortted list  based on Age
		Collections.sort(empList);
		System.out.println("Sorted Employee List Based on Age \n" +empList);
		//Sorted list  of the employee based on age then by Name
		empList.sort(new EmployeeComparator());
		System.out.println("Sorted Employee List Based on Age then By Name \n"+empList);
		
		//Final Sorted list  of the employee based on age then by Name and also age>=10
		sortedEmpList=empList.stream().filter(emp->!(emp.getAge()<10)).collect(Collectors.toList());
		
		System.out.println("Sorted Employee List Based on Age then By Name and also age >10 \n"+sortedEmpList);
		
	}

	
}
