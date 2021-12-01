import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class syntaxWebSite {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.syntax.com");
        String url =driver.getCurrentUrl();
        System.out.println("The current url is: " + url);

        String titel=driver.getTitle();
        System.out.println("The current title of the page is:" + titel);
        driver.quit();


    }
}
