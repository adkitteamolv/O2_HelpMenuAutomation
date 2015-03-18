// Initializing Webdriver : FireFoxDriver


package src.O2.DriverInitialization.InitializeWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import src.O2.Read.ReadProperties.O2ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileNotFoundException;

public class O2DriverInitilization {

    // declaring static WebDriver
    static WebDriver o2driver;

    public static WebDriver initializeDriver(){

        try {
            //System.setProperty(O2ReadPropertiesFile.readProperties().getProperty("driver"), O2ReadPropertiesFile.readProperties().getProperty("driverpath"));

            //Initializing driver as FireFoxDriver()
            o2driver=new FirefoxDriver();

            //Getting URL by reading properties file and redirecting to it
            o2driver.get(O2ReadPropertiesFile.readProperties().getProperty("url"));

            //Maximizing Window
            o2driver.manage().window().maximize();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return o2driver;


    }

}