package learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ByClass {
    /*
    this is the abstract By class. Here the return type is the class By
     */
    /*
    ByCssSelector is a class. See
    public static By cssSelector(String cssSelector) {
        return new By.ByCssSelector(cssSelector);
    }
     */

    public static void main(String[] args){
        By cssSelector = By.cssSelector("sampleSelector");
        ChromeDriver myTestDriver =  new ChromeDriver();

        myTestDriver.findElement(cssSelector);

        myTestDriver.quit();
    }
}

