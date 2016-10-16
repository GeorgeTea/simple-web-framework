package com.gl.learnTDD.finance;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void testDollarMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollar(1).getCurrency());
		assertEquals("CHF", Money.franc(1).getCurrency());
	}
	
	@Test
	public void testDifferentClassEquality(){
		assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
	}
	
	@Test
	public void testSimpleAddition(){
		Expression sum = Money.dollar(5).plus(Money.franc(10));
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(reduced, Money.dollar(10));
	}
	
}
