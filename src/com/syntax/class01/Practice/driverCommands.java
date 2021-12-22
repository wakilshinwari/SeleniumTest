package com.syntax.class01.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.ebay.com/");

//        get all the links that are there on ebay.com
        // so we have muptiple eleemnts with tag name 'a' so we use driver.findElements

        List<WebElement> links=driver.findElements(By.tagName("a"));
        //print the size of this list

        System.out.println("The size of list containig links is :" +links.size());

        //print all the text of all the links

        for (WebElement link:links){
            
        }



    }
}
