package com.syntax.class01.HWClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        //navigate

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the drop down: we find the webelement" drop down"
        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));

        //use the select classs to select from drop down
        // we are creating an object of the Select and we have to pass our webeelement
        Select select= new Select(days);

        //we pass the index of days ( for instance, sunday is 1 and Monday is 2)
        //select the value from drop dwon using select by index

         //Select by INdex

//        select.selectByIndex(1);
//        Thread.sleep(2000);
//        select.selectByIndex(2);
//        Thread.sleep(2000);
//        select.selectByIndex(7);

       //Select By Visible text

        select.selectByVisibleText("Thursday");

        //Select BY value
        select.selectByValue("Wednesday");
    }
}