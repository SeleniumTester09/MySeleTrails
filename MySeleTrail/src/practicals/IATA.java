package practicals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IATA {

	 public static void main(String[] args) {
		 
	  System.setProperty("webdriver.chrome.driver","C:/eclipse\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://www.iata.org/services/finance/Pages/airlines.aspx");
	
	 }

}
