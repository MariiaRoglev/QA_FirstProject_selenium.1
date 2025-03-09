package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkTestForTest
{
 WebDriver driver;

 @BeforeMethod
    public void before()
 {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     driver.get("https://demowebshop.tricentis.com/");
 }
 @Test
    public  void simpleElements()
 {
     driver.findElement(By.id("mob-menu-button")); //div id = "Value"

     driver.findElement(By.className("header-menu")); //class = "Value"

     WebElement a = driver.findElement(By.tagName("a"));//<a.../a>
     System.out.println(a.getText());

     driver.findElement(By.linkText("Gift Cards"));//<a href...>Gift Cards</a>

     driver.findElement(By.partialLinkText("downloads"))   ;//<a href...>Digital downloads</a>
 }
    @Test
    public  void cssSelectors()
    {
        driver.findElement(By.cssSelector("#mob-menu-button")); //# before ID

        driver.findElement(By.cssSelector(".header-menu")); //. before CLASS

        WebElement a = driver.findElement(By.cssSelector("a"));//nothing
        System.out.println(a.getText());

        driver.findElement(By.cssSelector("[href = '/computers']")); //Full text <a href = '/computers'...</a>

        driver.findElement(By.cssSelector("[href^='/digital']")); //Starts with ^ <a href = '/digital-downloads'...</a>

        driver.findElement(By.cssSelector("[href$='downloads']")); //Ends with $ <a href = '/digital-downloads'...</a>

        driver.findElement(By.cssSelector("[href*='ard']")); //Contains * <a href = '/gift-cards'...</a>
    }






    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }

}
