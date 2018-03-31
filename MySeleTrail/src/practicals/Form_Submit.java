package practicals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Form_Submit {
 
WebDriver driver = null;
 
 
  @Before
  public void setup() throws Exception { 
  // set geckodriver path.
  System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\geckodriver.exe");
  //initialize firefox driver.
  		 driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
  } 
 
  @After
  public void tearDown() throws Exception { 
   driver.quit();
     } 
  
  @Test
  public void LogIn_Test(){
   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Raghav");
   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Y");
   driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys("Raghav@gmail.com");
   driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys("9192939495");
   driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("IBM");
   //To submit form.
   //You can use any other Input field's(First Name, Last Name etc.) xpath too In bellow given syntax.
   driver.findElement(By.xpath("//input[@name='Company']")).submit();
   String alrt = driver.switchTo().alert().getText();
   driver.switchTo().alert().accept();
   System.out.println(alrt);
  }
}