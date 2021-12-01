package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.manage().window().maximize();
// navigate to this website
        // fill the username "AON"  delete the user name     filll the new user name "Tester"


        //the first step si to fiind the weeb element
      WebElement userName= driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
      userName.sendKeys("AON");

        Thread.sleep(2000);
        // delete the user name

        userName.clear();
        //enter the new suerName
        Thread.sleep(2000);
        userName.sendKeys("Tester");



    }
    }

