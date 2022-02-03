package stepdefinitions;

import utilities.ReadTxt;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Customer;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiCustomerStepDefinitions {

    Customer[] customers;
    Response response;
    @Given("user provides the api end point to set the response {string}")
    public void user_provides_the_api_end_point_to_set_the_response(String url) throws Exception{
        response = given().headers(
                "Authorization",
                "Bearer " +ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }
    @Given("manipulate all costumers data")
    public void manipulate_all_costumers_data()throws  Exception{
        ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(), Customer[].class);
        for(int i=0; i<customers.length; i++) {
            if (customers[i].getLastName() != null) {
                System.out.println(customers[i].getLastName());
            }
        }
    }
    @Given("user sets the data in corresponding files")
    public void user_sets_the_data_in_corresponding_files() {
        //WriteToTxt.saveDataInFile("allCustomerData.txt", customer);
        //utilities.WriteToTxt.saveDataInFile("NewFile.txt", customers);
    }
    @Then("user validates all data")
    public void user_validates_all_data() {
        List<Customer> list = ReadTxt.returnCustomerSNN("NewFile");

        int count = 0;
        String expected = "123-47-2476";
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getSsn());
        }
    }


}
