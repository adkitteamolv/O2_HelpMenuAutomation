package src.O2.ObjectRepository.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by 318759 on 3/18/2015.
 */
public class O2ContactUs_PageObjects {

    WebDriver o2driver=null;

    By technicalQuestion = By.xpath("//div[@id='acc1']/div[2]/h2/a");
    By prefertoSpeak=By.xpath("//p[@id='contacts-q26']/a");
    By payAndGo=By.xpath("//div[@id='acc1']/div[2]/div/div/div[2]/div[3]/div[2]/h4/a");

    By opentimingstable=By.xpath(".//div[@id='acc1']/div[2]/div/div/div[2]/div[3]/div[2]/div/div/div[2]/table");

    public WebElement technicalQuestionButton(WebDriver o2driver) {
        new WebDriverWait(o2driver, 20).until(ExpectedConditions.elementToBeClickable(technicalQuestion));
        return o2driver.findElement(technicalQuestion);
    }

    public WebElement preferToSpeakSomeone(WebDriver o2driver) {
        new WebDriverWait(o2driver, 20).until(ExpectedConditions.elementToBeClickable(prefertoSpeak));
        return o2driver.findElement(prefertoSpeak);
    }

    public WebElement payAndGoOption(WebDriver o2driver) {
        new WebDriverWait(o2driver, 20).until(ExpectedConditions.elementToBeClickable(payAndGo));
        return o2driver.findElement(payAndGo);
    }

    public WebElement opentimingstableElement(WebDriver o2driver) {
        new WebDriverWait(o2driver, 20).until(ExpectedConditions.elementToBeClickable(opentimingstable));
        return o2driver.findElement(opentimingstable);
    }
}
