package com.junit5.repetitions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class RepeatedTests
{
	@DisplayName("repeat test")
	@RepeatedTest(value = 2, name = "{displayName}: repetition {currentRepetition} of {totalRepetitions}")
	void repeatTest(TestInfo testInfo)
	{
		System.out.println("This is the name of the test: " + testInfo.getDisplayName());
	}
}
