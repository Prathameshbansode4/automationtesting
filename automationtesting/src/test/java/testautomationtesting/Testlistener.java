package testautomationtesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlistener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test Started");
	  }

	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test Skipped");
		  
		  TakesScreenshot ts = (TakesScreenshot) Basetest.driver;

	        File source = ts.getScreenshotAs(OutputType.FILE);

	        File destination = new File(
	        		"C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\screenshots\\skipped.png");

	        try {
	            FileUtils.copyFile(source, destination);

	            System.out.println("Screenshot Captured Successfully");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
		  }
	  
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("Test Finished");
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Success");
		  }


    
    public void onTestFailure(ITestResult result) {

        TakesScreenshot ts = (TakesScreenshot) Basetest.driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(
        		"C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\screenshots\\fail.png");

        try {
            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot Captured Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}