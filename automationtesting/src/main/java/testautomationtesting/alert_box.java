package testautomationtesting;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert_box {
	ChromeDriver driver;
	Alert al;
	public static void main(String[] args) throws InterruptedException{
	alert_box a=new alert_box();
	a.launch_setup();
	System.out.println("---------------chrome browser launch and website opened-----------");
	a.simplealert();
	System.out.println("---------------simple alert handled-----------");
	a.confirmalertt();
	System.out.println("---------------confirm alert handled-----------");
	a.promptalert();
	System.out.println("---------------prompt alert handled-----------");
	}

void launch_setup() {
	driver= new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
}
void promptalert() {
	driver.findElement(By.id("promptBtn")).click();
	al=driver.switchTo().alert();
	System.out.println("prompt"+al.getText());
	al.sendKeys("pratham");
	al.accept();
}
void confirmalertt() throws InterruptedException {
	driver.findElement(By.id("confirmBtn")).click();
	al=driver.switchTo().alert();
	System.out.println(al.getText());
	Thread.sleep(1000);
	al.dismiss();
}
void simplealert() throws InterruptedException {
	driver.findElement(By.id("alertBtn")).click();
	Alert al=driver.switchTo().alert();//alert interface used to handle alert box
	System.out.println(al.getText());//get the text from alert box
	Thread.sleep(1000);
	al.accept();
}
}