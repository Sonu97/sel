package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class selwebsite {
	WebDriver driver;
	@BeforeMethod
	public void launch() {
		 System.setProperty("webdriver.chrome.driver","/usr/local/share/chrome-driver/chromedriver");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://35.226.104.12:3001");
	}
  @Test
  public void verifylogin() {
	  
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.findElement(By.name("login")).sendKeys("devops");
      driver.findElement(By.name("password")).sendKeys("test");      
      driver.findElement(By.name("click")).click();
	}
  @AfterMethod
  public void close() {
	  driver.close();
  }
} 

