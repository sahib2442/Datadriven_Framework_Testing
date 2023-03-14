package com.bridgelabz.qa.extendreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReports {
@Test	
public static void extendReports() {
        
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        ExtentTest test1 = extent.createTest("Google Seartch Test one", "this is test validate");
        
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        test1.log(Status.INFO, "Starting test case");
        
        driver.get("https://www.facebook.com/");
        
        test1.pass("Pass");
        
        driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
        
        test1.pass("email");
        
        driver.findElement(By.name("pass")).sendKeys("6380631875");
        
        test1.pass("pass");
        
        driver.findElement(By.name("login")).click();
        
        test1.pass("logni");
        
        driver.close();
        
        test1.pass("close");
        
        test1.info("Test Completed");
        
        extent.flush();
        
    }

}
