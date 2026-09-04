package testautomationtesting;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {

	@Test
	void hardassertion() {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://unipune.ac.in/?ios/?play=pg");
		String expected_title="savitribai phule university";
		String actual_title=driver.getTitle();
		Assert.assertEquals(expected_title,actual_title);
		System.out.println("hard assertion: automation script continues");
	}
	@Test(priority=2)
	void softassertion() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://unipune.ac.in/?ios/?play=pg");
		String expected_title="savitribai phule university";
		String actual_title=driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual_title, expected_title);
		
		System.out.println("Soft assertion:automation script continues");
		sa.assertAll();
	}
}
