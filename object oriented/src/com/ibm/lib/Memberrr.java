package com.ibm.lib;

public class Memberrr {
	private String name;
	private Boookk bk;
	

	public Memberrr(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBk(Boookk bk) {
		this.bk = bk;
	}
	public void status() {
		if(bk == null)
			System.out.println(name + "is not issued by any book");
		else
			System.out.println(name + "has issued " + bk.getTitle());
		// TODO Auto-generated method stub
	}
	

	}


