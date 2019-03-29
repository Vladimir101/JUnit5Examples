package com.junit5.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class AlphanumericOrder
{
	@Test
	void btest()
	{
		System.out.println("btest");
	}
	
	@Test
	void atest()
	{
		System.out.println("atest");
	}
	
	@Test
	void ytest()
	{
		System.out.println("ytest");
	}
	
	@Test
	void xtest()
	{
		System.out.println("xtest");
	}
}
