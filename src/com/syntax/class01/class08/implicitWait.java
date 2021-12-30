package com.syntax.class01.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();
        //we declare our wait--- a implicit wait for fining element -- it should 12 or 15 seconds
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //find the button to get a new user

        WebElement getNewUser = driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();
        WebElement fName = driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        //fi we want to print the text of the first name
        System.out.println(fName.getText());


    }
}
