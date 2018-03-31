package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBrowserSampleTest {

	 public static void main(String[] args) throws Exception {

	  // Set path of IEDriverServer.exe.
		 DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		    //cap.setCapability("InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION", true);
		    cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		    cap.setCapability("ignoreZoomSetting", true);
		    cap.setCapability("ignoreProtectedModeSettings", true);
		   // cap.setCapability("initialBrowserUrl","www.google.co.in");
		   System.setProperty("webdriver.ie.driver", "C:/eclipse/IEDriverServer.exe");
		    @SuppressWarnings("deprecation")
			WebDriver driver = new InternetExplorerDriver(cap);
		  //  driver.manage().window().maximize();
		    driver.get("https://www.google.co.in/");
			driver.findElement(By.cssSelector("#lst-ib")).sendKeys("Are you ok ?");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//btnK
			driver.findElement(By.xpath("//input[@name='btnK']")).click();		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Search Success");
		    driver.close();
		    
	 }
	}

