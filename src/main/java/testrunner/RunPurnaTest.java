package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/feature"},
        tags= "@GermanyLoginTest",
        glue = {"stepdefinition"},
        
//        dryRun = true,
        monochrome = true
        
       
)
public class RunPurnaTest {
}
 

