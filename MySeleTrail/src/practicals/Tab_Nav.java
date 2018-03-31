package practicals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Nav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/eclipse\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.goibibo.com/");
		  Set<String> windows =driver.getWindowHandles();
		  //https://www.icicibank.com/
		  Iterator<String> iterate = windows.iterator();
		  System.out.println(iterate.next()); // Main window
		  
		 
		  
	}

}
