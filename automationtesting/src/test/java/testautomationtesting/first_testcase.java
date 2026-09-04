package testautomationtesting;

import org.testng.annotations.Test;

public class first_testcase {

	
	
	
	
	@Test
	void xyz()(groups ="smoketest") {
		System.out.println("first case passed");
	}
	
	@Test
	void z()(groups ="sanitytest") {
		System.out.println("second case passed");
	}
	
	@Test
	void yz()(groups ="smoketest") {
		System.out.println("third case passed");
	}
	
}
