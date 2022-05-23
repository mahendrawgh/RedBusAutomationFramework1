package stepDefinations;

import base.Exit;
import base.Setup;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageLocators.SearchBusLocators;
import pageLocators.ViewSeatsLocators;

public class RedBusSearchBusStepDefination {

    SearchBusLocators locators = new SearchBusLocators();
    ViewSeatsLocators viewSeats = new ViewSeatsLocators();
    Exit exitBrowser = new Exit();

    @Given("^User launch the browser and enter red bus url$")
    public void User_launch_the_browser_and_enter_red_bus_url() throws Throwable {

        Setup setup = new Setup();
        setup.initializeBrowser();

    }

    @When("^User enter from and to station$")
    public void User_enter_from_and_to_station() throws InterruptedException {

        locators.getFromStation();
        locators.inputfromStation();
        locators.getFromStationFromList();
        locators.clickOnfromStation();
        locators.getToStation();
        locators.inputToStation();
        locators.getToStationList();
        Thread.sleep(5000);
        locators.clickOnToStation();

    }

    @And("^User enter date$")
    public void User_enter_date() {
        locators.getStartDate();
        locators.enterStartDate();
        locators.getpickerdate();
        locators.clickOnPickerDate();
    }

    @And("^User click on search buses button$")
    public void User_click_on_search_buses_button() {
        locators.getSearchBuses();
        locators.clickOnSearchBuses();

    }

    @Then("^User verify bus availability$")
    public void user_verify_bus_availability() throws InterruptedException {


        viewSeats.getViewBuses();
        viewSeats.clickOnViewBuses();

        viewSeats.getPromoButton();
        viewSeats.clickOnPromoButton();
        Thread.sleep(3000);
        exitBrowser.exitBrowser();

    }
}
