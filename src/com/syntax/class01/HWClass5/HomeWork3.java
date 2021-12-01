package com.syntax.class01.HWClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class HomeWork3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement fname =driver.findElement(By.cssSelector("input[name='first_name']"));
       fname.sendKeys("Abdul");
        driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Shinwari");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("shinwari123@gmail.com");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("5714544849");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("Arlington BLVD");
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Alexandria");
        driver.findElement(By.cssSelector("input[name='state']")).sendKeys("VA");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("20155");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("Syntax");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("textarea[class='form-control']")).sendKeys("It is fun");






    }
}
