package com.junit5.repetitions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

class RepeatedTests
{
	@DisplayName("test with the default displayName")
	@RepeatedTest(value = 2, name = "{displayName}")//: repetition {currentRepetition} of {totalRepetitions}")
	void repeatedTest(TestInfo testInfo)
	{
		System.out.println("repeatedTest name: " + testInfo.getDisplayName());
	}
	
	@DisplayName("test with the long displayName")
	@RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
	void repeatedTestWithLongName(TestInfo testInfo)
	{
		System.out.println("repeatedTestWithLongName name: " + testInfo.getDisplayName());
	}
	
	@DisplayName("test with the short displayName")
	@RepeatedTest(value = 2, name = RepeatedTest.SHORT_DISPLAY_NAME)
	void repeatedTestWithShortName(TestInfo testInfo)
	{
		System.out.println("repeatedTestWithShortName name: " + testInfo.getDisplayName());
	}
}
