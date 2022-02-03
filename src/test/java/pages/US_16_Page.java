package pages;
import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_16_Page {
    public US_16_Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperationsLink;

    @FindBy(xpath = "//a[.='My Accounts']")
    public WebElement myAccountsLink;

    //@FindBy(xpath = "//a[.='Transfer Money']")
    //  @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]")
    public WebElement transferMoneyLink;

    @FindBy(xpath = "//td[.='19669']")
    public WebElement linkAccount1;

    @FindBy(xpath = "//td[.='19670']")
    public WebElement linkAccount2;

    @FindBy(xpath = "//span[.='aaa bbb']")
    public WebElement linkUseraaabbb;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement linkSignOut;

    @FindBy(id = "fromAccountId")
    public WebElement idFromDropdown;

    @FindBy(id = "toAccountId")
    public WebElement idToDropdown;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement linkBalance;

    @FindBy(id = "description")
    public WebElement linkDescription;

    @FindBy(id = "make-transfer")
    public WebElement linkMakeTransfer;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement alertSuccessMessage;

    @FindBy(xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
    public WebElement linkFirstViewTransaction;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody")
    public WebElement bodyOfTransactionHistory;
}
