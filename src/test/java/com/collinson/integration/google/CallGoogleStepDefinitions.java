package com.collinson.integration.google;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;

@SuppressWarnings("unused")
public class CallGoogleStepDefinitions {

    private Map<String, Object> state = new HashMap<>();

    @Given("^A google web page (.+)$")
    public void webPage(@SuppressWarnings("unused") String path) {

    }

    @When("^I request the google page (.+)$")
    public void requestWebPage(String path) {
        Response response = get(path);
        state.put("RESPONSE", response);
    }

    @Then("^I should get the google response status (\\d+)$")
    public void checkStatus(Integer status) {
        Response response = (Response) state.get("RESPONSE");
        response.then().statusCode(status);
    }

}
