package com.junit5.assumptions;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

class AssumptionsTest
{
	@Test
	void assumeTrueTest1()
	{
		assumeTrue(2 == 1 + 1);
		System.out.println("assumeTrueTest1: Print if assumeTrue is true");
	}

	@Test
	void assumeTrueTest2()
	{
		assumeTrue(1 == 1 + 1);
		System.out.println("assumeTrueTest2: Print if assumeTrue is true");
	}

	@Test
	void assumeFalseTest()
	{
		assumeFalse(1 == 1 + 1);
		System.out.println("assumeFalseTest: Print if assumeFalse is false");
	}

	@Test
	void assumingThatTest()
	{
		String someString = "Just a string";
		assumingThat(someString.equals("Just a string"), // condition
				() -> {
						// Execute this if assumption is true...
						System.out.println("assumeThatTest: Print if assumingThat is true");
					  });
	}
}
