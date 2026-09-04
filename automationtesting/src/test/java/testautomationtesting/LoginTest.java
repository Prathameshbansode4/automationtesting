package testautomationtesting;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginTest {

	
	    @Test
	    public void loginTest() {
	        System.out.println("Login Test");
	    }
	}

