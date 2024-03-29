package com.opentext.appworks.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/opentext/appworks/Features",
        tags = {"@opentext.s1"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)

public class RunCukesTest {
}