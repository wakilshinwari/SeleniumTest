package SeleniumReveiw01.Reveiw03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6 {
        public static void main (String[]args){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
    }
}
