package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//a[@href='/login'][contains(.,'Iniciar sesión')]")
    private WebElement iniciarSesionLocator;

    @FindBy(xpath = "//input[@id='user']")
    private WebElement correoInicioLocator;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    private WebElement contraseñaInicioLocator;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement btnInicioSesionLocator;

    @FindBy(xpath = "(//span[contains(.,'Iniciar sesión')])[1]")
    private WebElement btnInicio2SesionLocator;

    @FindBy(xpath = "(//div[contains(.,'Inicia sesión para continuar a:')])[9]")
    private WebElement txtEsperaInicioLocator;

    @FindBy(xpath = "//span[contains(.,'La dirección de correo electrónico o la contraseña son incorrectas.')]")
    private WebElement txtLoginErrorLocator;

    @FindBy(xpath = "//h1[contains(.,'Iniciar sesión en Trello')]")
    private WebElement textoInicioLocator;

    @FindBy(xpath = "(//div[contains(.,'Inicia sesión para continuar a:')])[9]")
    private WebElement correoCorrectoLocator;

    @FindBy(xpath = "//h3[@class='boards-page-section-header-name'][contains(.,'TUS ESPACIOS DE TRABAJO')]")
    private WebElement contraseñaCorrectoLocator;



    public void iniciarSesion() throws Exception{
        waitUntilElementIsVisibleNonThrow(iniciarSesionLocator,10);
        iniciarSesionLocator.click();
    }
        public void ingresarCorreoSesion(String correo) throws Exception {
        waitUntilElementIsVisibleNonThrow(correoInicioLocator,10);
        correoInicioLocator.click();
        correoInicioLocator.sendKeys(correo);
        btnInicioSesionLocator.click();
        waitUntilElementIsVisibleNonThrow(btnInicioSesionLocator,10);
        waitUntilElementIsVisibleNonThrow(txtEsperaInicioLocator,10);

        }
    public void ingresarContraseñaSesion(String contraseña) throws Exception {
        waitUntilElementIsVisibleNonThrow(txtEsperaInicioLocator,10);
        waitUntilElementIsVisibleNonThrow(contraseñaInicioLocator,10);
        waitUntilElementIsEnableNonThrow(contraseñaInicioLocator, 10);
        contraseñaInicioLocator.click();
        contraseñaInicioLocator.sendKeys(contraseña);
        waitUntilElementIsVisibleNonThrow(btnInicio2SesionLocator,10);
        btnInicio2SesionLocator.click();
    }
    public boolean showTextoInicioDisplayed() throws Exception {
        waitUntilElementIsVisibleNonThrow(textoInicioLocator, 10);
        System.out.println("esto imprime el texto ---- " + this.getText(textoInicioLocator));
        return this.getText(textoInicioLocator).equals("Iniciar sesión en Trello");
    }
    public boolean showTextoCorreoOKDisplayed() throws Exception {
        waitUntilElementIsVisibleNonThrow(correoCorrectoLocator, 10);
        System.out.println("esto imprime el texto 2---- " + this.getText(correoCorrectoLocator));
        return this.getText(correoCorrectoLocator).equals("Inicia sesión para continuar a:");
    }
    public boolean showTextoContraseñaOKDisplayed() throws Exception {
        waitUntilElementIsVisibleNonThrow(contraseñaCorrectoLocator, 10);
        System.out.println("esto imprime el texto 2---- " + this.getText(contraseñaCorrectoLocator));
        return this.getText(contraseñaCorrectoLocator).equals("TUS ESPACIOS DE TRABAJO");
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
