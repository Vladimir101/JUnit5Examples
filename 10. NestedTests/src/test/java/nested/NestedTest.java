package nested;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

// examples by Philip Riecks
// You can use this feature to group tests that verify common functionality. 
// This does not only improves maintainability but also reduces the time 
// to understand what the class under test is responsible for
public class NestedTest
{
	@Nested
	@DisplayName("Testing division functionality")
	class DivisionTests
	{
		@Test
		public void shouldDivideByTwo()
		{
			assertEquals(4, 8 / 2);
		}

		@Test
		public void shouldThrowExceptionForDivideByZero()
		{
			assertThrows(ArithmeticException.class, () -> 
			{
				int result = 8 / 0;
			});
		}
	}

	@Nested
	@DisplayName("Testing addition functionality")
	class AdditionTests
	{
		@Test
		public void shouldAddTwo()
		{
			assertEquals(4, 2 + 2);
		}

		@Test
		public void shouldAddZero()
		{
			assertEquals(2, 2 + 0);
		}
	}
}