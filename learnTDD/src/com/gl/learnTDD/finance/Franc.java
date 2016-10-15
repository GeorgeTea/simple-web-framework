package com.gl.learnTDD.finance;

public class Franc extends Money {

	Franc(int amount, String currency) {
		super(amount, currency);
		this.amount = amount;
		this.currency = currency;
	}

}
