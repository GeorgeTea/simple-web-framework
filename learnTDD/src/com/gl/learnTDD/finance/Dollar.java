package com.gl.learnTDD.finance;

public class Dollar extends Money{
	
	Dollar(int amount, String currency){
		super(amount, currency);
		this.amount = amount;
		this.currency = currency;
	}
	
}
