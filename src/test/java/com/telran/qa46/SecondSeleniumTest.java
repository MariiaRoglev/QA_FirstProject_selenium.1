package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondSeleniumTest
{
    WebDriver driver; //set a variable

    @BeforeMethod
    public void setUp()
    {
      driver = new ChromeDriver(); // initialize a Variable

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();

      driver.get("https://www.skype.com/en"); // without any data
      driver.navigate().to("https://www.zoom.com/"); // with data

      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
    }


    @Test
    public void test() //start a test
    {
        System.out.println("Browser Opened");
    }


    @AfterMethod (enabled = false) //use it - true. do not use it - false
    public void after()
    {
        driver.close();
    }

}
