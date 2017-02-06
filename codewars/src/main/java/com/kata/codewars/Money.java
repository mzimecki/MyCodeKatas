package com.kata.codewars;

/**
 * Mr. Scrooge has a sum of money 'P' that wants to invest, and he wants to know how many years 'Y' 
 * this sum has to be kept in the bank in order for this sum of money to amount to 'D'.
 * The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly, 
 * and the new sum is re-invested yearly after paying tax 'T'.
 * Note that the principal is not taxed but only the year's accrued interest
 * 
 * @author M. Zimecki
 */
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
