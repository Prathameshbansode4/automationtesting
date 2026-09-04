package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	public static void main(String[] args) {
		launch l=new launch();
		l.lauch();
	}
	void lauch(){
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		//driver.findElement(By.xpath("//span[text()='sin']")).click();            //sin0=0
		//driver.findElement(By.xpath("//span[text()='0']")).click();
		
//		driver.findElement(By.xpath("//span[text()='1']")).click();
//		driver.findElement(By.xpath("//span[text()='+']")).click();               //addition of two no
//		driver.findElement(By.xpath("//span[text()='2']")).click();
		
		
//		driver.findElement(By.xpath("//span[text()='9']")).click();
//		driver.findElement(By.xpath("//span[text()='–']")).click();               //sub of three no
//		driver.findElement(By.xpath("//span[text()='1']")).click();
//		driver.findElement(By.xpath("//span[text()='–']")).click();               
//		driver.findElement(By.xpath("//span[text()='8']")).click();
//		
//		driver.findElement(By.xpath("//span[text()='9']")).click();
//		driver.findElement(By.xpath("//span[text()='×']")).click();               //multiply of three no
//		driver.findElement(By.xpath("//span[text()='1']")).click();
//		driver.findElement(By.xpath("//span[text()='×']")).click();               
//		driver.findElement(By.xpath("//span[text()='8']")).click();
//		driver.findElement(By.xpath("//span[text()='×']")).click(); 
//		driver.findElement(By.xpath("//span[text()='7']")).click(); 
		
		driver.findElement(By.xpath("//span[text()='9']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click();               //div of three no
		driver.findElement(By.xpath("//span[text()='1']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click();               
		driver.findElement(By.xpath("//span[text()='3']")).click();
		driver.findElement(By.xpath("//span[text()='/']")).click(); 
		driver.findElement(By.xpath("//span[text()='3']")).click(); 
	}
	
}
