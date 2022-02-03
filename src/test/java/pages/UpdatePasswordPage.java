package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePasswordPage {
    public UpdatePasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Current password']")
    public WebElement currentPasswordbox;
    @FindBy(xpath = "//input[@placeholder='New password']")
    public WebElement newPasswordbox;
    @FindBy(xpath = "//input[@placeholder='Confirm the new password']")
    public WebElement confirmPasswordbox;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement savebutton;
    @FindBy(xpath = "(//strong)[1]")
    public WebElement warningMessage;
    @FindBy (xpath = "//li[@class='point']")
    public WebElement scalaOfStrenghtFirst;
    @FindBy (xpath = "(//li[@class='point'])[2]")
    public WebElement scalaOfStrenghtSecond;
    @FindBy (xpath = "(//li[@class='point'])[3]")
    public WebElement scalaOfStrenghtThird;
    @FindBy (xpath = "(//li[@class='point'])[4]")
    public WebElement scalaOfStrenghtForth;
    @FindBy (xpath = "(//li[@class='point'])[5]")
    public WebElement scalaOfStrenghtFifth;


}
