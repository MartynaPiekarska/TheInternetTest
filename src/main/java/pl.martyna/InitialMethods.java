package pl.martyna;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitialMethods {

    static WebDriver driver;
    String theInternet = "https://the-internet.herokuapp.com/";

    @Before("@qa")
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After("@qa")
    public void tearDown() {
        driver.quit();
    }

    public void goToTheInternet() {
        driver.navigate().to(theInternet);
    }

    public void selectPage(String exercise) {
        driver.findElement(By.xpath("//a[text()='" + exercise + "']")).click();
    }

}
