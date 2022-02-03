package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperationsDropdown;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myAccountDropdown;

    @FindBy(xpath = "//a[@href='/tp-account']")
    public WebElement manageAccount;

    @FindBy (xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomer;

    @FindBy(xpath = "(//a[@aria-haspopup='true'])[2]")
    public WebElement userDropdown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement dropdownPasswordtext;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement myAccountOption;




}
