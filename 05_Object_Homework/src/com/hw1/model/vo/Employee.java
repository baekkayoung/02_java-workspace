package com.hw1.model.vo;

public class Employee {

	
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	public Employee() {}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee(int empNo, String empName, int age, char gender, String phone, String address,
					int salary, double bonusPoint, String dept, String job) {
		this(empNo, empName, age, gender, phone, address);
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.dept = dept;
		this.job = job;
		
		
	}
	

	

	// 세터
	
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	// 게터
	
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getBonusPoint() {
		return bonusPoint;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getJob() {
		return job;
	}
	
	
	
	
	

	


	public String information() {
		return  "emp["  + empNo + "]: " + empNo + " , "  + empName + ", " + dept + ", " + job + ", " + age + ", " + gender + ", " + salary + ", " + bonusPoint+ ", "  + phone + ", " + address; 
	}

	
	
	
}
