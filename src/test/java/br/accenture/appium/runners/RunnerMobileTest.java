package br.accenture.appium.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = "",
        tags = {"@MobileFeature"},
        plugin = {"pretty","html:target/html-report", "json:target/reports.json"},
        dryRun = false,
        strict = false,
        monochrome = true,
        snippets = SnippetType.CAMELCASE)
public class RunnerMobileTest {

}
