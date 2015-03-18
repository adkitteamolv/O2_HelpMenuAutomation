// Declaring TestFunctions

package src.O2.Functions.TestFunctions;

import src.O2.ObjectRepository.PageObjects.O2ContactUs_PageObjects;
import src.O2.ObjectRepository.PageObjects.O2PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import src.O2.ObjectRepository.PageObjects.O2PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class O2Test_Function {

    WebDriver o2driver=null;

    //Creating Object of O2PageObjects class
    public O2PageObjects o2Objects=new O2PageObjects();
    public O2ContactUs_PageObjects o2ContactUs_pageObject=new O2ContactUs_PageObjects();

    //Class Constructor
    public O2Test_Function(WebDriver o2driver){

        this.o2driver=o2driver;
    }


    //Function to check wheather new Frame is opened on Page or not if Yes then Switch to it and Click NoThanks Button
    public void clickOnNoThanks(){

        String str=o2driver.getWindowHandle();
        System.out.println(str);
        //Set windows = o2driver.getWindowHandles();
		
		/*Iterator it= windows.iterator();
		
		while (it.hasNext()) {
			String newWindow=it.next().toString();
			System.out.println("Frame : "+newWindow );*/
        if(o2driver.findElement(By.id("edr_l_first")).isDisplayed()){

            o2driver.switchTo().frame(o2driver.findElement(By.id("edr_l_first")));
            System.out.println("Switched to new Frame :");
            o2Objects.noThanks(o2driver).click();

        }else{

            System.out.println("No New window");
        }

    }

    //Function with return type List<String> to Hover on Help Menu and getting values from that dropdown with there URL's
    public List<String> hoverOnHelp(){

        //creating List to get dropdown values
        List<String> elementList=new ArrayList<String>();

        //Finding Help Menu on Page
        WebElement helpelement=o2Objects.help(o2driver);

        //Declaring Actions object to moveToElement Help so that Hovering on Help menu is Performed
        Actions action = new Actions(o2driver);
        action.moveToElement(helpelement).build().perform();

        //Declaring List of WebElements to get List of elements in Help dropdown
        List<WebElement> list=helpelement.findElements(By.xpath("//*[@id='pn5']/ul/li/a"));

        //Iterator to iterate list elements
        Iterator<WebElement> it=list.iterator();
        while (it.hasNext()) {
            WebElement listElement = (WebElement) it.next();

            //Adding value of WebElement to ArrayList
            elementList.add(listElement.getText());

            //Printing List Element and there respective URL's
            System.out.println(listElement.getText()+ ":" +listElement.getAttribute("href"));
        }

        //Returning List<String> of all elements in Help dropdown
        return elementList;

    }


    //Click on Contact Us item from Help Dropdown
    public void clickOnContactUs(){

        o2Objects.contactUs(o2driver).click();
    }

    //Click on 'I've got a Technical question
    public void clickOnTechnicalQusetionsButton(){

        o2ContactUs_pageObject.technicalQuestionButton(o2driver).click();
    }

    //Click on Prefer to speak to someone? option
    public void selectPreferToSpeakSomeone(){

        o2ContactUs_pageObject.preferToSpeakSomeone(o2driver).click();
    }

    //Click on Pay & Go Team
    public void clickPayAndGo(){

        o2ContactUs_pageObject.payAndGoOption(o2driver).click();
    }

    //Go To Opening Times from Pay & Go section and  get the values from table in List<String>
    public List<String> getTableData() {

        //creating List to get table values
        List<String> tableData=new ArrayList<String>();

        //creating webelement to move to table element
        WebElement tableElement=o2ContactUs_pageObject.opentimingstableElement(o2driver);

        //Getting List of table Row elements
        List<WebElement> tableRowElements=tableElement.findElements(By.tagName("tr"));

        //till there are Rows in table
        for(WebElement rowData:tableRowElements){

            //Get List of Table Columns
            List<WebElement> tableColumnElements=rowData.findElements(By.tagName("td"));

            //Till Row has columns get the values in the Column
            for(WebElement colData:tableColumnElements){

                System.out.println(colData.getText());

                //Adding column value in List
                tableData.add(colData.getText());
            }

        }

        //Return List
        return tableData;

    }


}