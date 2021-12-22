package com.syntax.class01.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        //Switch to the desired frame using switch to (). frame ()
        driver.switchTo().frame("frame1");

        //getting the webelement
       WebElement text1= driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("this text is : "+ text1.getText());

        //as frame 2 doesnt lie inside frame 1 so in order to get there we need to switch our focus to the default page

        driver.switchTo().defaultContent();
//
        //Switch to frame 2
        driver.switchTo().frame("frame2");
        //now we should locate the webelement
         WebElement text2=driver.findElement(By.cssSelector("h1#sampleHeading"));

        System.out.println("this text2 is : "+ text2.getText());
        //switch the focus back to the default
        //I can simply locate eleemnt as it is not sinide the feram e and perfrom aon it.

        driver.switchTo().defaultContent();
        //



    }
}
