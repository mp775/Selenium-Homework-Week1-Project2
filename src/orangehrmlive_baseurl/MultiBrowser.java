package orangehrmlive_baseurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = " Edge";
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if ( browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if ( browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser name.");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(" page title is " + title);
        System.out.println("current URL " + driver.getCurrentUrl());
        System.out.println(" page source " + driver.getPageSource());
        WebElement emailfield = driver.findElement(By.name("username"));
        emailfield.sendKeys("prime123@.gmail.com");
        WebElement Passwordfield = driver.findElement(By.name("password"));
        Passwordfield.sendKeys("Prime123");
        Thread.sleep(3000);
        driver.close();
    }
}
