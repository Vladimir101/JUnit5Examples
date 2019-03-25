package com.junit5.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UsingTags
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
