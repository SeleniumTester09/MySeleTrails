package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	public static void main(String args[]){
	//System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://mail.google.com/");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("#identifierId")).sendKeys("selenium.12.27@gmail.com");
		  driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
		  driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Automation2017");
		  driver.findElement(By.cssSelector("#passwordNext > content")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println("Login Successful");
		  driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("#gb_71")).click();
		  System.out.println("Log Off Successful");
		 // driver.close();
		  //driver.quit();
	
	}
}
