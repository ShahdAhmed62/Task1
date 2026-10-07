package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='username']")
    WebElement usernameTxt;


    @FindBy(css = "input[name='password']")
    WebElement passwordTxt;


    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(css = "h6.oxd-topbar-header-breadcrumb-module")
    WebElement dashboardTitle;

    public void userLogin(String username, String password) {
        setTextElementText(usernameTxt, username);
        
        setTextElementText(passwordTxt, password);
        clickButton(loginBtn);
    }

    public String getDashboardTitle() {
        wait.until(ExpectedConditions.visibilityOf(dashboardTitle));
        return dashboardTitle.getText();
    }
}
