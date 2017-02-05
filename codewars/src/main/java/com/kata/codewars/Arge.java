package com.kata.codewars;

public class Arge {
	
	public static int nbYear(int p0, double percent, int aug, int p) {
		double result = p0 + p0 * (percent / 100) + aug;
		int years = 1;
		while (result < p) {
			result = result + result * (percent / 100.0) + aug;
			years++;
		}
		return years;
    }
}
