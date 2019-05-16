package junitcucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", glue = "junitcucumber", plugin = { "json:target/cucumber.json" })
public class UserTest {

}
