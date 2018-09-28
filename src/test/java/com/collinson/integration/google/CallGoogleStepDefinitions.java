package com.collinson.integration.google;

import cucumber.api.java8.En;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;

@SuppressWarnings("unused")
public class CallGoogleStepDefinitions implements En {

    public CallGoogleStepDefinitions() {

        Map<String, Object> state = new HashMap<>();

        Given("^A google web page (.+)$", (String path) -> {
        });

        When("^I request the google page (.+)$", (String path) -> {
            Response response = get(path);
            state.put("RESPONSE", response);
        });

        Then("^I should get the google response status (\\d+)$", (Integer status) -> {
            Response response = (Response) state.get("RESPONSE");
            response.then().statusCode(status);
        });

    }

}
