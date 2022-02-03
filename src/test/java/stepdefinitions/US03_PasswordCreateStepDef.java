package stepdefinitions;

import pages.PasswordCreatePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US03_PasswordCreateStepDef {
    PasswordCreatePage passCreatePage = new PasswordCreatePage();
    @Given("User go to the Bank home page")
    public void userGoToTheGMiBankHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @And("Click on user button")
    public void clickOnUserButton() {
        passCreatePage.userButton.click();
    }
    @And("You should navigate to registration page")
    public void youShouldNavigateToRegistrationPage() {
        passCreatePage.registerButton.click();
    }
    @And("Click on Password textbox")
    public void clickOnPasswordTextbox() {
        passCreatePage.firstPassBox.click();
    }
    @And("Enter a password with 1 lowercase letter of at least 7 characters")
    public void enterAPasswordWithLowercaseLetterOfAtLeastCharacters() {
        passCreatePage.firstPassBox.sendKeys(ConfigurationReader.getProperty("lower_case"));
        String renk = passCreatePage.line1.getCssValue("background-color");
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("orange")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 uppercase letter of at least 7 characters")
    public void enterAPasswordWithUppercaseLetterOfAtLeastCharacters() {
        passCreatePage.firstPassBox.sendKeys(ConfigurationReader.getProperty("upper_case"));
        String renk = passCreatePage.line1.getCssValue("background-color");
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("orange")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 digit of at least 7 characters")
    public void enterAPasswordWithDigitOfAtLeastCharacters() {
        passCreatePage.firstPassBox.sendKeys(ConfigurationReader.getProperty("digit"));
        String renk = passCreatePage.line1.getCssValue("background-color");
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("red")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 1 special char of at least 7 characters")
    public void enterAPasswordWithSpecialCharOfAtLeastCharacters() {
        passCreatePage.firstPassBox.sendKeys(ConfigurationReader.getProperty("special_char"));
        String renk = passCreatePage.line1.getCssValue("background-color");
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("orange")));
        Driver.passwordReliability();
    }
    @And("Enter a password with 7 chars")
    public void enterAPasswordWithChars() {
        passCreatePage.firstPassBox.sendKeys(ConfigurationReader.getProperty("full_pass"));
        String renk = passCreatePage.line1.getCssValue("background-color");
        Assert.assertTrue(renk.contains(ConfigurationReader.getProperty("dark_green")));
        Driver.passwordReliability();
    }
    @And("Click on password confirmation textbox")
    public void clickOnPasswordConfirmationTextbox() {
        passCreatePage.secondPassBox.click();
    }
    @Then("Enter to second textbox with 1 lowercase letter of at least 7 characters")
    public void enterToSecondTextboxWithLowercaseLetterOfAtLeastCharacters() {
        passCreatePage.secondPassBox.sendKeys(ConfigurationReader.getProperty("lower_case"));
    }
    @Then("Enter to second textbox with 1 uppercase letter of at least 7 characters")
    public void enterToSecondTextboxWithUppercaseLetterOfAtLeastCharacters() {
        passCreatePage.secondPassBox.sendKeys(ConfigurationReader.getProperty("upper_case"));
    }
    @Then("Enter to second textbox with 1 digit of at least 7 characters")
    public void enterToSecondTextboxWithDigitOfAtLeastCharacters() {
        passCreatePage.secondPassBox.sendKeys(ConfigurationReader.getProperty("digit"));
    }
    @Then("Enter to second textbox with 1 special char of at least 7 characters")
    public void enterToSecondTextboxWithSpecialCharOfAtLeastCharacters() {
        passCreatePage.secondPassBox.sendKeys(ConfigurationReader.getProperty("special_char"));
    }
    @Then("Enter to second textbox a password with 7 chars")
    public void enterToSecondTextboxAPasswordWithChars() {
        passCreatePage.secondPassBox.sendKeys(ConfigurationReader.getProperty("full_pass"));
    }
    @And("Color line must be orange or green")
    public void colorLineMustBeOrangeOrGreen() {
    }
}