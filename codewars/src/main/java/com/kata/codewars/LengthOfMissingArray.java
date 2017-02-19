package com.kata.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You get an array of arrays.
 * If you sort the arrays by their length, you will see, that their length-values are consecutive.
 * But one array is missing!
 * You have to write a method, that return the length of the missing array.
 * Example:
 * [[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3
 * If the array of arrays is null/nil or empty, the method should return 0.
 * When an array in the array is null or empty, the method should return 0 too!
 * There will always be a missing element and its length will be always between the given arrays. 
 * 
 * @author M. Zimecki - implementation
 */
public class LengthOfMissingArray {
	
	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
		return findMissinArrayLength(arrayOfArrays);
	}

	private static int findMissinArrayLength(final Object[][] arrayOfArrays) {
		final List<Integer> sortedLengthsOfArrays = getSumOfArraysLengths(arrayOfArrays);
		if (sortedLengthsOfArrays.isEmpty()) {
			return 0;
		}

		int j = sortedLengthsOfArrays.get(0);
		for (int arrayLength : sortedLengthsOfArrays) {
			if (arrayLength != j) {
				return j;
			}
			j++;
		}
		return 0;
	}

	private static List<Integer> getSumOfArraysLengths(Object[][] arrayOfArrays) {
		if (isArrayNullOrEmpty(arrayOfArrays) || containsNullArrayOrEmpty(arrayOfArrays)) {
			return Collections.emptyList();
		}
		return Arrays.stream(arrayOfArrays)
					.map(x -> x.length)
					.sorted()
					.collect(Collectors.toList()); 
	}
	
	private static boolean containsNullArrayOrEmpty(Object[][] arrayOfArrays) {
		return Arrays.stream(arrayOfArrays)
				.anyMatch(array -> array == null || array.length == 0);
	}

	private static boolean isArrayNullOrEmpty(Object[][] arrayOfArrays) {
		return arrayOfArrays == null || arrayOfArrays.length == 0; 
	}
}
