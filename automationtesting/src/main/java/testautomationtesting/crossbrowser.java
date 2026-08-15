package testautomationtesting;
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class crossbrowser {

	    WebDriver driver;

	    public static void main(String[] args) {

	        crossbrowser ob = new crossbrowser();

	        // Chrome
	        ob.driver = new ChromeDriver();
	        ob.driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("Chrome Title: " + ob.driver.getTitle());
	        

	        // Edge
	        ob.driver = new EdgeDriver();
	        ob.driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("Edge Title: " + ob.driver.getTitle());
	        
	    }
	}

