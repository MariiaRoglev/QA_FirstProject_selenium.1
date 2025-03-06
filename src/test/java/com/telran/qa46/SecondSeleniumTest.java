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
      driver = new ChromeDriver(); // initialize a Variable //MUST KNOW!!! open an empty Chrome page
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //MUST KNOW!!! all elements should be loaded
      driver.manage().window().maximize(); //MUST KNOW!!! Full screen

      driver.get("https://www.skype.com/en"); // open this URL without data
      driver.navigate().to("https://www.zoom.com/"); // open this URL with data

      driver.navigate().back(); //get back to SKYPE
      driver.navigate().forward(); //get back to ZOOM after SKYPE
      driver.navigate().refresh(); //UPDATE = REFRESH THE PAGE
    }


    @Test
    public void test() //to start the test
    {
        System.out.println("Browser Opened");
    }


    @AfterMethod (enabled = false) //use it - true. do not use it - false
    public void after()
    {
        driver.close();
    }

}
