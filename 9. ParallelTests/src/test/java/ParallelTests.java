import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

/*There are multiple ways to set these configuration values, 
 * one is to use the Maven Surefire plugin for it:

<plugin>
  <artifactId>maven-surefire-plugin</artifactId>
  <version>2.22.2</version>
  <configuration>
    <properties>
      <configurationParameters>
        junit.jupiter.execution.parallel.enabled = true
        junit.jupiter.execution.parallel.mode.default = concurrent
      </configurationParameters>
    </properties>
  </configuration>
</plugin>

* or a junit-platform.properties file inside src/test/resources 
* with the configuration values as content.*/
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
