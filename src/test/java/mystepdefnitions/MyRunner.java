package mystepdefnitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\selenium workspace\\cucum\\myfeatures\\demotoolslogin.feature",glue="mystepdefnitions",plugin={"json:target/cucumber.json"})
public class MyRunner {

}

