package com.news;
import jakarta.persistence.*;
@Entity
@DiscriminatorValue(value="regular")
public class REgEmployee extends Employee{

	float salary;
	String dept;
	public REgEmployee(float salary, String dept,String name) {
		super(name);
		this.salary = salary;
		this.dept = dept;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
