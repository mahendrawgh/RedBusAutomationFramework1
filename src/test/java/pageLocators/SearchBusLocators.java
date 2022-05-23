package pageLocators;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBusLocators extends Setup {


    /* Get From Station Xpath */
    public WebElement getFromStation()
    {

        return driver.findElement(By.xpath("//input[@id='src']"));
    }
    /* Enter From Station Value */
    public void inputfromStation(){

        getFromStation().sendKeys("Mumbai");
    }
    //
    public WebElement getFromStationFromList()
    {

        return driver.findElement(By.xpath("//li[@select-id='results[0]']"));
    }
    public void clickOnfromStation(){

        getFromStationFromList().click();
    }

    /*From Station functions end here*/


    public WebElement getToStation()
    {

        return driver.findElement(By.xpath("//input[@id='dest']"));
    }
    public void inputToStation(){

        getToStation().sendKeys("Goa");
    }

    public WebElement getToStationList() {


       return  driver.findElement(By.xpath("//li[@select-id='results[0]']"));
    }

    public void clickOnToStation() {

        getToStationList().click();
    }

    /* Get Start Date //input[@id='onward_cal']*/ //div[@class='fl search-box date-box gtm-onwardCalendar']
    public WebElement getStartDate()
    {

        return driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']"));
    }
    public void enterStartDate(){

        getStartDate().click();
    }

    //  //td[@class='current day'] //td[normalize-space()='23']
    public WebElement getpickerdate()
    {

        return driver.findElement(By.xpath("//td[@class='current day']"));
    }

    public void clickOnPickerDate(){

        getpickerdate().click();
    }

    /* Get Search Buses //input[@id='onward_cal']*/
    public WebElement getSearchBuses()
    {

        return driver.findElement(By.xpath("//button[@id='search_btn']"));
    }
    public void clickOnSearchBuses(){

        getSearchBuses().click();
    }




}
