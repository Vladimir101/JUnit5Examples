package com.junit5.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExplicitOrder
{
	@Order(2)
	@Test
	void test1()
	{
		System.out.println("test1 - order 2");
	}
	
	@Order(1)
	@Test
	void test2()
	{
		System.out.println("test2 - order 1");
	}
	
	@Order(3)
	@Test
	void test3()
	{
		System.out.println("test3 - order 3");
	}
}
