package com.shoeb.HibernateStorage;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity(name-"entityname")
//Table(name"OnlyTable")
//@Column(name"")
//@Transient will not store
@Entity

public class Employee {


	@Id
	private int empID;

	private String empName;
	private String empDep;
	private double Salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDep() {
		return empDep;
	}
	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empDep=" + empDep + ", Salary=" + Salary + "]";
	}

	
	
}
