package com.collinson.integration.bing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;

public class CallBingStepDefinitions {

    private Map<String, Object> state = new HashMap<>();

    @Given("^A bing web page (.+)$")
    public void webPage(@SuppressWarnings("unused") String path) {

    }

    @When("^I request the bing page (.+)$")
    public void requestWebPage(String path) {
        Response response = get(path);
        state.put("RESPONSE", response);
    }

    @Then("^I should get the bing response status (\\d+)$")
    public void checkStatus(Integer status) {
        Response response = (Response) state.get("RESPONSE");
        response.then().statusCode(status);
    }

}
