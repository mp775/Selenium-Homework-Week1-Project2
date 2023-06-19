package orangehrmlive_baseurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL in Browser
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //we give implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);
        //get the current url
        System.out.println("Current URL " + driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source " + driver.getPageSource());
        WebElement emailfield = driver.findElement(By.name("username"));
        emailfield.sendKeys("prime123@gmail.com");
        //find the password element
        WebElement Passwordfield = driver.findElement(By.name("password"));
        Passwordfield.sendKeys("Prime123");
        Thread.sleep(10000);
        //close url
        driver.close();


    }
}