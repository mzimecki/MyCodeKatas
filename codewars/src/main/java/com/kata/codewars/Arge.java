package com.kata.codewars;

/**
 * In a small town the population is p0 = 1000 at the beginning of a year. 
 * The population regularly increases by 2 percent per year and moreover 50 new inhabitants 
 * per year come to live in the town. How many years does the town need to see its 
 * population greater or equal to p = 1200 inhabitants?
 * 
 * @author M. Zimecki - implementation
 */
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
