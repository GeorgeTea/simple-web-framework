package com.gl.learnTDD.finance;

public abstract class Money {
	
	protected int amount;
	protected String currency;
	
	abstract Money times(int multiplier);
	
	static Money dollar(int amount){
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount){
		return new Franc(amount, "CHF");
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
		return amount == money.getAmount() && getClass().equals(money.getClass());
	}

}
