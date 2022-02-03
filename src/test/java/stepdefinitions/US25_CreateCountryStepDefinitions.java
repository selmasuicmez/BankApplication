package stepdefinitions;


import org.codehaus.jackson.map.ObjectMapper;
import pojos.Country;
import utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US25_CreateCountryStepDefinitions {

    Response response;

    @Given("User send a POST request to REST API endpoint {string} and create {string} country")
    public void user_send_a_POST_request_to_REST_API_endpoint_and_create_country(String endPointUrl, String country) {
        Country countryForPost = new Country(country, null);
        response = given().
                          contentType(ContentType.JSON).
                   auth().oauth2(ConfigurationReader.getProperty("token")).
                   body(countryForPost).
                   when().
                   post(endPointUrl);
    }

    @Given("After creation HTTP Status Code should be {string}")
    public void after_creation_HTTP_Status_Code_should_be(String statusCode) {
        int expectedStatusCode = Integer.parseInt(statusCode);
        response.then().
                assertThat().
                statusCode(expectedStatusCode);
    }

    @Then("After creation user verifies the created country {string}")
    public void after_creation_user_verifies_the_created_country(String expectedCountry) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Country responseCountry = objectMapper.readValue(response.asString(), Country.class);

        System.out.println(responseCountry);
        String actualCountry = responseCountry.getName();
        System.out.println("Actual country: " + actualCountry);
        System.out.println("Actual country: " + expectedCountry);
        Assert.assertEquals(expectedCountry, actualCountry);


    }
}
