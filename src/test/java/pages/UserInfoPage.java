package pages;


import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserInfoPage {

    public UserInfoPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@role='menuitem'])[3]")
    public WebElement userInfoLink;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement saveAlert;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement buttonSignin;

    @FindBy(name="langKey")
    public WebElement languageDropDown;



    @FindBy(xpath ="//*[@id=\"settings-form\"]/div[3]/div" )
    public WebElement invalidField;



}





