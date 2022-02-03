package stepdefinitions;

import pages.CustomerAccountPage;
import pages.HomePage;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class US15_CheckingAccount {

    HomePage homePage = new HomePage();
    CustomerAccountPage customerAccountPage = new CustomerAccountPage();


    @And("Click on My Operations dropdown")
    public void clickOnMyOperationsDropdown() {
    homePage.myAccountDropdown.click();
    }


    @Given("Choose My Account from dropdown menu")
    public void choose_My_Account_from_dropdown_menu() throws InterruptedException {
        Driver.wait(2);
    homePage.myAccountOption.click();
    }
    @Given("Confirm the seeing of acount types and balance populated")
    public void confirm_the_seeing_of_acount_types_and_balance_populated() {
        Assert.assertEquals("Customer Accounts",customerAccountPage.customerAccountText.getText());
        Driver.closeDriver();
    }
    @Given("Click on Transaction button")
    public void click_on_Transaction_button() {
    customerAccountPage.buttonOfTransactionView.click();
    }


    @Given("Confirm the seeing of transaction")
    public void confirm_the_seeing_of_transaction() {
        Assert.assertEquals("Transfer 500.00 to account ID: 19665",customerAccountPage.validateTransfer.getText());
        Driver.closeDriver();
    }

}