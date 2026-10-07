package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmployee extends PageBase {

    public AddEmployee(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href*='viewPimModule']")
    WebElement pimMenu;

    @FindBy(css = "a[href*='addEmployee']")
    WebElement addEmployeeTab;

    @FindBy(css = "input[name='firstName']")
    WebElement firstNameTxt;

    @FindBy(css = "input[name='lastName']")
    WebElement lastNameTxt;

    @FindBy(css = "button[type='submit']")
    WebElement saveBtn;

    @FindBy(css = "h6.orangehrm-main-title")
    WebElement personalDetailsHeader;

    public void openAddEmployee() {
        clickButton(pimMenu);
        clickButton(addEmployeeTab);
    }

    public void addEmployee(String firstName, String lastName) {
        setTextElementText(firstNameTxt, firstName);
        setTextElementText(lastNameTxt, lastName);
        clickButton(saveBtn);
    }

    public String getPersonalDetailsHeader() {
        wait.until(ExpectedConditions.visibilityOf(personalDetailsHeader));
        return personalDetailsHeader.getText();
    }
}
