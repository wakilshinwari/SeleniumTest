package SeleniumReveiw01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }
}
