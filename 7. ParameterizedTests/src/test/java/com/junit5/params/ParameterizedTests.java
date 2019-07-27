package com.junit5.params;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTests
{
// 1	
	@ParameterizedTest(name = "print palindromes")
	@ValueSource(strings = { "racecar", "radar", "Madam Im Adam" })
	void valueSourceAsStrings(String candidate)
	{
		System.out.println(candidate);
	}

// 2	
	@ParameterizedTest
	@ValueSource(ints = { 24, 66, 99 })
	void valueSourceAsInts(int argument)
	{
		assertTrue(argument > 0 && argument < 101);
	}

// 3	
	@DisplayName("pair of strings") 
	@ParameterizedTest
	@CsvSource({"abc, def", "no password,", ",no username"})
	void csvWithComma(String username, String password)
	{
		System.out.println("Username: " + username + ", Password: " + password);
	}

// 4	
	@ParameterizedTest
	@CsvSource(value = {"test:1", "test:2", "test:3"}, delimiter = ':')
	void csvWithDelimiter(String key, int value)
	{
		System.out.println(key + ":" + value);
	}
	
// 5
	@ParameterizedTest
	@CsvFileSource(resources = "ddt.csv", numLinesToSkip = 1)
	void ddtTest(int test, String name, String expected) 
	{
		System.out.println(test + " " + name + " " + expected);
	}
}
