package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
@Test
public void verify() throws IOException
{
	//Configure the Browser
	WebDriverManager.chromedriver().setup();
	//Launch the Browser
	WebDriver driver = new ChromeDriver();
	//Navigate to the application
	driver.get("https://www.selenium.dev/");
	
	WorkbookFactory.create(false);
}

}
