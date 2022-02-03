package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US12_TC11_ManCustStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();

    @Given("Click on Edit button")
    public void click_on_Edit_button() {
        manageCustomerPage.editButton.click();

    }

    @Given("Clear on the customer Email textbox")
    public void clear_on_the_customer_Email_textbox() {
        manageCustomerPage.emailBox.clear();

    }

    @Given("Click on the customer Email textbox and type a new Email")
    public void click_on_the_customer_Email_textbox_and_type_a_new_Email() {
        manageCustomerPage.emailBox.sendKeys("mhmtact@gmail.xom");

    }

    @Given("Clear on the customer Mobile Phone Number textbox")
    public void clear_on_the_customer_Mobile_Phone_Number_textbox() {
        manageCustomerPage.mobilePhoneNumberBox.clear();

    }

    @Given("Click on the customer Mobile Phone Number textbox and type a new Mobile Phone Number")
    public void click_on_the_customer_Mobile_Phone_Number_textbox_and_type_a_new_Mobile_Phone_Number() {
        manageCustomerPage.mobilePhoneNumberBox.sendKeys("244-555-6688");

    }

    @Given("Clear on the customer Phone Number textbox")
    public void clear_on_the_customer_Phone_Number_textbox() {
        manageCustomerPage.phoneNumberBox.clear();

    }

    @Given("Click on the customer Phone Number textbox and type a new Phone Number")
    public void click_on_the_customer_Phone_Number_textbox_and_type_a_new_Phone_Number() {
        manageCustomerPage.phoneNumberBox.sendKeys("155-666-7788");

    }

    @Given("Clear on the customer Zip Code textbox")
    public void clear_on_the_customer_Zip_Code_textbox() {
        manageCustomerPage.zipCode.clear();
    }

    @Given("Click on the customer Zip Code textbox and type a new Zip Code")
    public void click_on_the_customer_Zip_Code_textbox_and_type_a_new_Zip_Code() {
        manageCustomerPage.zipCode.sendKeys("90002");

    }

    @Given("Clear on the customer Address textbox")
    public void clear_on_the_customer_Address_textbox() {
        manageCustomerPage.addressBox.clear();

    }

    @Given("Click on the customer Address textbox and type a new Address")
    public void click_on_the_customer_Address_textbox_and_type_a_new_Address() {
        manageCustomerPage.addressBox.sendKeys("Victoria street 65");

    }

    @Given("Clear on the customer City textbox")
    public void clear_on_the_customer_City_textbox() {
        manageCustomerPage.cityBox.clear();

    }

    @Given("Click on the customer City textbox and type a new City")
    public void click_on_the_customer_City_textbox_and_type_a_new_City() {
        manageCustomerPage.cityBox.sendKeys("Philadelphia");

    }

    @Given("Clear on the customer Create Date textbox")
    public void clear_on_the_customer_Create_Date_textbox() {
        manageCustomerPage.createDateBox.clear();

    }

    @Given("Click on the customer Create Date textbox and type a new Create Date")
    public void click_on_the_customer_Create_Date_textbox_and_type_a_new_Create_Date() {
        manageCustomerPage.createDateBox.sendKeys("2020-11-20T07:00AM");

    }

    @Given("Clear on the customer State textbox")
    public void clear_on_the_customer_State_textbox() {
        manageCustomerPage.stateBox.clear();

    }

    @Given("Click on the customer State textbox and type a new State")
    public void click_on_the_customer_State_textbox_and_type_a_new_State() {
        manageCustomerPage.stateBox.sendKeys("Pennsylvania");

    }

    @Given("Click on Zelle Enrolled")
    public void click_on_Zelle_Enrolled() {

    }

    @Given("Click on Save button")
    public void click_on_Save_button() {
        manageCustomerPage.saveButton.click();
    }

    @Then("The user should see a message confirming that they have saved the edited information.")
    public void the_user_should_see_a_message_confirming_that_they_have_saved_the_edited_information() {
        Assert.assertTrue(manageCustomerPage.confirmMessage.isDisplayed());


    }
}