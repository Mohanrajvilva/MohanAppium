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

public class LaunchApp {
	@Test
	public void Launchappdemo() throws MalformedURLException, Throwable
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 10 Prime");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID,"8757d20a0509");
		
		dc.setCapability("appPackage","com.miui.calculator");
		dc.setCapability("appActivity",".cal.CalculatorActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement eleo = driver.findElement(By.id("android:id/button1"));
		driver.tap(1, eleo,500);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		driver.tap(1, element,500);
		WebElement plsbtn = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		driver.tap(1, plsbtn,500);
		WebElement element1 = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		driver.tap(1, element1,500);
		WebElement equbtn = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		driver.tap(1, equbtn,500);
		
		String ele = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		
		System.out.print("Sum of two number is==>"+ele);
		
		 
		
		
		
	}

}
