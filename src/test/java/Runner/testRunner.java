package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,glue= {"StepDef"},features="Feature\\tagdemo.feature",tags= {"@End2End "})

public class testRunner {

}
