package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'board-tile mod-add')]")
    private WebElement crearTableroLocator;

    @FindBy(xpath = "//input[@data-test-id='create-board-title-input']")
    private WebElement nombreTableroLocator;

    @FindBy(xpath = "//button[contains(@data-test-id,'create-board-submit-button')]")
    private WebElement botonCrearLocator;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[4]/div[2]/div[3]/ul/li[10]/div[2]/div/div[1]/div[2]/div/div[2]/div[2]/div/div[3]")
    private WebElement botonNext2Locator;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void crearTablero() throws Exception {
        waitUntilElementIsVisibleNonThrow(crearTableroLocator, 10);
        crearTableroLocator.click();
        waitUntilElementIsVisibleNonThrow(nombreTableroLocator, 10);
        nombreTableroLocator.sendKeys("Tablero 001");
        waitUntilElementIsVisibleNonThrow(botonCrearLocator, 10);
        waitUntilElementIsEnableNonThrow(botonCrearLocator,10);
        botonCrearLocator.click();
    }



}

