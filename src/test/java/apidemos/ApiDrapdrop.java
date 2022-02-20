package apidemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDrapdrop {
	AndroidDriver driver;
	
	@Test
	public void dragdrop() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 10 Prime");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(ur,dc);
		WebElement continuebtn = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		tapaction(1, continuebtn);
		WebElement ok = driver.findElement(By.id("android:id/button1"));
		tapaction(1, ok);
		WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		tapaction(1,views);
		WebElement dragdtrop = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]"));
		tapaction(1, dragdrop);
		
	}
	
	public void tapaction(int fingers,WebElement element)
	{
		driver.tap(fingers,element,500);
	}

}
