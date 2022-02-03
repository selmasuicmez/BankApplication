package stepdefinitions;

import pages.CreateANewCustomerPage;
import utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;


public class US09_CreateANewCustomerStepDefinitions {

    CreateANewCustomerPage createANewCustomerPage = new CreateANewCustomerPage();

    @Given("US09 user on the login page {string}")
    public void us09_user_on_the_login_page(String string) {
        Driver.getDriver().get(string);
    }

    @Given("US09 send username to {string}")
    public void us09_send_username_to(String string) {
        createANewCustomerPage.username.sendKeys(string);
    }

    @Given("US09 send password to {string}")
    public void us09_send_password_to(String string) {
        createANewCustomerPage.password.sendKeys(string);

    }

    @Given("US09 click sign in")
    public void us09_click_sign_in() throws InterruptedException {
        Thread.sleep(2000);
        createANewCustomerPage.signInButton.click();
    }

    @Given("US09 click to my operations")
    public void us09_click_to_my_operations() {
        createANewCustomerPage.myOperations.click();
    }

    @Given("US09 click to manage customers")
    public void us09_click_to_manage_customers() {
        createANewCustomerPage.manageCustomers.click();
    }

    @Given("US09 click to create a new customer")
    public void us09_click_to_create_a_new_customer() {
        createANewCustomerPage.createANewCustomer.click();
    }


    @Given("US09 TC01 type a valid SSN {string}")
    public void us09_TC01_type_a_valid_SSN(String string) {
        createANewCustomerPage.ssnSearch.sendKeys(string);
    }

    @Given("US09 TC01 click search")
    public void us09_TC01_click_search() throws InterruptedException {
        createANewCustomerPage.search.click();
        Thread.sleep(10000);
    }

    @Given("US09 getText from firstname")
    public void us09_getText_from_firstname() {
        System.out.println(createANewCustomerPage.firstName.getText());
    }

    @Given("US09 getText from lastname")
    public void us09_getText_from_lastname() {
        System.out.println(createANewCustomerPage.lastName.getText());
    }

    @Given("US09 getText from email")
    public void us09_getText_from_email() {
        System.out.println(createANewCustomerPage.emailBox.getText());
    }

    @Given("US09 getText from mobile phone number")
    public void us09_getText_from_mobile_phone_number() {
        System.out.println(createANewCustomerPage.mobilePhoneNumber.getText());
    }

    @Given("US09 getText from phone number")
    public void us09_getText_from_phone_number() {
        System.out.println(createANewCustomerPage.phoneNumber.getText());
    }

    @Given("US09 getText from phone ssn")
    public void us09_getText_from_phone_ssn() {
        System.out.println(createANewCustomerPage.ssnBox.getText());
    }



    @Given("US09 TC01 Send some string {string}")
    public void us09_TC01_Send_some_string(String string) throws InterruptedException {
        createANewCustomerPage.ssnSearch.sendKeys(string);
        Thread.sleep(10000);
    }


    @Given("US09 TC03 Send strings to firstname {string}")
    public void us09_TC03_Send_strings_to_firstname(String string) {
        createANewCustomerPage.firstName.sendKeys(string);
    }

    @Given("US09 TC03 Send strings to lastname {string}")
    public void us09_TC03_Send_strings_to_lastname(String string) {

      createANewCustomerPage.lastName.sendKeys(string);

    }

    @Given("US09 TC03 Send strings to Middle Initial {string}")
    public void us09_TC03_Send_strings_to_Middle_Initial(String string) {
        createANewCustomerPage.middleInitial.sendKeys(string);
    }

    @Given("US09 Send emails to {string}")
    public void us09_Send_emails_to(String string) {
        createANewCustomerPage.emailBox.sendKeys(string);
    }

    @Given("US09 Send numbers and string to mobile {string}")
    public void us09_Send_numbers_and_string_to_mobile(String string) {
        createANewCustomerPage.mobilePhoneNumber.sendKeys(string);
    }

    @Given("US09 Send numbers and string to phone {string}")
    public void us09_Send_numbers_and_string_to_phone(String string) {
       createANewCustomerPage.phoneNumber.sendKeys(string);

    }

    @Given("US09 Send numbers and string to zip code {string}")
    public void us09_Send_numbers_and_string_to_zip_code(String string) {
        createANewCustomerPage.zipCode.sendKeys(string);
    }

    @Given("US09 Send adress to adress box {string}")
    public void us09_Send_adress_to_adress_box(String string) {
        createANewCustomerPage.addressBox.sendKeys(string);
    }

    @Given("Us09 Send city to city box {string}")
    public void us09_Send_city_to_city_box(String string) {
      createANewCustomerPage.city.sendKeys(string);

    }

    @Given("US09 TC07 send numbers to {string}")
    public void us09_TC07_send_numbers_to(String string) {
        createANewCustomerPage.ssnBox.sendKeys(string);
    }

    @Given("US09 TC08 select date {string}")
    public void us09_TC08_select_date(String string) {
      createANewCustomerPage.createDate.sendKeys(string);

    }

    @Given("USO9 TC09 select country dropdown and select {string}")
    public void uso9_TC09_select_country_dropdown_and_select(String string) {
        Select select = new Select(createANewCustomerPage.countryDropdown);
        select.selectByVisibleText(string);
    }

    @Given("US09 TC10 send some strings to state box {string}")
    public void us09_TC10_send_some_strings_to_state_box(String string) {
        createANewCustomerPage.stateBox.sendKeys(string);
    }

    @Given("US09 TC11 select user dropdown and select {string}")
    public void us09_TC11_select_user_dropdown_and_select(String string) {
         Select select = new Select(createANewCustomerPage.userDropdown);
         select.selectByVisibleText(string);

    }

    @Given("US09 TC12 select {string}")
    public void us09_TC12_select(String string) {
        Select select = new Select(createANewCustomerPage.account);
        select.selectByVisibleText(string);
    }

    @Given("US09 TC13 zelle enrolled enabled")
    public void us09_TC13_zelle_enrolled_enabled() {
        createANewCustomerPage.zelleEnrolled.click();
    }

    @Given("US09 TC14 back clickable")
    public void us09_TC14_back_clickable() {
        createANewCustomerPage.backButton.click();
    }

    @Given("US09 TC15 save clickable")
    public void us09_TC15_save_clickable() {
        createANewCustomerPage.saveButton.click();
    }















}
