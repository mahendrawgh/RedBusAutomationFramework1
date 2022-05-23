import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:format"},
        features = {"D:/SeleniumPractice/RedBusAutomationFramework/src/test/resources/Features/searchBus.feature"},
        glue ={"stepDefinations"},
        tags = "@smokeTest", publish=true)

public class TestRunner {
    public TestRunner() {

    }
}
