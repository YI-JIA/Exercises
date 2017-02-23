package org.coding.appier;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CommonUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKthPower() {
		int base = 3;
		for (int value : Arrays.asList(1, 3, 6, 9, 27, 30))
			CommonUtils.kthPower(value, base);
	}

}
