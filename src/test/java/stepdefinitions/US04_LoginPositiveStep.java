package stepdefinitions;

import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_LoginPositiveStep {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url")); }

    @Given("mouse go to dropDown")
    public void mouse_go_to_dropDown() { loginPage.loginDropDown.click(); }

    @Given("mouse click on the signInText")
    public void mouse_click_on_the_signInText() { loginPage.signInText.click(); }

    @Given("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username_login_valid"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password_login_valid"));
    }

    @When("click on the signIn button")
    public void click_on_the_signIn_button() { loginPage.signInButton.click(); }

    @Then("user sees the success message")
    public void user_sees_the_success_message() {
      boolean successful_mesaj = loginPage.signInPage.getText().contains("successful login");
      System.out.println(successful_mesaj);
      Assert.assertFalse(successful_mesaj);
    }

    @Then("user verifies that the option the cancel")
    public void user_verifies_that_the_option_the_cancel() {
        boolean cancelButtonDisplayed = loginPage.cancelButton.isDisplayed();
        Driver.waitForVisibility(loginPage.cancelButton,8000);
        System.out.println(cancelButtonDisplayed);
        loginPage.cancelButton.click();

    }

}
