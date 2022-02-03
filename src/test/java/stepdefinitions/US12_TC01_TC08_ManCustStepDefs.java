package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageCustomerPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US12_TC01_TC08_ManCustStepDefs {
    LoginPage loginPage=new LoginPage();
    HomePage homePage = new HomePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();

    @Given("Go to the Bank sign in page")
    public void go_to_the_Bank_sign_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("Type username and password then click on sign in button")
    public void type_username_and_password_then_click_on_sign_in_button() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username_employee"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password_employee"));
        loginPage.signInButton.click();

    }

    @Given("Click the Manage Customers button")
    public void click_the_Manage_Customers_button() {
        homePage.manageCustomer.click();
    }

    @Given("Click the button to last page")
    public void click_the_button_to_last_page() {
        manageCustomerPage.lastpagebutton.click();

    }
    //TC_0001
    @Then("On the customer page, the user should see the customer's First Name")
    public void on_the_customer_page_the_user_should_see_the_customer_s_First_Name() {
        boolean firstName = manageCustomerPage.firstNameText.isDisplayed();
        System.out.println("The customer's First Name is displayed: "+firstName);
    }
    //TC_0002
    @Then("On the customer page, the user should see the customer's Last Name")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Last_Name() {
        boolean lastName = manageCustomerPage.lastNameText.isDisplayed();
        System.out.println("The customer's Last Name is displayed: "+lastName);
    }
    //TC_0003
    @Then("On the customer page, the user should see the customer's Middle Initial")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Middle_Initial() {
        boolean middleInitial = manageCustomerPage.middleInitialText.isDisplayed();
        System.out.println("The customer's Middle Initial is displayed: "+middleInitial);

    }
    //TC_0004
    @Then("on the customer page, the user should see the customer's Email")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Email() {
        boolean email = manageCustomerPage.emailText.isDisplayed();
        System.out.println("The customer's Email is displayed: "+email);

    }
    //TC_0005
    @Then("On the customer page, the user should see the customer's Mobile Phone Number")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Mobile_Phone_Number() {
        boolean mobilePhoneNumber = manageCustomerPage.mobilPhoneNumberText.isDisplayed();
        System.out.println("The customer's Mobile Phone Number is displayed: "+mobilePhoneNumber);

    }
    //TC_0006
    @Then("On the customer page, the user should see the customer's Phone Number")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Phone_Number() {
        boolean phoneNumber = manageCustomerPage.phoneNumberText.isDisplayed();
        System.out.println("The customer's Phone Number is displayed: "+phoneNumber);

    }
    //TC_0007
    @Then("on the customer page, the user should see the customer's Address")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Address() {
        boolean address = manageCustomerPage.addressText.isDisplayed();
        System.out.println("The customer's Address is displayed: "+address);

    }
    //TC_0008
    @Then("On the customer page, the user should see the customer's Create Date")
    public void on_the_customer_page_the_user_should_see_the_customer_s_Create_Date() {
        boolean createDate = manageCustomerPage.createDateText.isDisplayed();
        System.out.println("The customer's Create Date is displayed: "+createDate);

    }


}




















