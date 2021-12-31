package com.syntax.class01.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebtable {

    public static java.lang.String url="https://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        //print all the rows of the webtable in the console
        //     1. find the rows in the table using xpath and save it in a  variable
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        //print th enumber of rows

        System.out.println("The number of rows in the table are " + tableRows.size());

        // 2. iterate through each webelement and get the text out of it

        for (WebElement row : tableRows) {
            String text1 = row.getText();
            System.out.println(text1);
        }
        List<WebElement> tableHeads =driver.findElements(By.xpath("//*[@id='task-table']/thead/tr/th"));
        System.out.println(tableHeads.size());
        Iterator<WebElement> it2= tableHeads.iterator();
        while (it2.hasNext()){
            WebElement a2=it2.next();
            System.out.print(a2.getText()+" ");
        }
    }
}
