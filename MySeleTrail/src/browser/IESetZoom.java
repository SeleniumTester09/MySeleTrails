package browser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IESetZoom {
	public static void main(String[] args) throws Exception {

		// Set path of IEDriverServer.exe
		// Note : IEDriverServer.exe should be In D: drive.
		System.setProperty("webdriver.ie.driver", "C:/eclipse/IEDriverServer.exe");

		// Set desired capabilities to Ignore IEDriver zoom level settings and
		// disable native events.
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("EnableNativeEvents", false);
		caps.setCapability("ignoreZoomSetting", true);

		// Initialize InternetExplorerDriver Instance using new capability.
		@SuppressWarnings("deprecation")
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Press CTRL + 0 keys of keyboard to set IEDriver Instance zoom level to 100%.
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));

		// Load Google URL

		driver.get("https://www.google.co.in/");

	//	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Are you ok ?");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//btnK
		driver.findElement(By.xpath("//input[@name='btnK']")).click();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Search Success");
		driver.close();
		
	}
}