package com.bridgelabz.qa.allurereports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureReporting {
	
	@Test
	public void validateTitle() {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     String tagname = driver.findElement(By.id("email")).getTagName();
	     System.out.println(tagname);
	     driver.close();
	}

}
