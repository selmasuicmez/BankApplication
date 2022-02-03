package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCustomerPage {

    public ManageCustomerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//button[.='Search']")
    public WebElement searchButton;

    @FindBy(id = "tp-customer-user")
    public WebElement userBox;

    @FindBy(xpath = "(//a[@class='page-link'])[7]")
    public WebElement lastpagebutton;

    @FindBy(xpath = "//*[.='First Name']")
    public WebElement firstNameText;

    @FindBy(xpath = "//*[.='Last Name']")
    public WebElement lastNameText;

    @FindBy(xpath = "//*[.='Middle Initial']")
    public WebElement middleInitialText;

    @FindBy(xpath = "//*[.='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//*[.='Mobile Phone Number']")
    public WebElement mobilPhoneNumberText;

    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phoneNumberText;

    @FindBy(xpath = "//*[.='Address']")
    public WebElement addressText;

    @FindBy(xpath = "//*[.='Create Date']")
    public WebElement createDateText;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButton;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[2]")
    public WebElement editButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameBox;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastNameBox;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitialBox;

    @FindBy(id = "tp-customer-email")
    public WebElement emailBox;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneNumberBox;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumberBox;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement addressBox;

    @FindBy(id = "tp-customer-city")
    public WebElement cityBox;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssnBox;

    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateBox;

    @FindBy(id = "tp-customer-country")
    public WebElement countryDropdown;

    @FindBy(id = "tp-customer-state")
    public WebElement stateBox;

    @FindBy(id = "tp-customer-user")
    public WebElement userDropdown;

    @FindBy(id = "tp-customer-account")
    public WebElement accountDropdown;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledRadButton;

    @FindBy(id = "tp-customer-account")
    public WebElement statusDropdown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement alertDeleteButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertErrorMessage;

    @FindBy(xpath= "//div[@style='pointer-events: none;']")
    public WebElement confirmMessage;

    @FindBy(id = "gmibankfrontendApp.tPCustomer.delete.question")
    public WebElement alertConfirmMessage;

}







