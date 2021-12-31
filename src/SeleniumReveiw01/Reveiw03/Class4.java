package SeleniumReveiw01.Reveiw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

driver.switchTo().frame("frame1");
WebElement text=driver.findElement(By.xpath("//*[@id='sampleHeading']"));
String actualText=text.getText();

        System.out.println(actualText);
        Thread.sleep(1000);
        driver.quit();
    }
}
