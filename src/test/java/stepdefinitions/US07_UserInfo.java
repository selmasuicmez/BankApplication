package stepdefinitions;


import pages.LoginPage;
import pages.UserInfoPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class US07_UserInfo {


        LoginPage loginpage = new LoginPage();
        UserInfoPage userInfoPage = new UserInfoPage();



        @Given("user go to the login page")
        public void user_go_the_login_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        }

        @Given("Provide the username")
        public void provide_the_username() {
            loginpage.username.sendKeys(ConfigurationReader.getProperty("username_info"));

        }

        @And("Provide the password")
        public void provide_the_password() {
            loginpage.password.sendKeys(ConfigurationReader.getProperty("password_info"));
        }

        @And("Enter the Signin button")
        public void enter_the_Signin_button() {
            loginpage.signInButton.click();

        }

        @And("Enter User drop down menu")
        public void enter_user_drop_down_menu() {

            loginpage.loginDropDown.click();
        }


        @And("Enter the User info")
        public void Enter_the_User_info() {
            userInfoPage.userInfoLink.click();
        }


        @And("Enter First Name")
        public void enter_first_name() {

            Assert.assertTrue(userInfoPage.firstNameBox.isDisplayed());
        }

        @And("Enter Last Name")
        public void enter_last_name() {
            Assert.assertTrue(userInfoPage.lastNameBox.isDisplayed());


        }


        @Given("Without at sign")
        public void without_at_sign() {
            userInfoPage.emailBox.clear();
            userInfoPage.emailBox.sendKeys("team" + "gmail.com");
            Assert.assertTrue(userInfoPage.invalidField.isDisplayed());
        }

        @And("You should see This field is invalid")
        public void you_should_see_This_field_is_invalid(){
            System.out.println("This field is invalid1");
        }




        @Given("Without dots com")
        public void without_dotscom() {
            userInfoPage.emailBox.clear();
            userInfoPage.emailBox.sendKeys("group2@gmail");
            Assert.assertTrue(userInfoPage.invalidField.isDisplayed());

        }
        @And("You should see message This field is invalid")
        public void you_should_see_message_This_field_is_invalid() {
            System.out.println("This field is invalid2");

        }
        @Given("Language dropdown is not have other languages")
        public void Language_Dropdown_is_not_have_other_languages() {
            userInfoPage.languageDropDown.click();
            Assert.assertFalse(userInfoPage.languageDropDown.getText().equals(ConfigurationReader.getProperty("invalidLanguage")));
        }
        @And("You should see two languages")
        public void you_should_see_two_languages(){
            System.out.println("English and Turkish");
        }
    }
