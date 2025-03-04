package com.telran.qa46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest
{
    WebDriver driver; //declare a Variable

    //BEFORE METHOD - basic settings = setUp
    @BeforeMethod
    public void setUp() //find Chrome driver in "Tools" (C:) folder and get URL
    {
    driver = new ChromeDriver(); //initialization = Chrome is ready for using
    //driver.get("https://www.google.com"); //without this row will open an empty window. Without browser history

    driver.navigate().to("https://ilcarro.web.app/search"); //with browser history

    driver.manage().window().maximize(); //to maximize browser
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //to wait for ALL elements will be loaded

    driver.navigate().to("https://www.google.com"); //with browser history
    driver.navigate().back(); //get back to Ilcarro website
    driver.navigate().forward(); //get back to Google
    driver.navigate().refresh(); //update (changes or smth)
    }



    //TESTS
    @Test
    public void openGoogleTest() //start test and open window and print the TEXT
    {
        System.out.println("Google Opened");
    }



    //AFTER METHOD - to close = tearDown //To close window
    @AfterMethod(enabled = false) //to do not use it
    public void tearDown() //to close window
    {
        //driver.quit();
        driver.close();
        //difference between these 2 methods:
        // quit = close ALL tabs and browser.
        // close = close only ONE tab.
    }


}
