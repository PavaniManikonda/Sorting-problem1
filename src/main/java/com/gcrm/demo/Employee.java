package com.gcrm.demo;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return " Employee [name=" + name + ", age=" + age + "]"+"\n";
	}

	@Override
	public int compareTo(Employee o) {
		
		int compare=0;
		if(this.age>o.getAge()) {
			compare=1;
		}else if(this.age<o.getAge()){
			compare=-1;
		}else {
			return compare;
		}
		
		return  compare;
	}


	
	
	
}
