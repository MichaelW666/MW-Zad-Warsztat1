package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ConnectionBase {
    protected static WebDriver driver;
    public static void openChrome() {
       // System.setProperty("webdriver.chrome.driver",
       //         "src/main/resources/drivers/chromedriver.exe");

        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/drivers/geckodriver.exe");
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }
}
