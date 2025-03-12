package com.telran.qa46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathSelectorsHomeWork
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

    @AfterMethod
    public void after()
    {
        driver.quit();
    }


//    @Test
//    public void simpleSelectors()
//    {
//        WebElement h3 = driver.findElement(By.tagName("h3"));
//        System.out.println(h3.getText());
//
//        driver.findElement(By.id("bar-notification"));
//        driver.findElement(By.className("master-wrapper-page"));
//        driver.findElement(By.linkText("Computers"));
//        driver.findElement(By.partialLinkText("downloads"));
//
//    }
//
//    @Test
//    public void cssSelectors()
//    {
//        WebElement h3 = driver.findElement(By.cssSelector("h3"));
//        System.out.println(h3.getText());
//
//        driver.findElement(By.cssSelector("#bar-notification"));
//        driver.findElement(By.cssSelector(".master-wrapper-page"));
//        driver.findElement(By.cssSelector("[href='/computers']")); //Full text
//        driver.findElement(By.cssSelector("[href^='/digital']")); //starts with
//        driver.findElement(By.cssSelector("[href$='downloads']")); //ends with
//        driver.findElement(By.cssSelector("[href*='downl']")); //contains
//
//        //tag + id
//        driver.findElement(By.cssSelector("input#small-searchterms"));
//
//        //tag + class
//        driver.findElement(By.cssSelector("div.search-box"));
//
//        //tag+ id+[attr='value']
//        driver.findElement(By.cssSelector("input#small-searchterms[name='q']"));
//    }

    @Test
    public void xpathSelectors()
    {
        //tag->xpath -> //"*"
        driver.findElement(By.xpath("//img"));

        //id-> xpath -> //*[@id='value']
        // * = tag
        driver.findElement(By.xpath("//div[@id='bar-notification']"));

        //className -> xpath -> //*[@class='value']
        driver.findElement(By.xpath("//div[@class='header-menu']"));

        //Full text -> xpath -> //*[text()='FullText']
        driver.findElement(By.xpath("//h3[text()='Information']")); //works the same: Text -> .
        driver.findElement(By.xpath("//span[text()='Shopping cart']"));

        //starts with -> //*[starts-with(@attr,'StartText')]
        driver.findElement(By.xpath("//img[starts-with(@alt,'Tricentis')]"));
        driver.findElement(By.xpath("//img[starts-with(@alt,'Picture')]"));

        //contains -> xpath -> //*[contains(.,Text)]
        driver.findElement(By.xpath("//img[contains(.,Web)]"));
        driver.findElement(By.xpath("//img[contains(.,Demo)]"));
        driver.findElement(By.xpath("//input[contains(.,Add)]"));

        //move
        driver.findElement(By.xpath("//div[@class='top-menu-triangle']")); //to find parent in the end -> /..
        driver.findElement(By.xpath("//ul[@class='top-menu']"));

        //to find parent of the the child LI -> LI = child of the UL
        driver.findElement(By.xpath("//li/parent::*"));
        driver.findElement(By.xpath("//li/parent::ul"));
        driver.findElement(By.xpath("//li/.."));


        //ancestor = predok
        driver.findElement(By.xpath("//span/ancestor::*")); //all
        driver.findElement(By.xpath("//li/ancestor::div")); //all options
        driver.findElement(By.xpath("//a/ancestor::ul")); //all options
        driver.findElement(By.xpath("//li/ancestor::div[2]")); //to find only 1 option

        //following-sibling
        driver.findElement(By.xpath("//a/following-sibling::*"));
        driver.findElement(By.xpath("//script/following-sibling::ul"));

        //preceding-sibling
        driver.findElement(By.xpath("//span/preceding-sibling::*"));
        driver.findElement(By.xpath("//script/preceding-sibling::*"));

    }

}
