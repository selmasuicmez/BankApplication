package stepdefinitions;

import pages.LoginPage;
import pages.UserInfoPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US06_UserInfo {

    UserInfoPage userInfoPage = new UserInfoPage();
    LoginPage loginPage = new LoginPage();


    @Given("Click to the login page")
    public void click_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("Enter the username")
    public void enter_the_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username_info"));

    }
    @And("Enter the password")
    public void enter_the_password(){
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password_info"));
    }

    @Given("Click to Sign in button")
    public void click_to_Sign_in_button() {
        loginPage.signInButton.click();

    }

    @And("Click to User drop down menu")
    public void clickToUserDropDownMenu() {

        loginPage.loginDropDown.click();
    }

    @And("Click to Sign in")
    public void clickToSignIn() {
        userInfoPage.buttonSignin.click();
    }

    @Given("Click to User info")
    public void click_to_User_info() {

        userInfoPage.userInfoLink.click();
    }

    @Given("First Name")
    public void First_Name() {

        Assert.assertTrue(userInfoPage.firstNameBox.isDisplayed());
    }

    @And("Last Name")
    public void assert_that_Last_Name_is_not_empty() {
        Assert.assertTrue(userInfoPage.lastNameBox.isDisplayed());


    }
    @And("Email")
    public void assert_that_Email_is_not_empty() {
        Assert.assertTrue(userInfoPage.emailBox.isDisplayed());
    }

    @Given("Save button")
    public void save_button() {
        userInfoPage.saveButton.click();
    }

    @Then("You should see save settings")
    public void you_should_see_save_settings () {
        userInfoPage.saveAlert.getText().contains("Settings save!");
        System.out.println("Settings save!  message");

    }


    @Given("Update to First Name")
    public void updateToFirstName() {
        userInfoPage.firstNameBox.clear();
        userInfoPage.firstNameBox.sendKeys(ConfigurationReader.getProperty("updateFirstName_info"));
    }

    @Then("see save settings")
    public void see_save_settings () {
        userInfoPage.saveAlert.getText().contains("Settings save!");
        System.out.println("Settings save!  message");

    }

    @Given("Update to Last Name")
    public void updateToLastName() {
        userInfoPage.lastNameBox.clear();
        userInfoPage.lastNameBox.sendKeys(ConfigurationReader.getProperty("updateLastName_info"));
    }
    @Then("save settings")
    public void save_settings () {
        userInfoPage.saveAlert.getText().contains("Settings save! ");
        System.out.println("Settings save!  message");

    }

    @Given("Update to Email")
    public void updateToEmail() {
        userInfoPage.emailBox.clear();
        userInfoPage.emailBox.sendKeys(ConfigurationReader.getProperty("updateEmail_info"));
    }
    @Then("Settings Save")
    public void settings_save(){
        userInfoPage.saveAlert.getText().contains("Settings save! message");
        System.out.println("Settings save!  message");


    }

}
