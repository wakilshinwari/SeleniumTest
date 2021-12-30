package com.syntax.class01.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class revisionImplicit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //locate the enable after 10 sec butoon and click on it
       WebElement enableBtn=driver.findElement(By.cssSelector("button#enable-button"));
       enableBtn.click();
       //print the state of the button after it is enableed
        WebDriverWait wait = new WebDriverWait(driver,20);
        //condition

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));
        //print wether the buttton is enabled or not

        WebElement btn= driver.findElement(By.cssSelector("button#disable"));
       boolean status= btn.isEnabled();
       System.out.println(status);

    }
}
