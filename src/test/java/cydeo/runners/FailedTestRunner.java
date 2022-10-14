package cydeo.runners;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cydeo/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
