package practicals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.xpath("//input[@type='submit'][@value='Go']")).click();
	  Alert alert = driver.switchTo().alert();
	  System.out.println(alert.getText());
	  wait(2);
	  alert.accept();
	  driver.findElement(By.xpath("//input[@type='text'][@name='login']")).sendKeys("Selenium");
	  driver.findElement(By.xpath("//input[@type='submit'][@value='Go']")).click();
}

	public static void wait(int sec) throws InterruptedException {
	Thread.sleep(1000*sec);
	}
	
	
}