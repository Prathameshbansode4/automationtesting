package testautomationtesting;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handle {
	ChromeDriver driver;
	public static void main(String[] args) {
		window_handle wh= new window_handle();
		wh.launch();
		wh.tab();
		wh.window();
	}
	void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	void tab() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.goibibo.com/");
	}
	void window() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
	}
}
