package ajaxActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LiTags {
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.hdfcbank.com/");
	  Actions act = new Actions(driver);
	  WebElement elt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span"));
	  act.moveToElement(elt).build().perform();
	  act.moveToElement(driver.findElement(By.cssSelector("a[href*='goldloan']"))).build().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("a[href*='goldloan']")).sendKeys(Keys.ENTER);
	  // Shobana --
	  String Title = driver.getTitle();
	  System.out.println(Title);
	  
	  driver.close();
}
}