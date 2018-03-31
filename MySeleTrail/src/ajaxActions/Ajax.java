package ajaxActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajax {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  //driver.findElement(By.className(className))
		 
		  Actions act = new Actions(driver);
		 WebElement elt =driver.findElement(By.xpath("//*[@id=\'nav-link-yourAccount\']/span[1]"));
		  
		 act.moveToElement(elt).build().perform();
	   WebElement txt = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'][@type='text']"));
		 txt.click();
		act.keyDown(Keys.SHIFT).moveToElement(txt).sendKeys("hello").build().perform();
		 Thread.sleep(3000);
	    
		 act.contextClick(txt).build().perform();
			  

	}
}
