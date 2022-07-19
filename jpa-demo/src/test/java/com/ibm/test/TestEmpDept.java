package com.ibm.test;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new EmpDeptDao();
	}
	
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptNo(10);
		dept.setDeptName("sales");
		dao.addDept(dept);
	}
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpName("polo");
		emp.setSalary(5000);
		dao.addEmp(emp, 10);
	}
	
	@Test
	public void testFindDept() {
		Department dpet = dao.findDept(10);
		System.out.println(dpet);
		dpet.getEmps().forEach(System.out::println);
	}
	

}
