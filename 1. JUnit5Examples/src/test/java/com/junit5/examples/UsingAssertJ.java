package com.junit5.examples;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class UsingAssertJ
{
	private String name = "Vladimir";
	private List<String> list = Arrays.asList("1", "2", "3");
	private Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
	
	@Test
	void stringTest()
	{
		assertThat(name).isEqualTo("Vladimir");
		assertThat(name).as("testing name").isNotEqualTo("Vlad");		
	}
	
	@Test
	void listTest()
	{
		assertThat(list)
		  .isNotEmpty()
		  .contains("1")
		  .containsSequence("2", "3")
		  .doesNotContain("13");
	}
	
	@Test
	void mapTest()
	{
		assertThat(map)
		  .isNotEmpty()
		  .containsKey("One")
		  .doesNotContainKeys("Ten")
		  .contains(entry("Three", 3));
	}
}
