package stepdefinitions;

import utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US27_ApiDeleteStatesSteps {
    Response response;
    String filePath = "AllStatesData.csv";
    JsonPath json;

    // List<Map<String,Object>> allStateData;
    @Given("I send a GET request to REST API end point  {string}")
    public void i_send_a_GET_request_to_REST_API_end_point(String endpoint) {


        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(endpoint);
//        response.prettyPrint();

//        System.out.println(response.getBody().asString());

        json = response.jsonPath();


    }



    @Given("user deletes a state using api end point  {string} and its extension {string}")
    public void user_deletes_a_state_using_api_end_point_and_its_extension(String endPoint, String id) {


            response = given().
                    accept(ContentType.JSON).
                    auth().oauth2(ConfigurationReader.getProperty("token")).
                    when().
                    delete(endPoint + id);
            response.prettyPrint();

            System.out.println("After Delete Response Body: " + response.getBody().asString());

            json = response.jsonPath();
        }

    @Given("user data verifies that it has been deleted with status code {int}")
    public void user_data_verifies_that_it_has_been_deleted_with_status_code(Integer id) {
        int expectedStatusCode = id;
        int actualStatusCode =response.statusCode();
        Assert.assertEquals(expectedStatusCode,actualStatusCode);
    }










}
