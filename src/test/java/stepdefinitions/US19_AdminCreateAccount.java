package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageAccountPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class US19_AdminCreateAccount {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ManageAccountPage manageAccountPage = new ManageAccountPage();

    @Given("go to the sign in link")
    public void go_to_the_sign_in_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("type username and password than click on sign in button")
    public void type_username_and_password_than_click_on_sign_in_button() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username_admin"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password_admin"));
        loginPage.signInButton.click();
    }

    @Given("click on the  My Operations")
    public void click_on_the_My_Operations() {
        homePage.myOperationsDropdown.click();
    }

    @Given("click on the Manage Accounts")
    public void click_on_the_Manage_Accounts() {
        homePage.manageAccount.click();
    }

    @Given("click on  the +Create a new Account")
    public void click_on_the_Create_a_new_Account() {
        manageAccountPage.createAccountButton.click();
    }

    @Then("type some descriptions in the Descriptions text box")
    public void type_some_descriptions_in_the_Descriptions_text_box() {
        manageAccountPage.descriptionTextBox.sendKeys("First test account");
    }

    @Then("type a balance in the Balance text box")
    public void type_a_balance_in_the_Balance_text_box() {
        manageAccountPage.balanceTextBox.sendKeys("9000");
    }

    @Then("select an account type as CHECKING, SAVING,CREDIT_CARD or INVESTING")
    public void select_an_account_type_as_CHECKING_SAVING_CREDIT_CARD_or_INVESTING() {
        Select select = new Select(manageAccountPage.accountTypeDropdown);
        select.selectByIndex(2);
    }

    @Then("select an account status type as ACTIVE, SUSPENDED or CLOSED")
    public void select_an_account_status_type_as_ACTIVE_SUSPENDED_or_CLOSED() {
        Select select = new Select(manageAccountPage.accountStatusDropdown);
        select.selectByIndex(0);
    }

    @Then("select an employee from the Employee dropdown")
    public void select_an_employee_from_the_Employee_dropdown() {
        Select select = new Select(manageAccountPage.employeeDropdown);
        select.selectByIndex(0);
    }


}
