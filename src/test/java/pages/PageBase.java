package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class PageBase {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public PageBase(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        PageFactory.initElements(driver, this);
    }

    protected void clickButton(WebElement button) {

        
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

    protected void setTextElementText(WebElement textElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(textElement));
        textElement.sendKeys(value);
    }
}
