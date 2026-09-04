package testautomationtesting;

import org.testng.annotations.Test;

public class priorityintesting {

	@Test
	void abc() (groups ="smoketest"){
		System.out.println("st case passed");
	}
	
	@Test
	void bc()(groups ="smoketest") {
		System.out.println("nd case passed");
	}
	
	@Test
	void c()(groups ="sanitytest") {
		System.out.println("rd case passed");
	}
}
