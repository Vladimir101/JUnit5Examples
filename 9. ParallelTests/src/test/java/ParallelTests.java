import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
class ParallelTests
{
	@Test
	void test1() throws InterruptedException
	{
		System.out.println("1");
		Thread.sleep(10000);
	}
	
	@Test
	void test2() throws InterruptedException
	{
		System.out.println("2");
		Thread.sleep(10000);
	}
}
