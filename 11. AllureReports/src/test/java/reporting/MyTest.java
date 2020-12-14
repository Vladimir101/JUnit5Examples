package reporting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Login Tests Epic")
@Feature("Invalid Login Features")
class MyTest
{
	@Test
	@Story("User tries to login the system with empty username and invalid password.")
	@Description("This is my test to verify Allure reports")
	void test()
	{
		assertTrue(true);
	}
}
