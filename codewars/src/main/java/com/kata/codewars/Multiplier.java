package com.kata.codewars;

import java.math.BigDecimal;

public class Multiplier {
	public static long multiply(long a, long b) {
		return BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)).longValueExact();
	}
}
