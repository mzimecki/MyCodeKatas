package com.kata.codewars;

public class Money {
	
	public static int calculateYears(double principal, double interest, double tax, double desired) {
		if (principal >= desired) {
			return 0;
		}
		
		int years = 1;
		double result = principal + principal * interest - principal * interest * tax;
		
		while (result < desired) {
			result += result * interest - result * interest * tax;
			years++;
		}
		
		return years;
	}
}
