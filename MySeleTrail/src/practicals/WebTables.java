package practicals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.espncricinfo.com/rankings/content/page/211271.html");
		  Wait(3);
		  WebElement table = driver.findElement(By.className("StoryengineTable"));
		  List<WebElement> no_rows= table.findElements(By.tagName("tr"));
		  System.out.println("No of Rows are: "+no_rows.size());
		  int i=0;
		  for(WebElement eachrow:no_rows)
		  {
			 
			 List<WebElement> eachCol= eachrow.findElements(By.tagName("td"));
			 i++;
			 System.out.println("No of Col's in "+i+"th row are "+eachCol.size());
			 
			 for(WebElement text:eachCol)
			 {
				System.out.println(text.getText());	 
			 }
		  }
		  

	}

	private static void Wait(int seconds) throws InterruptedException {
		System.out.println("Waiting for : "+seconds+"  seconds ");
		Thread.sleep(1000*seconds);
	}
}
