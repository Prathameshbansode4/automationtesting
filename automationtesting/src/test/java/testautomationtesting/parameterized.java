package testautomationtesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized {

	@Parameters({"num1","num2"})
	@Test
	void add(int a, int b) {
		System.out.println("addition is"+(a+b));
	}
}
