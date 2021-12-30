package com.syntax.class01.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
//the task is to open up a newtab and a new window -- switch to new tab and get the text
        //find button new tab
        WebElement newtab = driver.findElement(By.cssSelector("button#tabButton"));
        //find new window button
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));
        //now we need to click on the newtab and window btn
        newWindow.click();
        newtab.click();
        //print the handle of the main page/home page/parent page
        //gewindwoHandle returns us one windowhandle
        String parentHandle = driver.getWindowHandle();
        System.out.println("parent window handle :" + parentHandle);
        //to switch to a newtab, we nee to get the text --we alos to nee to get all the handles so that we nca switch
        //to desire handle
        //1. get all handles
        Set<String> allHandles = driver.getWindowHandles();
        // 2. find the desired handle ;; example: of  a new tab by iterating through the set

        Iterator<String> it = allHandles.iterator();
        //3. iterating over each handle to see if it is the desired one.

        while (it.hasNext()) {
            String handler = it.next();
            driver.switchTo().window(handler);
            //now get the title and check if it is the desired tab or not
            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {

                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));

        System.out.println(text.getText());
        //click on new window message button

        //driver.switchTo().defaultContent();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.quit();
    }
}





