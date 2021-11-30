
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void m() {
		System.out.println("Hello");
	}
	@Test
	public void m1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\javaWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		File sc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("G:\\javaWorkspace\\Screenshot\\2.jpg"));
		
		driver.close();
	}

}
