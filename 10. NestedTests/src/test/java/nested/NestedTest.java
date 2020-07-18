package nested;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

// examples by Philip Riecks
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