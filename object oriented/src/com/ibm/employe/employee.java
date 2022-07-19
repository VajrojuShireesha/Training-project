package com.ibm.employe;

public class employee {
	private int empNo;
	private String empName;
	private double salary;
	

	public employee() {
			// TODO Auto-generated constructor stub
	}
	public employee(int empNo, String empName, double salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void payslip() {
		System.out.println("EMPNBR: " + empNo);
		System.out.println("EMPname: " + empName);
		System.out.println("SALARY: " + salary);

		
	}

}
