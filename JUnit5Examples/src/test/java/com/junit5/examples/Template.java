package com.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class Template
{
	@BeforeAll
	static void setUpBeforeClass()
	{
		System.out.println("@BeforeAll - oneTimeSetUp");
	}
	
	@BeforeEach
	void setUp()
	{
		System.out.println("@BeforeEach - setUp");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}

	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Disabled
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterEach
	void tearDown()
	{
		System.out.println("@AfterEach - tearDown");
	}
	
	@AfterAll
	static void tearDownAfterClass()
	{
		System.out.println("@AfterAll - oneTimeTearDown");
	}
}
