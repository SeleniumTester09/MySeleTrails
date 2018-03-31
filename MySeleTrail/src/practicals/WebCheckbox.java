package practicals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCheckbox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/w8/Desktop/Checkbox.html");
   		  List<WebElement> check_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
				
	//	System.out.println(check_box.get(1).getAttribute("value"));
		
		if(check_box.get(2).getAttribute("checked") == null) {
			Thread.sleep(2000);
			check_box.get(2).click();
			
		}
		else {
		 
			System.out.println("CheckBox Already checked");
			Thread.sleep(2000);
			check_box.get(2).click();
			System.out.println("Uncheck CheckBox Cycle");
			Thread.sleep(2000);
			check_box.get(0).click();
			System.out.println("CheckBox Bike has been selected");
			
		}
		

	}


}
