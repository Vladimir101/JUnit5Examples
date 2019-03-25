package com.junit5.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static java.time.Duration.*;
class AssertionsJUnit5
{
	@DisplayName("standard assertions")
	@Test
	void test()
	{
		assertEquals(2, 1 + 1, "sum 1 + 1 must be 2");
		assertTrue(3 > 1);
		assertFalse(1 > 11, "if 1 greater than 11");
	}
	
	@Test
	void timeoutTest()
	{
		 assertTimeout(ofMillis(10), 
				 () -> {Thread.sleep(100);});
	}
}
