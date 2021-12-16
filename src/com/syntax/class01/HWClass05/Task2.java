package com.syntax.class01.HWClass05;

import com.google.common.base.Verify;
import com.sun.tools.corba.se.idl.constExpr.Negative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
//    HRMS Application Negative Login:
//    Open chrome browser
//    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
//    Enter valid username
//    Leave password field empty
//    Click on login button
//    Verify error message with text “Password cannot be empty” is displayed.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));

        userName.sendKeys("valid username");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        driver.findElement(By.xpath("//span[@id='spanMessage'] "));

        System.out.println("Password cannot be empty");


    }
}
