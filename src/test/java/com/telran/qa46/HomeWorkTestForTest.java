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


  @Test
  public void simpleStrategyNewTraining()
  {
    //by tagname
      WebElement h3 = driver.findElement(By.tagName("h3"));
      System.out.println(h3.getText());
      //by class name
driver.findElement(By.className("header"));
    //by id
driver.findElement(By.id("flyout-cart"));
    //by text
driver.findElement(By.linkText("Electronics"));
    //by partial text
driver.findElement(By.partialLinkText("downloads"));
  }

    @Test
    public void cssSelectorsNewTraining()
    {
        //by tagname
        WebElement h3 = driver.findElement(By.cssSelector("h3"));
        System.out.println(h3.getText());

        //by class name
        driver.findElement(By.cssSelector(".header"));

        //by id
        driver.findElement(By.cssSelector("#flyout-cart"));

        //by text
        driver.findElement(By.cssSelector("[href='/141-inch-laptop']")); //full

        driver.findElement(By.cssSelector("[href^='/build']")); // starts ^

        driver.findElement(By.cssSelector("[href$='computer']")); // ends $

        driver.findElement(By.cssSelector("[href*='-your-cheap-']")); // contains *

    }













    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }

}
