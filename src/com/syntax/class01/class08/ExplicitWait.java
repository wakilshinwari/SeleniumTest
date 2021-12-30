package com.syntax.class01.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        //use the explicit wait to make sure the element has met a certain condition
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //put the condition of wait
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#enableAfter")));

        //locate the button
     WebElement btn = driver.findElement(By.cssSelector("button#enableAfter"));
        System.out.println(btn.isEnabled());
    }
    }

