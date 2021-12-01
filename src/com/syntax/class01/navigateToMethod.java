package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMethod {
    public static void main(String[] args) throws InterruptedException {
        //the first step is to created main method and then interect with the browser, so set the propert
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //then we declare the object
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.navigate().to("http://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

    }

}
