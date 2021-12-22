package com.syntax.class01.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class radioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value='Female'][@name='optradio'] "));
       // femaleRadioBtn.click();
        //check the femail button is displayed

       boolean isDisplayed = femaleRadioBtn.isDisplayed();
        System.out.println("The radio btn is displayed on the webpage : " +isDisplayed);

       boolean isEnabled =femaleRadioBtn.isEnabled();
        System.out.println("The radio is btn is displayed on the webpage : " + isEnabled);
      boolean isSelected= femaleRadioBtn.isSelected();

        System.out.println("The radio button is selected :" + isSelected);

//     select the female radio button only if its enabled== we can use if statement

        if(isEnabled){
            femaleRadioBtn.click();
        }
// after clicking the butn pritn if tis selected or not
        isSelected=femaleRadioBtn.isSelected();
        System.out.println("The female radio btn is selected of the webage :" + isDisplayed);


    }
}
