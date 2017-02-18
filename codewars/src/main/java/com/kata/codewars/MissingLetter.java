package com.kata.codewars;

/**
 * Write a method that takes an array of consecutive (increasing) 
 * letters as input and that returns the missing letter in the array.
 * You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 * 
 * @author M. Zimecki - implementation
 */
public class MissingLetter {
	
	public static char findMissingLetter(char[] array) {
		int startValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] != ++startValue) {
				return (char)startValue;
			}
		}
		return ' ';
	}
}
