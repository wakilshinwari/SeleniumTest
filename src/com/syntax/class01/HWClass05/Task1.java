package com.syntax.class01.HWClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        for (WebElement link:allLinks){
            System.out.println(link.getText() + link.getAttribute("href"));
        }

    }
    // HW1: Amazon link count:
    //Open chrome browser
    //Go to “https://www.amazon.com/”
    //Get all links
    //Get number of links that has text
    //Print to console only the links that has text
}
