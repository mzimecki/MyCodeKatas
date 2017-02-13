package com.kata.codewars;

/**
 * Create a method named "rotate" that returns a given array 
 * with the elements inside the array rotated n spaces.
 *
 * If n is greater than 0 it should rotate the array to the right. 
 * If n is less than 0 it should rotate the array to the left. If n is 0, 
 * then it should return the array unchanged.
 * 
 * @author M. Zimecki - implementation
 */
public class Rotator {

	public Object[] rotate(Object[] data, int n) {
		for (int i = 0; i < Math.abs(n); i++) {
			if (n > 0) {
				data = rotateRightByOne(data);
			} else {
				data = rotateLeftByOne(data);
			}
		}
		return data;
	}

	public static Object[] rotateLeftByOne(Object[] data) {
		final Object tmp = data[0];
		for (int i = 0; i < data.length - 1; i++) {
			data[i] = data[i + 1];
		}
		data[data.length - 1] = tmp;
		return data;
	}

	public static Object[] rotateRightByOne(Object[] data) {
		final Object tmp = data[data.length - 1];
		for (int i = data.length - 1; i > 0; i--) {
			data[i] = data[i - 1];
		}
		data[0] = tmp;
		return data;
	}
}
