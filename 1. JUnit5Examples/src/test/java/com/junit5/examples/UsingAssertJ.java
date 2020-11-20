package com.junit5.examples;

/*To simplify the usage of the AssertJ assertThat statement in the Eclipse IDE 
 * go to Window -> Preferences -> Java  Editor -> Content assist  
 * -> Favorites -> New Type, 
 * enter org.assertj.core.api.Assertions and confirm.
 * You should see org.assertj.core.api.Assertions.* in the list.*/

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
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
	
	@Test
	public void softTest()
	{
		SoftAssertions softly = new SoftAssertions();
		String name = "Vladimir B";
		softly.assertThat(name)
			.startsWith("Vlad")
			.contains("B");
		
		softly.assertAll();
	}
	
	@Test
	void softTest2()
	{	
		assertSoftly(softly -> 		// add static import
		{
			  softly.assertThat(name)
					.startsWith("Tony")
					.contains("B");
// no need to call assertAll(), assertSoftly does it for us.			
		});
	}
}
