package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_UserRegistrationPage {

    public US01_UserRegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (id = "account-menu")
    public WebElement userMenu;

    @FindBy (xpath = "//a[@href  = '/account/register']")
    public WebElement userRegistrationButton;

    @FindBy(id= "ssn")
    public WebElement user_SSN;

    @FindBy(xpath = "//input[@name = 'firstname']")
    public WebElement userFirstName;

    @FindBy(xpath = "//input[@name = 'lastname']")
    public WebElement userLastName;

    @FindBy(xpath = "//input[@name = 'address']")
    public WebElement userAddress;

    @FindBy(xpath = "//input[@name = 'mobilephone']")
    public WebElement userMobilePhoneNumber;

    @FindBy(xpath = "//input[@name = 'username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name = 'email']")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@name = 'firstPassword']")
    public WebElement userFirstPassword;

    @FindBy(xpath = "//input[@name = 'secondPassword']")
    public WebElement userSecondPassword;

    @FindBy(id = "register-submit")
    public WebElement registrationSubmitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'Your First Name is required')]")
    public WebElement alertMessageFirstName;

    @FindBy(xpath = "//*[contains(text(),'Your Last Name is required')]")
    public WebElement alertMessageLastName;

    @FindBy(xpath = "//div[(text() ='Your SSN is invalid')]")
    public WebElement alertMessageSSN;

    @FindBy(xpath = "//div[(text() ='translation-not-found[Your SSN is required]')]")
    public WebElement alertMessageSSN2;

    @FindBy(xpath = "//div[(text() ='Your mobile phone number is invalid')]")
    public WebElement alertMessageMobileNumber;

    @FindBy(xpath = "//div[(text() ='Your username is required.')]")
    public WebElement alertMessageUsername;

    @FindBy(xpath = "//div[(text() ='Your email is required.')]")
    public WebElement alertMessageEmail;

    @FindBy(xpath = "//div[(text() ='Your password is required.')]")
    public WebElement alertMessagePassword;

    @FindBy(xpath = "//div[(text() ='Your confirmation password is required.')]")
    public WebElement alertMessageSecondPassword;











}