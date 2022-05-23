package base;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Exit extends Setup {

    public void exitBrowser() {
        driver.quit();
    }
}
