package stepdefinitions;

import pages.US01_UserRegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class US01_UserRegistrationStepDef {

    US01_UserRegistrationPage userRegPage = new US01_UserRegistrationPage();

    //US01TC01
    @Given("Go to bank.com home page us01")
    public void goToHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("gmibank_url"));
    }

    @Given("Click to User Account menu and Click to Register")
    public void click_to_User_Account_menu_and_Click_to_Register() {


        userRegPage.userMenu.click();
        userRegPage.userRegistrationButton.click();
    }


    @Given("Enter the SSN {string} with valid credential")
    public void enter_the_SSN_with_valid_credential(String string) {
        userRegPage.user_SSN.sendKeys(string);
    }




    @Given("Click on first name box")
    public void click_first_name_box(){
        userRegPage.userFirstName.click();
    }

    @Then ("There should be a valid SSN respecting")
    public void there_should_be_a_valid_SSN_respecting(){

       try {
            Assert.assertFalse(userRegPage.alertMessageSSN.isDisplayed());
       }catch (NoSuchElementException e){
         boolean  bln = true;
       }

    }

    //US01TC02

    @Given("Enter the name {string} with valid credential")
    public void enter_the_First_Name_with_valid_credential(String string) {
        userRegPage.userFirstName.clear();
        userRegPage.userFirstName.sendKeys(string);
    }

    @Given("click on last name box")
    public void click_on_last_name_box() {
        userRegPage.userLastName.click();

    }

    @Then("There should be a valid name respecting")
    public void there_should_be_a_valid_name_respecting(){
        try {
                Assert.assertFalse(userRegPage.alertMessageFirstName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC03

    @Given("Enter the last name {string} with valid credential")
    public void enter_the_Last_Name_with_valid_credential(String string) {
        userRegPage.userLastName.clear();
        userRegPage.userLastName.sendKeys(string);
    }

    @Given("click on Address box")
    public void click_on_Address_box() {
        userRegPage.userAddress.click();
    }

    @Then("There should be a valid last name respecting")
    public void there_should_be_a_valid_last_name_respecting(){
        try {
            Assert.assertFalse(userRegPage.alertMessageLastName.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC04
    @Given("Enter the Address")
    public void enter_the_Address() {
        userRegPage.userAddress.sendKeys(ConfigurationReader.getProperty("address01"));
    }

    @Given("click on mobile phone number box")
    public void click_on_mobile_phone_number_box() {
        userRegPage.userMobilePhoneNumber.click();
    }

    @Then("There should be a valid address respecting")
    public void there_should_be_a_valid_address_respecting() {
    }

    //US01TC05

    @Given("Enter the GSM {string} with valid credential")
    public void enter_the_Mobile_Phone_Number_with_valid_credential(String string) {
        userRegPage.userMobilePhoneNumber.clear();
        userRegPage.userMobilePhoneNumber.sendKeys(string);
    }

    @Given("click on username box")
    public void click_on_username_box() {
        userRegPage.userName.click();
    }

    @Then("There should be a valid mobile phone number respecting")
    public void there_should_be_a_valid_mobile_phone_number_respecting() {
        try {
            Assert.assertFalse(userRegPage.alertMessageMobileNumber.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC06

    @Given("Enter the valid username {string} with valid credentail")
    public void enter_the_username_with_valid_credentail(String string){
        userRegPage.userName.clear();
        userRegPage.userName.sendKeys(string);
    }

    @Given("click on email box")
    public void click_on_email_box() {
        userRegPage.userEmail.click();
    }

    @Then("There should be a valid username respecting")
    public void there_should_be_a_valid_username_respecting() {
        try {
            Assert.assertFalse(userRegPage.alertMessageUsername.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC07

    @Given("Enter the e-mail {string} with valid credential")
    public void enter_the_e_mail_with_valid_credential(String string) {
        userRegPage.userEmail.clear();
        userRegPage.userEmail.sendKeys(string);
    }

    @Given("click on new password box")
    public void click_on_new_password_box() {
        userRegPage.userFirstPassword.click();
    }

    @Then("There should be a valid email respecting")
    public void there_should_be_a_valid_email_respecting() {
        try {
            Assert.assertFalse(userRegPage.alertMessageEmail.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC08

    @Given("Enter the new {string} with valid credential")
    public void enter_the_new_password_with_valid_credential(String string) {
        userRegPage.userFirstPassword.clear();
        userRegPage.userFirstPassword.sendKeys(string);
    }

    @Given("click on new password confirmation box")
    public void click_on_new_password_confirmation_box() {
        userRegPage.userSecondPassword.click();
    }

    @Then("There should be a valid password respecting")
    public void there_should_be_a_valid_password_respecting() {
        try {
            Assert.assertFalse(userRegPage.alertMessagePassword.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC09

    @Given("Enter the same password with valid credential {string}")
    public void enter_the_same_password_with_valid_credential(String string) {
        userRegPage.userSecondPassword.sendKeys(string);
    }

    @Given("click on new password box02")
    public void click_on_new_password_box02() {
        userRegPage.userFirstPassword.click();
    }

    @Then("entry should be same with password")
    public void entry_should_be_same_with_password() {
        try {
            Assert.assertFalse(userRegPage.alertMessageSecondPassword.isDisplayed());
        }catch (NoSuchElementException e){
            boolean  bln = true;
        }
    }

    //US01TC10

    @Given("Click to Register button")
    public void click_to_Register_button() {
        userRegPage.registrationSubmitButton.submit();
    }

    @Then("There should be Succes message.")
    public void there_should_be_Succes_message() {
            try{
                Assert.assertTrue(userRegPage.successMessage.isDisplayed());
            }catch(Exception e){
                Assert.assertTrue(false);
            }
    }

}