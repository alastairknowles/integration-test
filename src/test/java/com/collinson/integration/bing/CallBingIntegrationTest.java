package com.collinson.integration.bing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/callBing.feature",
    plugin = {"pretty", "json:target/cucumber-reports/Bing.json"},
    monochrome = true,
    glue = "com.collinson.integration.bing")
public class CallBingIntegrationTest {

}
