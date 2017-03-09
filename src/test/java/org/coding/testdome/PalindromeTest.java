package org.coding.testdome;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(Palindrome.isPalindrome("Deleveled"));
		assertTrue(Palindrome.isPalindrome("Delevveled"));
	}

}
