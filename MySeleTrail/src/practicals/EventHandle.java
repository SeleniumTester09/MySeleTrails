package practicals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.gmail.com");
		  driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[3]/a")).click();
		  Set<String> windows =driver.getWindowHandles();
		  Iterator<String> iterate = windows.iterator();
		  System.out.println(iterate.next()); // Main window
		
		  System.out.println("------ After new window opened -------");
		  windows = driver.getWindowHandles();
		  iterate = windows.iterator();
		  String F_Window = iterate.next();
		  String Tab_Window = iterate.next();
		  driver.switchTo().window(Tab_Window);
		  
		  
		  Wait(4);
		  JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,1000)");
		   Wait(3);
		   js.executeScript("window.scrollBy(0,-1000)");
		   Wait(3);
		  driver.close();
		  driver.switchTo().window(F_Window);
		  Wait(3);
		  driver.close();
		
	}

	private static void Wait(int seconds) throws InterruptedException {
		System.out.println("Waiting for : "+seconds+"  seconds ");
		Thread.sleep(1000*seconds);
	}


}
