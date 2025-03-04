package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondSeleniumTest
{
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();

      driver.get("https://www.skype.com/en");
      driver.navigate().to("https://www.zoom.com/");
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();

    }


    @Test
    public void test()
    {
        System.out.println("Browser is Opened");
    }


    @AfterMethod (enabled = falce)
    public void after()
    {
        driver.close();
    }

}
