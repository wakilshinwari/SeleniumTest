package com.syntax.class01.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class revision {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("http://facebook.com");
        driver.findElement(By.partialLinkText("Create")).click();
        driver.findElement(By.name("firstname")).sendKeys("Homer");
        driver.findElement(By.name("lastname")).sendKeys("Simpson");
        driver.findElement(By.name("reg_email__")).sendKeys("homer@simpson.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("homer@simpson.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");
        //Finding Dropdowns
        WebElement month = driver.findElement(By.cssSelector("select#month"));
        month.click();


        //Click male Radio button
        WebElement maleRadio = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        maleRadio.click();

// driver.findElement(By.name("websubmit")).click();
    }
}
