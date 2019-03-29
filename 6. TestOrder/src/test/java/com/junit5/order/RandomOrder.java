package com.junit5.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
class RandomOrder
{
	@Test
	void atest()
	{
		System.out.println("atest");
	}

	@Test
	void btest()
	{
		System.out.println("btest");
	}
	
	@Test
	void ctest()
	{
		System.out.println("ctest");
	}
}
