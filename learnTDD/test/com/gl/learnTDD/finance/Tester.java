package com.gl.learnTDD.finance;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
