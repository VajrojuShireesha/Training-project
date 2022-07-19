package com.ibm.employe;

public class Manager extends employee {

	private double commission;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empNo, String empName, double salary, double commission) {
		super(empNo, empName, salary);
		this.commission = commission;
	
	}

	@Override
	public double getsalary() {
		// TODO Auto-generated method stub
		return super.getsalary() + commission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("commission:" + commission);

	}
	

}
