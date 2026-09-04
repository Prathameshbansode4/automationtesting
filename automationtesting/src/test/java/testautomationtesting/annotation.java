package testautomationtesting;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class annotation {

	@AfterTest
	void AfterTest() {
		System.out.println("aftertest");
	}
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("beforemethod");
	}
	
	@AfterSuite
	void Aftersuite() {
		System.out.println("aftersuite");
	}
	
	@Test
	void Test() {
		System.out.println("Test");
	}
	
	@BeforeTest
	void Beforetest() {
		System.out.println("BeforeTest");
	}
	
	@AfterClass
	void Afterclass() {
		System.out.println("Afterclass");
	}
	
	@AfterMethod
	void Aftermethod() {
		System.out.println("Aftermethod");
	}
	
	@BeforeClass
	void Beforeclass() {
		System.out.println("Beforeclass");
	}
	
	@BeforeSuite
	void Beforesuite() {
		System.out.println("Beforesuite");
	}
}
