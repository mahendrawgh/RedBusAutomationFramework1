package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class Setup{
    public static WebDriver driver;
    public static String redBusURL;
    //public WebDriverWait wait =new WebDriverWait(driver, 30);

    Properties prop;
    public Setup()  {

    File filePath = new File("D:\\SeleniumPractice\\RedBusAutomationFramework\\src\\main\\resources\\config\\config.properties");

        try {
    FileReader fileReader = new FileReader(filePath);
        prop = new Properties();
        prop.load(fileReader);
    } catch (Exception e){
        e.printStackTrace();
    }
        redBusURL = prop.getProperty("Red_BUS__URL");

    }

    public void initializeBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPractice\\RedBusAutomationFramework\\src\\test\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(redBusURL);


    }
}
