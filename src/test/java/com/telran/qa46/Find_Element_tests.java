package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests()
{

WebDriver driver;


@BeforeMethod
public void setUp()
{
driver = new ChromeDriver();
driver.get("https://ilcarro.web.app/search");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test
public void findElement()
{
//find Element by TAG NAME
WebElement h1 = driver.findElement(By.tagName("h1"));
System.out.println(h1.getText());

WebElement a = driver.findElement(By.tagName("a"));
System.out.println(a.getText());

//find list of elements
List <WebElement> a1 = driver.findElements(By.tagName("a")); //strategy - "by tag name" and locator in ()
System.out.println(a1.size());
}

@Test
public void findElementBySimpleLocators() {
//by ID
    driver.findElement(By.id("city"));

//by CLASS NAME
    driver.findElement(By.className("mobile-header"));

//by LINK TEXT = the oldest strategy
    WebElement a2 = driver.findElement(By.linkText("Let the car work")); //set variable a2
    System.out.println(a2.getText());

//by partialLinkText
    driver.findElement(By.partialLinkText("car"));


}
@Test
public void findElementByCssSelectorTest()
{
//to create cssSelector from tagNAme
//driver.findElement(By.cssSelector("h1"))
    driver.findElement(By.cssSelector("h1"));

//to create cssSelector from ID
//driver.findElement(By.id("city")) ==> id=>css(.) -> # before ID
    driver.findElement(By.cssSelector("#city"));

//to create cssSelector from className
//driver.findElement(By.className("mobile-header")) ==> id=>css(.) -> . before ID
    driver.findElement(By.cssSelector(".mobile-header"));

//[attr='value']
    driver.findElement(By.cssSelector("[href=\"/login?url=%2Fsearch\"]"));

//CONTAINS -> *
    driver.findElement(By.cssSelector("[href*='login']"));

//start -> ^
    driver.findElement(By.cssSelector("[href^='/log']"));

//end -> $
    driver.findElement(By.cssSelector("[href$='search']"));

//HW send to skype link to Github
// Create new class
//Open link https://demowebshop.tricentis.com/
//find 10 elements with simple locators
//find 10 elements with css locators
}















@AfterMethod
public  void tearDown()
{
driver.quit();
}

}
