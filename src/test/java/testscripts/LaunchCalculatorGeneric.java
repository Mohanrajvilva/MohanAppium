package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchCalculatorGeneric {
	AndroidDriver driver;
	@Test
	public void Launchappdemo() throws MalformedURLException, Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 10 Prime");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"8757d20a0509");
		
		dc.setCapability("appPackage","com.google.android.calculator");
		dc.setCapability("appActivity","com.android.calculator2.Calculator");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(ur,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		tapaction(1, element);
		
		WebElement plsbtn = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		tapaction(1,plsbtn);
		
		WebElement element1 = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		tapaction(1, element1);
		WebElement equbtn = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		tapaction(1, equbtn);
		
		String ele = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		
		System.out.print("Sum of two number is==>"+ele);
		
		 

}
	public void tapaction(int fingers,WebElement element)
	{
		driver.tap(fingers, element,500);
	}
}

