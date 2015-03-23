//Creating Object Repository of Page Objects

package src.O2.ObjectRepository.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class O2PageObjects {
	
	WebDriver o2driver=null;

    @FindBy(xpath = "//li[@id='pn5']")public WebElement help;
    @FindBy(xpath = "//li[@id='pn5']/ul/li[5]/a")public WebElement contactUs;
    @FindBy(xpath = "//a[@id='no']/span")public WebElement noThanks;
   // @FindBy(xpath = "//*[@id='pn5']/ul/li/a")public List<WebElement> listElements;

	/*By helplink=By.xpath("//li[@id='pn5']");
	By contactUsOption=By.xpath("//li[@id='pn5']/ul/li[5]/a");
	By noThanksBtn=By.xpath("//a[@id='no']/span");

	public WebElement help(WebDriver o2driver){
		
		new WebDriverWait(o2driver, 10).until(ExpectedConditions.visibilityOfElementLocated(helplink));
		return o2driver.findElement(helplink); 
	}
	
	public WebElement contactUs(WebDriver o2driver) {
		new WebDriverWait(o2driver, 10).until(ExpectedConditions.elementToBeClickable(contactUsOption));
		return o2driver.findElement(contactUsOption);
	}
	
	public WebElement noThanks(WebDriver o2driver) {
		new WebDriverWait(o2driver, 20).until(ExpectedConditions.elementToBeClickable(noThanksBtn));
		return o2driver.findElement(noThanksBtn);
	}*/

    public O2PageObjects(WebDriver o2driver){
        this.o2driver=o2driver;
     }


}
