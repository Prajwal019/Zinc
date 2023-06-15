package com.actitime.customermodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
@Test
public void createCustomer() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Reporter.log("Create Customer",true);
	Reporter.log("Modify Customer",true);
	Reporter.log("Delete Customer",true);
	Reporter.log("Delete Customer",false);
	Reporter.log("Modify Customer",false);
	driver.close();
	}
}
