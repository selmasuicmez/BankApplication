package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCustomerPage;
import io.cucumber.java.en.Then;

public class US12_TC09_ManCustStepDefinitions {
    LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();

    @Then("Then there should be a View option")
    public void then_there_should_be_a_View_option() {
        boolean viewButton = manageCustomerPage.viewButton.isDisplayed();
        System.out.println("View button is displayed: "+viewButton);
    }
}
