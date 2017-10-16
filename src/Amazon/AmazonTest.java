package Amazon;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.URL;
import java.net.MalformedURLException;

import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class AmazonTest {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		/*String path="D:\\DebugView\\Eula.txt";
		File apk=new File(path);*/
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "5.0");
        cap.setCapability("deviceName", "MZahran");
        cap.setCapability("app", apk.getAbsolutePath());
        cap.setCapability("appPackage", "Amazon");
        cap.setCapability("appActivity", "HomeActivity");
        
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        
        driver.get("http://google.com.eg");
        Thread.sleep(6000);
        driver.context("NATIVE_APP");
        driver.findElement(By.id("com.android.chrome:id/button_primary")).click();
        Thread.sleep(2000);
        driver.context("WEBVIEW");
        driver.findElement(By.id("lst-ib")).sendKeys("Appium");
        Thread.sleep(1000);
        driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Appium")).click();
        //driver.quit();
	}

}
