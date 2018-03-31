package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	 public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.google.co.in");
	 
	  if (driver.findElement(By.xpath("//*[@id='lst-ib']")).isEnabled()) {
	   System.out.println("Google search text box Is enabled.");
	   driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("WebDriver Test successful.");
	   driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	  
	  
	  } else {
	   System.out.println("Google search test box Is Not enabled.");

	  }
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  System.out.println("Google search completed.");
	  //driver.close();
	  
	  
	 }
	}
