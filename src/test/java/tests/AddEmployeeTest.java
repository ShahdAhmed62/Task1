package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AddEmployee;
import pages.LoginPage;

public class AddEmployeeTest extends TestBase {



    @Test
    @Parameters({"username", "password", "firstname", "lastname"})
    public void userCanAddEmployee(String username, String password, String firstname, String lastname) {
        LoginPage loginObject = new LoginPage(driver);
        loginObject.userLogin(username, password);

        AddEmployee addEmployeeObject = new AddEmployee(driver);

        addEmployeeObject.openAddEmployee();
        addEmployeeObject.addEmployee(firstname, lastname);
        
        Assert.assertTrue(addEmployeeObject.getPersonalDetailsHeader().contains("Personal Details"));
    }
}
