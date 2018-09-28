package com.collinson.integration.bing;

import cucumber.api.java8.En;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;

@SuppressWarnings("unused")
public class CallBingStepDefinitions implements En {

    public CallBingStepDefinitions() {

        Map<String, Object> state = new HashMap<>();

        Given("^A bing web page (.+)$", (String path) -> {
        });

        When("^I request the bing page (.+)$", (String path) -> {
            Response response = get(path);
            state.put("RESPONSE", response);
        });

        Then("^I should get the bing response status (\\d+)$", (Integer status) -> {
            Response response = (Response) state.get("RESPONSE");
            response.then().statusCode(status);
        });

    }

}
