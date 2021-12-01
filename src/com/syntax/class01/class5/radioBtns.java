package com.syntax.class01.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.lwawt.macosx.CSystemTray;

public class radioBtns {
    public static void main(String[] args) {
        System.setProperty ("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");



        WebElement femaleRadioBtn= driver.findElement(By. xpath("//input[@value='Female'][@name='optradio']"));
// click th eradiod button female
        femaleRadioBtn.click();

        //check if the radio button is displayed
        boolean isDisplayed= femaleRadioBtn. isDisplayed();
        System.out.println("The radio buton is displayed on the webpage :" + isDisplayed);

        //check if the radio buttong is enabled
        boolean isEnabled = femaleRadioBtn.isEnabled();
        System.out.println("The female radio button is enabled on the webpage  : " + isEnabled);

        //chieck if the female radio button is selected

        boolean isSelected= femaleRadioBtn.isSelected();
        System.out.println("The famale radio button is selected on the webPage : " + isSelected);

// select the famle radio button only if its Enabled
        if (isEnabled){
            femaleRadioBtn.click();
        }
        //after clicking the btn print if its selected or not
        System.out.println("The female  radio button is selected on the wepPage : " + isSelected);
    }
}
