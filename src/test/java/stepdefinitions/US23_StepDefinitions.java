package stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.US_23_Pojo;
import utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US23_StepDefinitions {

    Response response;
    ObjectMapper obj;
    US_23_Pojo[] us23Pojo;
    List<Map<String, Object>> listofAplicants ;
    JsonPath json;

    @Given("us_o23 use api end point  {string}")
    public void us__use_api_end_point( String url) {
        response = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(url);
//        response.prettyPrint();
        json= response.jsonPath();

    }

    @Given("get all applicants' information")
    public void get_all_applicants_information() throws Exception {
        obj = new ObjectMapper();
        us23Pojo = obj.readValue(response.asString(),US_23_Pojo[].class);

        for (int i=0; i<us23Pojo.length; i++){
            if(us23Pojo[i] !=null){
//                System.out.println(us23Pojo[i].getFirstName()+" "+us23Pojo[i].getLastName()+" - "+ us23Pojo[i].getId());
            }
        }
    }

    @Given("verify that the status code is {int}")
    public void verifyThatTheStatusCodeIs(int expectedStatusCode) {
        response.then().assertThat().statusCode(expectedStatusCode);
    }

    @And("find out applicants size and verify")
    public void findOutApplicantsSizeAndVerify() {
        int expectedAplicantsSize = us23Pojo.length;
        int actualAplicantsSize = json.getList("$").size();

        Assert.assertTrue(expectedAplicantsSize == actualAplicantsSize);

    }

    @And("Find the number of those whose id is less than {int} and verify the number")
    public void findTheNumberOfThoseWhoseIdIsLessThanAndVerifyTheNumber(int idLessFiveThousand) {
        int count=0;
        for (US_23_Pojo w : us23Pojo) {
            if (w.getId() < 5000) {
//                System.out.println(w.getId());
                count++;
            }
            idLessFiveThousand = count;
        }
//        System.out.println("Total Number = " +count);
        Assert.assertEquals(257, idLessFiveThousand);

    }

    @And("verify if there are any applicants named {string}")
    public void verifyIfThereAreAnyApplicantsNamed(String name) {

        for (US_23_Pojo w: us23Pojo) {
            if (w.getFirstName().equals(name)) {
                Assert.assertTrue(true);
            }
        }
    }

    @Given("one get seventh applicants id {int} and verify")
    public void oneAndVerify(int idValue) {
        int expectedGetId = us23Pojo[6].getId();
        Assert.assertEquals(expectedGetId,idValue);

    }

    @Given("two get seventh applicants ssn {string} and verify")
    public void two(String ssnNumber) {
        String expectedSsnNumber = us23Pojo[6].getSsn();
        Assert.assertEquals(expectedSsnNumber,ssnNumber);

    }

    @Given("three get seventh applicants firstName {string} and verify")
    public void three(String firstNameValue) {
        String firstName = us23Pojo[6].getFirstName();
        Assert.assertEquals(firstName,firstNameValue);

    }

    @And("three get seventh applicants {string} {string} and verify")
    public void threeGetSeventhApplicantsAndVerify(String firstNameKey, String firstNameValue) {
        listofAplicants = json.getList("$");
        for (String w: listofAplicants.get(6).keySet()){
            if (w.equals(firstNameKey))
                Assert.assertEquals(w, firstNameKey);
        }
        String expectedFirstName = us23Pojo[6].getFirstName();
        Assert.assertEquals(expectedFirstName, firstNameValue);
    }


    @And("four get seventh applicants {string} {string} and verify")
    public void fourGetSeventhApplicantsAndVerify(String lastNameKey, String lastNameValue) {
        listofAplicants = json.getList("$");
        for (String w: listofAplicants.get(6).keySet()){
            if (w.equals(lastNameKey))
                Assert.assertEquals(w, lastNameKey);
        }
        String expectedLastName = us23Pojo[6].getLastName();
        Assert.assertEquals(expectedLastName, lastNameValue);

    }



    @Given("four get seventh applicants lastName {string} and verify")
    public void four(String lastNameValue) {
        String lastName = us23Pojo[6].getLastName();
        Assert.assertEquals(lastName,lastNameValue);

    }

    @And("five get seventh applicants {string} {string} and verify")
    public void fiveGetSeventhApplicantsAndVerify(String adressKey, String adressValue) {

        listofAplicants = json.getList("$");
        for (String w: listofAplicants.get(6).keySet()){
            if (w.equals(adressKey)){
                Assert.assertEquals(w,adressKey);
            }
        }
        String expectedAdress = us23Pojo[6].getAddress();
        Assert.assertEquals(expectedAdress,adressValue);

    }

    @Given("six get seventh applicants {string}: {string} and verify")
    public void six(String mobilePhoneNumberKey, String mobilePhoneNumberValue) {

        listofAplicants= json.getList("$"); // $=* ==> hepsi
//        System.out.println(listofAplicants.get(6).keySet());

        for (String w: listofAplicants.get(6).keySet()){
            if (w.equals(mobilePhoneNumberKey)){
                Assert.assertEquals(w, mobilePhoneNumberKey);
            }
        }
        String expectedMobil = us23Pojo[6].getMobilePhoneNumber();
        Assert.assertEquals(expectedMobil, mobilePhoneNumberValue);

    }

    @And("seven get seventh applicants {string}: {int} and verify")
    public void sevenAndVerify(String userIdKey, int userIdValue) {

        listofAplicants= json.getList("$"); // $=* ==> hepsi
//        System.out.println(listofAplicants.get(6).keySet());

        for (String w: listofAplicants.get(6).keySet()){
            if (w.equals(userIdKey)){
                Assert.assertEquals(w, userIdKey);
            }
        }
        int expectedUserId = us23Pojo[6].getUserId();
        Assert.assertEquals(expectedUserId, userIdValue);

    }

    @Given("eigth get seventh applicants {string}: {string} and verify")
    public void eigth(String userNameKey, String userNameValue) {

        listofAplicants = json.getList("$");
        for(String w: listofAplicants.get(6).keySet()){
            if (w.equals(userNameKey)){
                Assert.assertEquals(w,userNameKey);
            }
        }
        String expectedUserName = us23Pojo[6].getUserName();
        Assert.assertEquals(expectedUserName, userNameValue);

    }

    @Given("nine get seventh applicants {string}: {string} and verify")
    public void nine(String emailKey, String emailValue) {

        listofAplicants = json.getList("$");
        for(String w: listofAplicants.get(6).keySet()){
            if (w.equals(emailKey)){
                Assert.assertEquals(w,emailKey);
            }
        }
        String expectedEmail = us23Pojo[6].getEmail();
        Assert.assertEquals(expectedEmail, emailValue);
    }

    @Given("ten get seventh applicants {string}: {string} and verify")
    public void ten(String createDateKey, String createDateValue) {

        listofAplicants = json.getList("$");
//        System.out.println(listofAplicants.get(6).keySet());
        for(String w: listofAplicants.get(6).keySet()){
            if (w.equals(createDateKey)){
                Assert.assertEquals(w,createDateKey);
            }
        }
        String expectedCreateDate = us23Pojo[6].getCreateDate();
        Assert.assertEquals(expectedCreateDate, createDateValue);

    }



}