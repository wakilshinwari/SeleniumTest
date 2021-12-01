package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        // TASK:   get all the links that are there on ebay.com
       // as we  ahve multiple ellements with tag name 'a' so we use driver.findelemetns
        // as there are multiple eleemtns so we need to store it in list of Webeleemtns

        List <WebElement> links = driver.findElements(By.tagName("a"));

        //print the size of the list
        System.out.println(" THe size of thelist cotaining links is : "+ links.size());

        //print the text of all the links
        for (WebElement link: links){
           // get the text out of the weElement link
            String linkText = link.getText();
            //only print the links that have some text and ignore the rest
           // ! not
            if (!linkText.isEmpty()){
                System.out.println(linkText);

                //print all the links also along with the text
                //use the method .getAttribute to ahve the value of a particular attribute in the tag
                //heref    = is th eattribute here
                String linkAddress=link.getAttribute("href");
                System.out.println(linkAddress);


                // <a   ( it is a tags ) or anchor tags.
                //
                System.out.println("******************");



            }

        }
    }
}
