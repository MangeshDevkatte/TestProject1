package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
	WebDriver webDriver;
	
	@BeforeTest
	public void mBtest() {
		System.setProperty("webdriver.chrome.driver", "G:\\javaWorkspace\\chromedriver.exe");
		webDriver=new ChromeDriver();
		webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		webDriver.manage().window().maximize();
	}
	@Test
	public void testLoginFormPresent() {
		// below you can find already setup webDriver
		webDriver.findElement(By.id("email-input")).sendKeys("login@codility.com");
		webDriver.findElement(By.id("password-input")).sendKeys("password");
		webDriver.findElement(By.id("login-button")).click();

	}

}
