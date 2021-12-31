package SeleniumReveiw01.Reveiw03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        WebElement alertBtn = driver.findElement(By.xpath("//*[@id='alert']"));

        alertBtn.click();

        // in order to go to the new pop up meiang th ecursor wil go from the main page to the new pop up box, we should
        //use Alert class and use th switchTO and then accept it
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); // I agree with what the alert say vs dismis which means I disagree with the alert condisitons
        Thread.sleep(2000);
        driver.quit();


    }

    }

