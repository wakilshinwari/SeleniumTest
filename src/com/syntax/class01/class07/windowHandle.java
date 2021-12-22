package com.syntax.class01.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        //get the address /handle of the page /window
        String signUpPageHandle = driver.getWindowHandle();
        System.out.println("The window handle for signup page is : " + signUpPageHandle);

        //locate the btns help, terms, privacy
       WebElement helpBtn=driver.findElement(By.xpath("//a[text()='Help']"));
      WebElement termBtn =driver.findElement(By.xpath("//a[text()='Terms']"));
        WebElement privacyBtn =driver.findElement(By.xpath("//a[text()='Privacy']"));
        //click on them to open up new windows
        helpBtn.click();
        termBtn.click();
        privacyBtn.click();
        //
        //we havent switched the focus so it is still on the main/home/signup page
        //to get all the windows handles

        //we use se to and string becuse they give us get all the windows
        Set<String> allWindowHandles = driver.getWindowHandles();
//print the size of allWindowHandles
        System.out.println("nubmer of window handles is  : " + allWindowHandles);

        //inorder to print all window handles we need to iterate over the SET

        Iterator<String> it=allWindowHandles.iterator();
       signUpPageHandle=it.next();
       String helpPageHandle = it.next();
       String termPageHandle=it.next();
       String privacypageHandle=it.next();

        System.out.println("The handle for signup page is  : " + signUpPageHandle);
        System.out.println("The handle for helpPage page is  : " + helpPageHandle);
        System.out.println("The handle for termPage page is  : " + termPageHandle);
        System.out.println("The handle for Privacypage page is  : " + privacypageHandle);

        //switch to help page
        driver.switchTo().window(privacypageHandle);
        System.out.println(driver.getTitle());

    }
}
