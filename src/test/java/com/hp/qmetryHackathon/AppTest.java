package com.hp.qmetryHackathon;

//<?xml version="1.0" encoding="UTF-8"?>

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class AppTest {
	
	public AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws Exception{
  
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	        
	    capabilities.setCapability("deviceConnectUsername", "hariprasath.varadhan@nl.abnamro.com");
	    capabilities.setCapability("deviceConnectApiKey", "bed892e0-f203-4d8a-8078-91c1363a579b");
	    capabilities.setCapability("deviceConnectDevice", "32992e39-62cd-4210-8580-0af50de3be4a");
	    capabilities.setCapability("platformName", "Android");
	    capabilities.setCapability("browserName", "Chrome");
	    capabilities.setCapability("automationName", "Appium");
	    capabilities.setCapability("noReset", "true");
	    
	    //create a RemoteWebDriver, the default port for Appium is 4723
	    driver = new AndroidDriver(new URL("http://10.52.10.254/Appium"), capabilities);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	}
	
	
	@Test
	public void launchWebsite() throws Exception {
	
      //Thread.sleep(7000);
      driver.get("https://www.bing.com");
      Thread.sleep(5000);	
      
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.quit();		
	
	}
	    
}
