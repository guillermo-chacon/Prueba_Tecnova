package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.awaitility.core.ConditionTimeoutException;

import static org.awaitility.Awaitility.await;
import static java.util.concurrent.TimeUnit.SECONDS;

public class BasePage {
    private static final int WAIT_TIMEOUT = 90;
    private static final int POLLING = 100;

    final WebDriver driver;
    private final WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, WAIT_TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,WAIT_TIMEOUT), this);
    }

    public boolean isDisplayed(WebElement element) throws Exception{
        try {
           return element.isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento : " + element);
        }
    }


    public boolean isEnabled(WebElement element) throws Exception{
        try {
            return element.isEnabled();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elemento : " + element);
        }
    }

/*    public WebElement getText(WebElement element) throws Exception{
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: " + element);
        }
    }*/

    public String getText(WebElement element) throws Exception{
        try {
            return element.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento : " + element);
        }
    }

    protected boolean isVisible(WebElement webElement){
        try {
            return webElement.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public void waitUntilElementIsVisibleNonThrow(WebElement element, int WAIT_TIMEOUT){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isVisible(element));
        } catch (ConditionTimeoutException e) {
        }
    }

    public void waitUntilElementIsEnableNonThrow(WebElement element, int WAIT_TIMEOUT){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isEnabled(element));
        } catch (ConditionTimeoutException e) {
        }
    }

    public Boolean waitUntilElementIsVisibleBoolean(WebElement element, int WAIT_TIMEOUT){
        try{
            await().atMost(WAIT_TIMEOUT, SECONDS).until(()->isVisible(element));
        } catch (ConditionTimeoutException e) {
            return false;
        }
        return true;
    }

}
