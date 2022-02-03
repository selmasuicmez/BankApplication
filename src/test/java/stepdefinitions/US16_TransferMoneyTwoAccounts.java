package stepdefinitions;

import pages.US_16_Page;
import utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US16_TransferMoneyTwoAccounts {

    US_16_Page us_16_page = new US_16_Page();
    Actions actions = new Actions(Driver.getDriver());

    //Background ----------
    @Given("user enters customer username {string}")
    public void user_enters_customer_username(String username) {
        us_16_page.username.sendKeys(username);
    }

    @Given("user enters customer password {string}")
    public void user_enters_customer_password(String password) {
        us_16_page.password.sendKeys(password);
    }

    //@TC1601 -------------

    @Given("user clicks customer myOperations link")
    public void user_clicks_customer_myOperations_link() {

        us_16_page.myOperationsLink.click();

    }

    @Given("user clicks My Accounts link")
    public void user_clicks_My_Accounts_link() {
        us_16_page.myAccountsLink.click();
    }

    @Given("user verify Account Type1 {string} can be seen")
    public void user_verify_Account_Type1_can_be_seen(String account1) {
        Assert.assertTrue(us_16_page.linkAccount1.isDisplayed());
        System.out.println(us_16_page.linkAccount1);

        String accountType1 = us_16_page.linkAccount1.getText();
        System.out.println(accountType1);

        Assert.assertEquals(account1,accountType1);
    }

    @Given("user verify Account Type2 {string} can be seen")
    public void user_verify_Account_Type2_can_be_seen(String account2) {
        Assert.assertTrue(us_16_page.linkAccount2.isDisplayed());
        System.out.println(us_16_page.linkAccount2);

        String accountType2 = us_16_page.linkAccount2.getText();
        System.out.println(accountType2);

        Assert.assertEquals(account2,accountType2);
    }

    @Then("user signOut from customer Website")
    public void user_signOut_from_customer_Website() {
        us_16_page.linkUseraaabbb.click();
        us_16_page.linkSignOut.click();
    }

    //@TC1602 -------------
    @Given("user clicks Transfer Money link")
    public void user_clicks_Transfer_Money_link() {
//        actions.sendKeys(Keys.F5).perform();
//        ReusableMethods.waitFor(2);
//        us_16_page.myOperationsLink.click();

        us_16_page.transferMoneyLink.click();

    }

    @Given("user select first account from From dropdown menu and click")
    public void user_select_first_account_from_From_dropdown_menu_and_click() {
        Select select = new Select(us_16_page.idFromDropdown);
        select.selectByIndex(2);

        actions.sendKeys(Keys.TAB).perform();

    }

    @Given("user verify the selected account can be seen")
    public void user_verify_the_selected_account_can_be_seen() {
        String textFrom = us_16_page.idFromDropdown.getAttribute("value");
        System.out.println("From text : " +textFrom);
        //Assert.assertEquals(textFrom,"19670");
    }

    //@TC1603 -------------
    @Given("user select other account from To dropdown menu and click")
    public void user_select_other_account_from_To_dropdown_menu_and_click() {
        Select select = new Select(us_16_page.idToDropdown);
        select.selectByIndex(1);

        actions.sendKeys(Keys.TAB).perform();

        String textTo = us_16_page.idToDropdown.getAttribute("value");
        System.out.println("To text : " + textTo);
        //Assert.assertEquals(textTo,"19669");
    }

    @Given("user send {string} to Balance and click tab")
    public void user_send_to_Balance_and_click_tab(String string) {
        // int amount = Integer.parseInt(string);
        us_16_page.linkBalance.sendKeys(string);
    }

    @Given("user click tab and verify the amount can be seen in Balance")
    public void user_click_tab_and_verify_the_amount_can_be_seen_in_Balance() {
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();

        String textFrom = us_16_page.linkBalance.getAttribute("value");
        Assert.assertEquals("100",textFrom);
    }

    //@TC1604 -------------
    @Given("user send {string} to Description and click tab")
    public void user_send_to_Description_and_click_tab(String string) {
        us_16_page.linkDescription.sendKeys(string);

        actions.sendKeys(Keys.TAB).perform();

        System.out.println(us_16_page.linkDescription);
    }

    //@TC1605 -------------
    @Given("user click Make Transfer link")
    public void user_click_Make_Transfer_link() {
        us_16_page.linkMakeTransfer.click();

        Assert.assertTrue(us_16_page.alertSuccessMessage.isDisplayed());
    }

    @Given("user click View Transaction link")
    public void user_click_View_Transaction_link() {
        us_16_page.linkFirstViewTransaction.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Given("verify the transaction is accomplished")
    public void verify_the_transaction_is_accomplished() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String textTransactionHistory = us_16_page.bodyOfTransactionHistory.getText();
        System.out.println(textTransactionHistory);

        Date date = new Date();
        System.out.println(date);

        String actualDate = "yyyy-MM-dd";
        SimpleDateFormat actDate = new SimpleDateFormat(actualDate);

        System.out.println(actDate.format(date));

        Assert.assertTrue(textTransactionHistory.contains(actDate.format(date)));
    }

}

