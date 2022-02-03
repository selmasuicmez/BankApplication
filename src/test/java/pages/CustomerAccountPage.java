package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAccountPage {
    public CustomerAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//h2")
    public WebElement customerAccountText;

    @FindBy (xpath = "(//button)[2]")
    public WebElement buttonOfTransactionView;

    @FindBy (xpath = "//*[contains(text(),'Transfer 500')]")
    public WebElement validateTransfer;
}
