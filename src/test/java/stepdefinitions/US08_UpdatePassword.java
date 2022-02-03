package stepdefinitions;

import pages.HomePage;
import pages.LoginPage;
import pages.UpdatePasswordPage;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US08_UpdatePassword {
    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();
    UpdatePasswordPage updatePasswordPage = new UpdatePasswordPage();

    @Given("Go to URL {string}")
    public void go_to_URL(String string) {
        Driver.getDriver().get(string);
    }

    @Given("Click on dropdown menu")
    public void click_on_dropdown_menu() {
        loginPage.loginDropDown.click();
    }

    @Given("Choose Sign-in")
    public void choose_Sign_in() {
        loginPage.signInText.click();
    }
    @Given("Type username of customer {string}")
    public void type_username_of_customer(String string) {
        loginPage.username.sendKeys(string);
    }
    @Given("Type password {string}")
    public void type_password(String string) throws InterruptedException {
        Driver.wait(2);
        loginPage.password.sendKeys(string);
    }
    @Given("Click on Sign-in button")
    public void click_on_Sign_in_button() {
        loginPage.signInButton.click();
    }

    @Given("Click on User dropdown menu")
    public void click_on_User_dropdown_menu() {
        homePage.userDropdown.click();
    }
    @Given("Choose password from dropdown menu")
    public void choose_password_from_dropdown_menu() {
        homePage.dropdownPasswordtext.click();
    }
    @Given("Click on Current Password box")
    public void click_on_Current_Password_box() {
        updatePasswordPage.currentPasswordbox.click();
    }
    @Given("Type Current Password as the {string}")
    public void type_Current_Password_as_the(String string) {
        updatePasswordPage.currentPasswordbox.sendKeys(string);
    }
    @Given("Click on New Password box")
    public void click_on_New_Password_box() {
        updatePasswordPage.newPasswordbox.click();

    }
    @Given("Type New Password as the {string}")
    public void type_New_Password_as_the(String string) {
        updatePasswordPage.newPasswordbox.sendKeys(string);
    }
    @Given("Click on New Password confirmation box")
    public void click_on_New_Password_confirmation_box() {
        updatePasswordPage.confirmPasswordbox.click();
    }
    @Given("Type New Password confirmation box as the {string}")
    public void type_New_Password_confirmation_box_as_the(String string) {
        updatePasswordPage.confirmPasswordbox.sendKeys(string);
    }
    @Given("Click-on Save button")
    public void click_on_Save_button() {
        updatePasswordPage.savebutton.click();
    }
    @Then("Confirm the warning message")
    public void confirm_the_warning_message() throws InterruptedException {
        Thread.sleep(2000);
        String message=updatePasswordPage.warningMessage.getText();
        //System.out.println(message);
        Assert.assertEquals("A","Password changed!",message);
        Driver.closeDriver();

    }


    @And("Confirm the the level chart change after typing last lowercase letter accorgingly")
    public void confirmTheTheLevelChartChangeAfterTypingLastLowercaseLetterAccorgingly() {
        String message2 = updatePasswordPage.scalaOfStrenghtFirst.getAttribute("style");
        //System.out.println(message2);
        Assert.assertNotEquals("2","background-color: rgb(255, 0, 0);",message2);
        Driver.closeDriver();
    }

    @And("Confirm the the level chart change after typing last uppercase letter accorgingly")
    public void confirmTheTheLevelChartChangeAfterTypingLastUppercaseLetterAccorgingly() {
        String message3 = updatePasswordPage.scalaOfStrenghtSecond.getAttribute("style");
        //System.out.println(message3);
        Assert.assertNotEquals("3","background-color: rgb(255, 0, 0);",message3);
        Driver.closeDriver();
    }

    @And("Confirm the the level chart change after typing last digit accorgingly")
    public void confirmTheTheLevelChartChangeAfterTypingLastDigitAccorgingly() {
        String message4 = updatePasswordPage.scalaOfStrenghtForth.getAttribute("style");
        //System.out.println(message4);
        Assert.assertNotEquals("4","background-color: rgb(221, 221, 221);",message4);
        Driver.closeDriver();
    }

    @Then("Confirm the the level chart change after typing the last character accorgingly")
    public void confirmTheTheLevelChartChangeAfterTypingTheLastCharacterAccorgingly() {
        String message5 = updatePasswordPage.scalaOfStrenghtFifth.getAttribute("style");
        //System.out.println(message5);
        Assert.assertNotEquals("5","background-color: rgb(221, 221, 221);",message5);
        Driver.closeDriver();
    }

    @Then("Confirm the the level chart change after typing {int}th char accorgingly")
    public void confirmTheTheLevelChartChangeAfterTypingThCharAccorgingly(int arg0) {
        String message6 = updatePasswordPage.scalaOfStrenghtFifth.getAttribute("style");
        //System.out.println(message6);
        Assert.assertEquals("5","background-color: rgb(221, 221, 221);",message6);
        Driver.closeDriver();

    }


}