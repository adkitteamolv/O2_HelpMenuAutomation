//TestNg Class to Test HelpMenu Items and Values From Open timings Table

package src.O2.Test.TestHelpMenu;

import src.O2.DriverInitialization.InitializeWebdriver.O2DriverInitilization;
import src.O2.Functions.TestFunctions.O2Test_Function;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class O2HelpTest {

    WebDriver o2driver=null;
    O2Test_Function test_functionObject;


    //Initializing Driver and creating object of TestFunction class
    @BeforeTest
    public void beforeTest() {

        o2driver=O2DriverInitilization.initializeDriver();

        test_functionObject=new O2Test_Function(o2driver);
    }

    @Test(priority=0)
    public void test_HelpMenu() {

        //Creating List of Expected values in Help dropdown
        List<String> expectedHelpelements = new ArrayList<String>();
        expectedHelpelements.add("Browse Help");
        expectedHelpelements.add("All Help topics");
        expectedHelpelements.add("O2 Gurus");
        expectedHelpelements.add("O2 Community");
        expectedHelpelements.add("Contact us");


        test_functionObject.clickOnNoThanks();

        //getting actual List of Elements in Help drop down from testfuction hoverOnHelp()
        List<String> actualelementsInList=test_functionObject.hoverOnHelp();

        //Printing Actual : Expected
        System.out.println(actualelementsInList +":"+expectedHelpelements );

        //Verifying using Assert statement both Actual and Expected Values are matching or not
        Assert.assertEquals(actualelementsInList, expectedHelpelements);

        test_functionObject.clickOnContactUs();


    }

    @Test(priority=1)
    public void verifyOprnTimingsTable(){


        //Creating List of Expected values in open timings table
        List<String> expectedTableElements = new ArrayList<String>();
        expectedTableElements.add("Monday - Friday");
        expectedTableElements.add("08:00 - 21:00");
        expectedTableElements.add("Saturday");
        expectedTableElements.add("08:00 - 20:00");
        expectedTableElements.add("Sunday");
        expectedTableElements.add("09:00 - 18:00");

        test_functionObject.clickOnTechnicalQusetionsButton();
        test_functionObject.selectPreferToSpeakSomeone();

        test_functionObject.clickPayAndGo();

        //getting actual List of Elements in open timings table from testfuction getTableData()
        List<String> actualElementsInTable=test_functionObject.getTableData();

        //Printing Actual : Expected
        System.out.println(actualElementsInTable +":"+expectedTableElements );

        //Verifying using Assert statement both Actual and Expected Values are matching or not
        Assert.assertEquals(actualElementsInTable, expectedTableElements);

    }

    @AfterTest
    public void afterTest() {
        o2driver.quit();
    }

}
