package com.syntax.class01.HWClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//input[@id='Invalid Credentials']"));
        Thread.sleep(2000);
        System.out.println(password.getText());












    }

}
