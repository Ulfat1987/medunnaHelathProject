package stepdefinitions.API_US_09;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_09APIStepDef {
    Response response;

    @Given("user sends GET request to the {string}")
    public void user_sends_get_request_to_the(String user_endpoint) {
        response = given().when().get(user_endpoint);
        response.prettyPrint();


    }

    @Then("HTTP Status Code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {
       assertEquals((int)statusCode,response.getStatusCode());

    }
}
