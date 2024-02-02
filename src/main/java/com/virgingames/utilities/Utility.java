package com.virgingames.utilities;

import com.virgingames.browserfactory.ManageBrowser;
import org.openqa.selenium.*;

public class Utility extends ManageBrowser {

    /**
     * Take screenshot in Byte Format
     */
    public static byte[] getScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    //import org.openqa.selenium.JavascriptExecutor;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //Scroll the page till the element is found
    public void javaExecutorScriptExecuteScriptToScrollThePageTillElementFound(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    //To click on button
    public void javaExecutorScriptExecuteScriptToClick(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }



}
