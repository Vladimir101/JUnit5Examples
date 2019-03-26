package com.junit5.tagging;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("production")
class ProductionTests
{
	@Test
	void testInProduction()
	{
		System.out.println("test in production");
	}
}
