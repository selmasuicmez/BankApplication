package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojos.States;
import utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US24_StateCountryStepDefinitions {

    Response response;

    @Given("Given The user sends a POST request to REST API endpoint {string} and create {string} state")
    public void given_The_user_sends_a_POST_request_to_REST_API_endpoint_and_create_state(String endPointUrl, String state) {

        States states = new States(state, null);
        response = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(states).
                when().
                post(endPointUrl);
        response.prettyPrint();
    }

    @Given("After creation, the HTTP Status Code should be {string}")
    public void after_creation_the_HTTP_Status_Code_should_be(String statusCode) {

        int expectedStatusCode = Integer.parseInt(statusCode);
        response.then().
                assertThat().
                statusCode(expectedStatusCode);
    }

    @Then("After creation user verifies the created state {string}")
    public void after_creation_user_verifies_the_created_state(String expectedState) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        States responseState = objectMapper.readValue(response.asString(), States.class);
        System.out.println(responseState);
        String actualStates = responseState.getName();
        System.out.println("Actual state: " + actualStates);
        System.out.println("Actual state: " + expectedState);
        System.out.println("Actual state: " + expectedState);

    }

}
