package testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchTouchScreen {
	@Test
	public void Launchtouch() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi 10 Prime");
		dc.setCapability(MobileCapabilityType.UDID,"8757d20a0509");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(ur,dc);
	}

}
