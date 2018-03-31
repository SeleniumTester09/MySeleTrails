package practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Pages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.navigate().to("https://google.co.in/");
		  //driver.get("https://google.co.in/");
		//  driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[3]/a")).click();
		  driver.findElement(By.cssSelector("a.gb_P")).click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().forward();
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  
		  //
	}

}
