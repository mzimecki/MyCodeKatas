package com.kata.codewars;

public class Money {
	
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		int years = 0;
		while (principal < desired) {
			principal += principal * interest - principal * interest * tax;
			years++;
		}
		return years;
	}
}
