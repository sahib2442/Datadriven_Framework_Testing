package com.bridgelabz.qa.testngListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Listener {

	@Listeners(My_testListener.class)
	public class TestNg_Listener {
		@Test
		public void testng_listener_Test() {
			WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			driver.close();
		}
	}

}
