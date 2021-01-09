package com.example.demo.model;

public class EmployeeModel {

	private Integer empId;
	private String ename;
	private Double salary;
	public EmployeeModel() {
		super();
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
