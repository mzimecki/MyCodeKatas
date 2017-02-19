package com.kata.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfMissingArrayTest {
	
	@Test
	public void should_return_proper_number_of_missing_array() {
		assertEquals(3, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 },
				new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 } }));
		assertEquals(2, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 },
				new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 } }));
		assertEquals(2, LengthOfMissingArray
				.getLengthOfMissingArray(new Object[][] { new Object[] { null }, new Object[] { null, null, null } }));
		assertEquals(5,
				LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { 'a', 'a', 'a' }, new Object[] { 'a', 'a' },
						new Object[] { 'a', 'a', 'a', 'a' }, new Object[] { 'a' },
						new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' } }));

		assertEquals(0, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] {}));
		assertEquals(0, LengthOfMissingArray.getLengthOfMissingArray(null));
	}
}
