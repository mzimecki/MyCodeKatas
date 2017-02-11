package com.kata.codewars;

import java.util.Arrays;
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
		if (isArrayEmpty(arrayOfArrays)) {
			return 0;
		}

		final List<Integer> sortedLengthsOfArrays = getSortedArraysLengths(arrayOfArrays);

		if (containsZeroLength(sortedLengthsOfArrays)) {
			return 0;
		}

		return findMissinArrayLength(sortedLengthsOfArrays);
	}

	private static int findMissinArrayLength(final List<Integer> sortedLengthsOfArrays) {
		int j = sortedLengthsOfArrays.get(0);
		for (int arrayLength : sortedLengthsOfArrays) {
			if (arrayLength != j) {
				return j;
			}
			j++;
		}
		return 0;
	}

	private static boolean containsZeroLength(List<Integer> sortedLengthsOfArrays) {
		return sortedLengthsOfArrays.get(0) == 0;
	}

	private static List<Integer> getSortedArraysLengths(Object[][] arrayOfArrays) {
		return Arrays.stream(arrayOfArrays)
				.map(x -> x != null ? x.length : 0)
				.sorted()
				.collect(Collectors.toList());
	}

	private static boolean isArrayEmpty(Object[][] arrayOfArrays) {
		return arrayOfArrays == null || arrayOfArrays.length == 0;
	}
}
