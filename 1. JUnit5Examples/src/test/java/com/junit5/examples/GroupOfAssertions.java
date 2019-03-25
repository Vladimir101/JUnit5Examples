package com.junit5.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupOfAssertions
{
	@Test
	void test()
	{
		int value = 4;
		assertAll(
			      "example of assertAll",
			      () -> assertEquals(value, 2 * 2, "4 is 2 times 2"),
			      () -> assertEquals("java", "JAVA".toLowerCase()),
			      () -> assertNotEquals(0, value, "value cannot be 0"),
			      () -> assertTrue(value != 4, "value is 4")
			    );
	}
}
