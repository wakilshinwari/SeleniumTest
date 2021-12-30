package com.syntax.class01.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame2");

        WebElement text1 = driver.findElement(By.cssSelector("h1#sampleHeading "));
        text1.getText();
        System.out.println(text1.getText());

        driver.switchTo().defaultContent();




    }
}
