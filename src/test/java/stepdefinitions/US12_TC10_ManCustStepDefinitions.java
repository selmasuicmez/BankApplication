package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCustomerPage;
import io.cucumber.java.en.Then;

public class US12_TC10_ManCustStepDefinitions {
    LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();

    @Then("there should be an Edit button")
    public void there_should_be_an_Edit_button() {
        boolean editButton = manageCustomerPage.editButton.isDisplayed();
        System.out.println("Edit button seen " + editButton);
    }

}