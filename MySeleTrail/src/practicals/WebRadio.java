package practicals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebRadio {

	public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://www.goibibo.com/");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		List<WebElement> radio_button = driver.findElements(By.xpath("//*[@type='radio']"));
		
	//	System.out.println(radio_button.get(0).getAttribute("value"));
		
		if(radio_button.get(1).getAttribute("checked")!=null )
		{
			radio_button.get(0).click(); 
		}
		
		Thread.sleep(3000);
		radio_button.get(2).click(); //check the radio button if it is unchecked
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(radio_button.get(2).getAttribute("checked"));
		
 	
	/*	  driver.get("file:///C:/Users/w8/Desktop/Radio.html");
		  List<WebElement> radio_button = driver.findElements(By.xpath("//input[@type='radio']"));
			
			//	System.out.println(check_box.get(1).getAttribute("value"));
				
				if(radio_button.get(0).getAttribute("checked") == null) {
					radio_button.get(0).click();
					
				}
				else {
				 
					System.out.println("I have a bike checked");
					Thread.sleep(3000);
					radio_button.get(1).click();
				}
			
			*/	
		  
	}

}
