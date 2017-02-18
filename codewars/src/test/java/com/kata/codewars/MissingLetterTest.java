package com.kata.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingLetterTest {
	@Test
    public void should_return_missing_letter() {
        assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('d', MissingLetter.findMissingLetter(new char[] { 'c','e' }));
        assertEquals(' ', MissingLetter.findMissingLetter(new char[] { 'Q','R','S' }));
    }
}
