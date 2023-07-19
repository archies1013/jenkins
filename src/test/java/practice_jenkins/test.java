package practice_jenkins;


	
	
	import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class test {
		WebDriver driver;

		@Test
		
		public void demo()
		{
			WebDriverManager.chromedriver().setup();//112.0.5615.49
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--remote-allow-origins=*"); 
			WebDriver driver = new ChromeDriver(options);
			
			//WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println("Page title is " + driver.getTitle());
			//driver.getTitle(driver.getTitle());
			//driver.close();
		}
	}
	
	
	
	


