
package practicals_Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class test_listeners {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		
		weblisteners listner = new weblisteners();
		
		driver.register(listner);
		
		

		driver.navigate().to("http://google.com");
		
		
		
		
		driver.findElement(By.xpath("//*[@id='fll']/div[1]/a[2]")).click();
		
		Thread.sleep(2000L);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id='fll']/div[1]/a[1]")).click();
		
		Thread.sleep(2000L);
		
		driver.navigate().back();
		
		Thread.sleep(2000L);
		
		driver.navigate().forward();
		
	}

}
