package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //creating an object of ChromeDriver
        WebDriver driver=new ChromeDriver();   //lets call a method now to get to a particula website

        driver.get("http://www.google.com");

        String url=driver.getCurrentUrl();     // returns  the current page loaded on our browser
        System.out.println("The current url loaded in browser is: " + url);

        String title=driver.getTitle();    // returns the title of the current page in the browser
        System.out.println("The current tittle of the page is:" + title);

      driver.quit();                    //close the browser

    }
}
