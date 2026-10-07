package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {

    @Test
    @Parameters({"username", "password"})
    public void userCanLogin(String username, String password) {
        
        LoginPage loginObject = new LoginPage(driver);
        loginObject.userLogin(username, password);

        Assert.assertTrue(loginObject.getDashboardTitle().contains("Dashboard"));
    }
}
