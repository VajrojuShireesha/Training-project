package com.ibm.bank;

public class BalanceExeption extends Exception {

	public BalanceExeption() {
	}

	public BalanceExeption(String message) {
		super(message);
	}
}