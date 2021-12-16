package com.syntax.class01.HWClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxer {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        //navigate to syntax check box demo and check the first checkbox

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        //locate the webEleemtn checkbox
        WebElement signleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        signleCheckBox.click();
        Thread.sleep(2000);
        //uncchekc the check box
        signleCheckBox.click();

        //Task2:   Check all teh text boxes simultaneoulsy
        //select a xpath that has common attributes value for all the ccheckboxes

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //print the number of checkboxes
        int size = checkBoxes.size();
        System.out.println("The total number of checkboxes is :" + size);


            //iterate through each WebEleemnt
            for(WebElement checkBox : checkBoxes){

                //select the cechk box with the text option 3
                //get the attribute "value " of all checkBoxes

                String valueofAttribute= checkBox.getAttribute("value");
                System.out.println(valueofAttribute);

                //check only whose value is "Option -3"

                if (valueofAttribute.equalsIgnoreCase("Option-3"));
                //click the check bo whose attribute value is option -3

                checkBox.click();
            }

        }
    }
