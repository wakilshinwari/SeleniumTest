package SeleniumReveiw01.Reveiw03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement checkedBox = driver.findElement(By.xpath("//*[@value='Option-1']"));

        if (checkedBox.isSelected()){
            System.out.println("It is a already selected");
        }else{
            checkedBox.click();
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
