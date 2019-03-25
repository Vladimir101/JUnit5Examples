package com.junit5.tagging;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("development")
class DevelopmentTests
{
	@Tag("slow")
	@Test
	void slowTest1()
	{
		System.out.println("slow test1");
	}
	
	@Tag("slow")
	@Test
	void slowTest2()
	{
		System.out.println("slow test2");
	}
	
	@Test
	void slowTest3()
	{
		System.out.println("slow test3");
	}
	
	@Tag("fast")
	@Test
	void fastTest()
	{
		System.out.println("fast test");
	}
}
