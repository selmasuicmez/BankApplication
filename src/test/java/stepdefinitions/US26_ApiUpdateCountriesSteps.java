package stepdefinitions;

import utilities.ConfigurationReader;
import utilities.WriteToTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US26_ApiUpdateCountriesSteps {

    Response response;

    String filePath = "AllCountriesData.csv";
    JsonPath json;
    List<Map<String,Object>> allCountryData;
   // Map country = new HashMap<String,Object>();



    @Given("use api end point {string}")
    public void use_api_end_point(String endpoint) {

        response = given().accept(ContentType.JSON)
                            .auth()
                            .oauth2(ConfigurationReader.getProperty("token"))
                            .when()
                            .get(endpoint);


       // response.then().assertThat().statusCode(200);

        //response.prettyPrint();

        json=response.jsonPath();


    }

    @Given("get all countries information as De-serialization")
    public void get_all_countries_information_as_De_serialization() throws IOException {
        allCountryData=json.getList("$");
        System.out.println("Java List Map Response = " + allCountryData);
        System.out.println("First Country Data  = " + allCountryData.get(0).get("name"));
        System.out.println("Second Country Data  = " + allCountryData.get(1).get("name"));
        System.out.println("Last Country Data  = " + allCountryData.get(allCountryData.size()-1).get("name"));


      /*  ObjectMapper objectMapper = new ObjectMapper();
        country  = objectMapper.readValue(response.asString(),Country[].class);
        System.out.println(country[0].getName());
        System.out.println(country[1].getName());
        System.out.println(country[country.length-1].getName());*/


    }

    @Then("find out how many countries and verify that there are number country")
    public void find_out_how_many_countries_and_verify_that_there_are_number_country() {

        WriteToTxt.saveDataInFileWithJsonListMap(filePath,allCountryData);

        int actualCountryLength = allCountryData.size();

        Assert.assertEquals(296,actualCountryLength);

    }



    @Given("user updates a country using api end point {string}  {string} and its extension {string}")
    public void user_updates_a_country_using_api_end_point_and_its_extension(String endPoint, String name, String id) {
        Map<String, Object> putBody = new HashMap<>();


        putBody.put("id", id);
        putBody.put("name", name);
        putBody.put("states", null);
        System.out.println(putBody.toString());

        Response responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(putBody).
                when().
                put(endPoint);
        System.out.println("###user updates a country ");
        responsePut.prettyPrint();

        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);
        System.out.println("****user updates a country ");
        response.prettyPrint();
    }

}
