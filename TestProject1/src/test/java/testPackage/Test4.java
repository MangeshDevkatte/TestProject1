package testPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	WebDriver driver;

	@BeforeTest
	public void mBtest() {
		System.setProperty("webdriver.chrome.driver", "G:\\javaWorkspace\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void mMtest(){
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test
	public void mtest3() {
		driver.findElement(By.xpath("//a[text()='Create New Account']"));//.sen click();
	}

	@Test(dependsOnMethods = "mtest3")
	public void mtest1() throws Exception{
		List<WebElement> l= driver.findElements(By.xpath("//select[@id='month']/option"));
		WebElement e= driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(e);
		s.selectByVisibleText("Jan");
		System.out.println(s.isMultiple());
	}
	
	@Test(dependsOnMethods = "mtest3")
	public void mtest2() throws Exception {
		List<WebElement> l=driver.findElements(By.xpath("//span[@data-name='gender_wrapper']/span"));
		l.get(1).click();
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.CONTROL,"t").build().perform();
//		act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open('https://www.google.com');");
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
	
//	@AfterTest
//	public void mAtest() {
////		driver.navigate().to("https://www.flipkart.com/");
//		driver.close();
////		driver.quit();
//	}
	

}
