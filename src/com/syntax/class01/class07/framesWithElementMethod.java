package com.syntax.class01.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesWithElementMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //switching to the desired frame using webelement
        //we need to pass a parameter as webeelemtn (variable )
       WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
       //now we access frame 1
        driver.switchTo().frame(frame1);
        //switch to the frame using index
        driver.switchTo().frame(1);
        System.out.println( driver.findElement(By.cssSelector("h1#sampleHeading")).getText());

    }
}
