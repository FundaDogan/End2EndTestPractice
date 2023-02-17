package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ApiStepDefs {

    Response response;

    @Given("user sends Get request to the {string}")
    public void user_sends_get_request_to_the(String endPoint) {
       Response response  = given().when().get(endPoint);
       response.prettyPrint();
    }

    @Then("HTTP Status Code should be {int}")
    public void http_status_code_should_be(Integer statusCode) {

        Assert.assertEquals((int)statusCode,response.getStatusCode());

    }

}
