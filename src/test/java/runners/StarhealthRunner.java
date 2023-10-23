package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Phase2EndProjectCucumber\\src\\test\\java\\features\\starHealth.feature",
                 glue= {"steps"},
                 dryRun=false,
                 plugin= {"pretty",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		 "timeline:test-output-thread/"
                		 },
                 tags="@training or @simplilearn"
        )


public class StarhealthRunner {
	
	}
