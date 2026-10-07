package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }





    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
