package SeleniumReveiw01.Reveiw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Class5 {

        public static void main (String[]args){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/dynamic-properties");
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enableAfter']")));
            WebElement button = driver.findElement(By.xpath("//*[@id='enableAfter']"));
            System.out.println(button.isEnabled());
            driver.quit();
        }
    }
