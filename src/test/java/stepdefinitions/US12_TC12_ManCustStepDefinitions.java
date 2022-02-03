package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US12_TC12_ManCustStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();


    @Given("Click on Delete button")
    public void click_on_Delete_button() {
        manageCustomerPage.deleteButton.click();

    }
    @Given("The user should see the Alert message: -Are you sure you want to delete Customer ....?-")
    public void the_user_should_see_the_Alert_message_Are_you_sure_you_want_to_delete_Customer() {
        String string = manageCustomerPage.alertConfirmMessage.getText();
        System.out.println(string);
    }

    @Given("Click on Delete button in Alert window")
    public void click_on_Delete_button_in_Alert_window() {
        manageCustomerPage.alertDeleteButton.click();

    }

    @Then("The user should not see error message")
    public void the_user_should_not_see_error_message() {
        boolean message = manageCustomerPage.errorMessage.isDisplayed();
        Assert.assertTrue(message);
        System.out.println("The user should not see error message: "+message);

    }

}
