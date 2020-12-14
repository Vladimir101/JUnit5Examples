package reporting;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;

@Epic("Login Tests Epic")
class Test1
{
	@Test
	@Story("This is a Fail Story.")
    @Description("This is a Fail Story Description.")
	void test()
	{
		boolean a = true;
		assertThat(a).isTrue();
	}
}
