package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {
    public static void main(String[] args) throws InterruptedException {
            //the first step is to created main method and then interect with the browser, so set the propert
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            //then we declare the object
            WebDriver driver =new ChromeDriver();
            driver.get("http://www.google.com");
            //to maximize the windoe on our browser
            driver.manage().window().maximize();
            //to show fullscreeen of your browser
            driver.manage().window().fullscreen();

    }
}
