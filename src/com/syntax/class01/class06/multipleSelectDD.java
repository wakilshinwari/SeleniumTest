package com.syntax.class01.class06;

import com.sun.java.swing.plaf.motif.MotifBorders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multipleSelectDD {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the webelment dropDown

     WebElement statesDD= driver.findElement(By.cssSelector("select#multi-select"));

       // we can use select calss so we will make an object of select class

        Select select=new Select(statesDD);

     //   check if the drop down is multiple

       boolean ismul = select.isMultiple();
        System.out.println(ismul);

        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByVisibleText("Texas");

        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);

        //hwo to use deselect
        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");

        //Task : to use iterator to get all the options text and print in console
        //using Iterator can give us the webelement

       // get all the options --how can we get all the options

       List<WebElement> options = select.getOptions();

       //how to create an Iterator?

        Iterator<WebElement> it= options.iterator();
        while (it.hasNext()){
                System.out.println(it.next().getText());
            }
        }

    }


