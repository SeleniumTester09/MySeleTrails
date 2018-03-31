package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 // driver.findElement(By.cssSelector("body > form > table:nth-child(17) > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(2) > span > input")).sendKeys("123456");
		  
		 // driver.switchTo().frame(0);
		//  driver.findElement(By.cssSelector("input[class=input_password]")).sendKeys("123456");
		  
		  
 }

}
