package com.syntax.class01.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleelementexceptions {
    public static java.lang.String url="https://chercher.tech/practice/stale-element";

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the reeresh the buttton
      WebElement refreshBtn= driver.findElement(By.cssSelector("button#refresh-button"));
      Thread.sleep(11000);
      //to handle exception locate it again
        refreshBtn=driver.findElement(By.cssSelector("button#refresh-button"));
      refreshBtn.click();
    }
}