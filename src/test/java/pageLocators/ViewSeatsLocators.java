package pageLocators;

import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewSeatsLocators extends Setup {

    /*View Buses*/
    public WebElement getViewBuses()
    {

       // return driver.findElement(By.xpath("//li[@id='19003809']//div[@class='button view-seats fr'][normalize-space()='View Seats']"));
        return driver.findElement(By.xpath("(//div[@class='button view-seats fr'][normalize-space()='View Seats'])[1]"));
    }
    public void clickOnViewBuses(){

        getViewBuses().click();
    }
    public WebElement getPromoButton(){
        return driver.findElement(By.xpath("//i[@class='icon icon-close']"));
    }
    public void clickOnPromoButton(){
        getPromoButton().click();
    }
}
