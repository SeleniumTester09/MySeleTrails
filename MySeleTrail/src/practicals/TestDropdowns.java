package practicals;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestDropdowns {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  //Implicit wait
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.wikipedia.org/");
		Thread.sleep(5000);
		/*
		 *  English - UK
		 *  English - US
		 */
		
	//	driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Eesti");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@id='searchLanguage']")));
		select.selectByVisibleText("Azərbaycanca");
		Thread.sleep(2000);
		select.selectByValue("hi");
		Thread.sleep(2000);
		select.selectByIndex(4);
		
		List<WebElement> options = driver.findElements(By.tagName("option"));
		System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
		System.out.println(options.get(i).getAttribute("lang"));
		}

		System.out.println("----- Print All Links ------ ");

		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]"));

		List<WebElement> links = block.findElements(By.tagName("a"));

		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());

		}

		System.out.println("Total Links are: "+links.size());
	

}

}