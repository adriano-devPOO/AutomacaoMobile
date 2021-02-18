package br.accenture.appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactoryMobile {
	
	private static AndroidDriver<MobileElement> driver;
	
	
	public static AndroidDriver<MobileElement> getDriver() {
		
		if(driver == null) {
			createDriver();
		}
	
		return driver;
	}

	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "Nexus 5");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\adriano.o.silva\\eclipse-workspace\\AutomacaoMobile\\Resources\\CTAppium_1_2.apk");
		desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
