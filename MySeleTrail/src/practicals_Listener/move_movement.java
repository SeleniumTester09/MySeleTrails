package practicals_Listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;


@SuppressWarnings("deprecation")
public class move_movement {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\geckodriver.exe");
		  //initialize firefox driver.
		WebDriver webdriver = new FirefoxDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		
		weblisteners listner = new weblisteners();
		
		driver.register(listner);
		

		EventFiringMouse mouse = new EventFiringMouse(driver,listner);
		
		driver.navigate().to("http://google.com");
		
		Thread.sleep(3000L);
		
		Locatable hoverItem = (Locatable) driver.findElement(By.xpath("//*[@id='gb_23']/span[2]"));
		
		Coordinates cord = hoverItem.getCoordinates();
		
		try{
			
			mouse.mouseMove(cord);
		}catch(Throwable t){
			
		}
		
		
		Thread.sleep(3000L);
		
		
		

	}

}
