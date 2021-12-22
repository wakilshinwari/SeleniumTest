package com.syntax.class01.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();
        //enable the alerts

        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);
        //switch the focus of selenim
      Alert simpleAert  =driver.switchTo().alert();

      simpleAert.accept();
      //handling confirmatiojn alerts adn enabling alert
      driver.findElement(By.cssSelector("button#confirm")).click();
Thread.sleep(2000);
//      //Switch the focus
         Alert confirmationAlert  =driver.switchTo().alert();
//     //get the text from this alert
          System.out.println(confirmationAlert.getText());
//
//        //lets cancel the alert
             confirmationAlert.dismiss();
//
//        //promt alert and enable it
//
           Thread.sleep(2000);
//
           driver.findElement(By.cssSelector("button#prompt")).click();
        Thread.sleep(2000);
//
//        //switch focus
            Alert promptAlert = driver.switchTo().alert();
//        //send some keys to this alert
       promptAlert.sendKeys("hello we need some sleep");
//
//        //acccept
        promptAlert.accept();
    }
}
