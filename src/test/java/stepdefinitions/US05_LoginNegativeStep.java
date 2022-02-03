package stepdefinitions;

import pages.LoginPage;
import utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_LoginNegativeStep {

    LoginPage loginPage = new LoginPage();

    @Given("users enter username and password as {string} and {string}")
    public void users_enter_username_and_password_as_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("users click on the signIn button")
    public void users_click_on_the_signIn_button() {
        loginPage.signInButton.click();

    }

    @Then("user sees the success message\"Failed to sign in!\"")
    public void user_sees_the_success_message_Failed_to_sign_in() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 20);
//        WebElement alertMessageWebelement = wait.until(ExpectedConditions.visibilityOf(loginPage.alertFailMessage));
//        String alertFailMessageText  = alertMessageWebelement.getText();
        String alertFailMessageText  = loginPage.alertFailMessage.getText();
        Assert.assertEquals(alertFailMessageText,"Failed to sign in! Please check your credentials and try again.");

    }


    @Given("users enter username and invalidPassword")
    public void users_enter_username_and_invalidPassword() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username_login_valid"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password_login_fake"));
    }

    @Given("users see the text:{string}")
    public void users_see_the_text(String text) {
       Assert.assertEquals(loginPage.resetPasswordOption.getText(),text);
    }

    @Given("users click the text")
    public void users_click_the_text() throws InterruptedException {

        loginPage.resetPasswordOption.click();
        loginPage.resetPasswordOption.click();
        Thread.sleep(2000);
    }

    @Then("users see new the text:{string}")
    public void users_see_new_the_text(String newText) throws InterruptedException {

        Assert.assertEquals(loginPage.resetPasswordNewText.getText(),newText);
    }

    @Given("users see the text:\"You don't have an account yet?")
    public void users_see_the_text_You_don_t_have_an_account_yet() {
        boolean registerOptionDisplayed=loginPage.againRegisterOption.isDisplayed();
        System.out.println(registerOptionDisplayed);

    }

    @When("users click on the text")
    public void users_click_on_the_text() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.againRegisterOption.click();
        loginPage.againRegisterOption.click();

    }

    @Then("users see the register title:{string}")
    public void users_see_the_register_title(String string) {
        boolean registerTitleDisplayed=loginPage.registerTitle.isDisplayed();
        System.out.println(registerTitleDisplayed);

    }








}
