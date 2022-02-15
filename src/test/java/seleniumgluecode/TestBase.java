package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.*;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected TableroPage tableroPage = PageFactory.initElements(driver, TableroPage.class);

}
