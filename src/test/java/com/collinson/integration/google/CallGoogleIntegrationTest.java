package com.collinson.integration.google;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/callGoogle.feature",
    plugin = {"pretty", "json:target/cucumber-reports/Google.json"},
    monochrome = true,
    glue = "com.collinson.integration.google")
public class CallGoogleIntegrationTest {

}
