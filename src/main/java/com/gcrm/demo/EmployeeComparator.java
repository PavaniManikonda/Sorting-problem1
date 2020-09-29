package com.gcrm.demo;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		int compare=0;
		
		compare=o1.getName().compareTo(o2.getName());
		
		return compare;
	}

}
