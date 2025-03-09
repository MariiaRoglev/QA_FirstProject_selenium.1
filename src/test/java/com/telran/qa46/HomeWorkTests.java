package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkTests
{
    WebDriver driver;


    @BeforeMethod
    public void beforeMethod()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void test()
    {
        System.out.println("The link was successfully opened");
    }

    @Test
    public void findElementsWithSimpleLocators()
    {
//by tagname_1
WebElement h3 = driver.findElement(By.tagName("h3"));
System.out.println(h3.getText());

//by tagname_2
WebElement p = driver.findElement(By.tagName("p"));
System.out.println(p.getText());

//by class name_1
driver.findElement(By.className("master-wrapper-page"));

//by class name_2
driver.findElement(By.className("footer"));

//by ID_1
driver.findElement(By.id("bar-notification"));

//by ID_2
driver.findElement(By.id("mob-menu-button"));

//by linkText_1
driver.findElement(By.linkText("Computers"));

//by linkText_2
driver.findElement(By.linkText("Books"));

//by partial_linkText_1
driver.findElement(By.partialLinkText("Apparel"));

//by partial_linkText_2
driver.findElement(By.partialLinkText("downloads"));

}

@Test
public void cssSelectors()
{
//by tagname_1
    WebElement h3 = driver.findElement(By.cssSelector("h3"));
    System.out.println(h3.getText());

//by tagname_2
    WebElement p = driver.findElement(By.cssSelector("p"));
    System.out.println(p.getText());

//by class name_1
    driver.findElement(By.cssSelector(".master-wrapper-page"));

//by class name_2
    driver.findElement(By.cssSelector(".footer"));

//by ID_1
    driver.findElement(By.cssSelector("#bar-notification"));

//by ID_2
    driver.findElement(By.cssSelector("#mob-menu-button"));

//[attr='value']
    driver.findElement(By.cssSelector("[href='/login']"));

//CONTAINS -> *
    driver.findElement(By.cssSelector("[href*='us']"));

//start -> ^
    driver.findElement(By.cssSelector("[href^='/about']"));

//end -> $
    driver.findElement(By.cssSelector("[href$='photo']"));

}

@AfterMethod
    public void afterMethod()
    {
    driver.quit();
    }



















}
