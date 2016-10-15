package com.gl.learnTDD.finance;

public class Money {
	
	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	Money times(int multiplier){
		return new Money(amount * multiplier, currency);
	}
	
	static Money dollar(int amount){
		return new Money(amount, "USD");
	}
	
	static Money franc(int amount){
		return new Money(amount, "CHF");
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getCurrency(){
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return this.amount == money.getAmount() && this.currency.equals(money.getCurrency());
	}

}
