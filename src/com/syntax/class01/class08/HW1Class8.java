package com.syntax.class01.class08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1Class8 {
    private static Object windowHandles;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebElement btn = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Facebook']"));
        btn.click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        while (it.hasNext()) {
            String handler = it.next();
            driver.switchTo().window(handler);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Instagram")) {
        }
    }
        System.out.println("The title of the new window is : "+driver.getTitle());
        driver.quit();
}
}
