package appTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SeleniumDev 
{
	WebDriver driver;
  @Test
  public void titleTest() 
  {
	  driver.get("https://www.selenium.dev");
	  Assert.assertEquals(driver.getTitle(), "Selenium");
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  //Thread.sleep(7000);
	  driver.quit();
  }

}
