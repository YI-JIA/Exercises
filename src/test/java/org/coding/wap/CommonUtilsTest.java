package org.coding.wap;

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
	public void testFetchMaxLengthOfAscendingNumbers() {
		for (String value : Arrays.asList("12301216789", "12316789012", "16789123012"))
			System.out.println(CommonUtils.fetchMaxLengthOfAscendingNumbers(value));
	}

}
