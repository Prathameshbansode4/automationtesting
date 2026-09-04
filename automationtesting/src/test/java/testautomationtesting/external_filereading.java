package testautomationtesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;

public class external_filereading {

	
	void testfilered() throws IOException {
		FileReader fr=new FileReader("C:\\Users\\PRATHAM\\git\\repository\\automationtesting\\base.properties");
		
		Properties pr= new Properties();
		pr.load(fr);
		EdgeDriver driver=new EdgeDriver();
		driver.get(pr.getProperty("orangehrm"));
	}
}
