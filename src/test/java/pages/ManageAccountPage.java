package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAccountPage {

    public ManageAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (xpath = "//a[@id='jh-create-entity']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//input[@name='description']")
    public WebElement descriptionTextBox;

    @FindBy (xpath = "//input[@name='balance']")
    public WebElement balanceTextBox;

    @FindBy (id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy (id = "tp-account-accountStatusType")
    public WebElement accountStatusDropdown;

    @FindBy (name = "createDate")
    public WebElement createDate;

    @FindBy (name = "closedDate")
    public WebElement closedDate;

    @FindBy (id = "tp-account-employee")
    public WebElement employeeDropdown;

    @FindBy (id = "save-entity")
    public WebElement saveButton;

    @FindBy (xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement descriptionsErrorMessage;


    @FindBy (xpath = "(//div[.='This field is required.'])[4]")
    public WebElement balanceErrorMessage;

    @FindBy (xpath = "//input[@name='createDate']")
    public WebElement createDateBox;

    @FindBy (xpath = "//input[@name='closedDate']")
    public WebElement closedDateBox;

    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement firstIDitem;

    @FindBy(xpath = "//span[.='Account']")
    public WebElement accountInformation;

    @FindBy (xpath = "//span[.='You are not authorized to access this page.']")
    public WebElement negativeMessage;












}
