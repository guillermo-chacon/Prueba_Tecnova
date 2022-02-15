package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TableroPage extends BasePage{

    public TableroPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[contains(@class,'list-header-target js-editing-target')])[1]")
    private WebElement crearListaLocator;

    @FindBy(xpath = "//textarea[@class='list-header-name mod-list-name js-list-name-input is-editing'][contains(.,'Lista de tareas')]")
    private WebElement crearListaLocator2;

    @FindBy(xpath = "(//div[@class='list-header-target js-editing-target'])[2]")
    private WebElement enProcesoLocator;

    @FindBy(xpath = "//textarea[contains(.,'En proceso')]")
    private WebElement enProcesoLocator2;

    @FindBy(xpath = "(//div[contains(@class,'list-header-target js-editing-target')])[3]")
    private WebElement hechoLocator;

    @FindBy(xpath = "//textarea[contains(.,'Hecho')]")
    private WebElement hechoLocator2;

    @FindBy(xpath = "//body/div[@id='trello-root']/div[@id='chrome-container']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]/div[3]/span[1]")
    private WebElement descripcionLocator;

        @FindBy(xpath = "//textarea[contains(@placeholder,'Introduzca un título para esta tarjeta...')]")
        private WebElement añadirTarjetaLocator;

        @FindBy(className = "(//span[@class='js-add-a-card'][contains(.,'Añada una tarjeta')])[1]")
        private WebElement añadirTarjetaLocator2;

    @FindBy(xpath = "//a[@class='button-link js-edit-labels'][contains(.,'Etiquetas')]")
    private WebElement etiquetaLocator;

    @FindBy(xpath = "//body/div[@id='trello-root']/div[@id='chrome-container']/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[6]/span[1]")
    private WebElement clrEtiquetaLocator;

    @FindBy(xpath = "//a[contains(@class,'pop-over-header-close-btn icon-sm icon-close')]")
    private WebElement btnCerrarEtiquetaLocator;

    @FindBy(xpath = "//button[contains(@data-test-id,'card-back-due-date-button')]")
    private WebElement fechaLocator;

    @FindBy(xpath = "//button[contains(@data-test-id,'save-date-button')]")
    private WebElement btnfechaLocator;


    @FindBy(xpath = "//a[@class='button-link js-attach'][contains(.,'Adjunto')]")
    private WebElement adjuntoLocator;

    @FindBy(xpath = "//input[contains(@id,'addLink')]")
    private WebElement txtAdjuntoLocator;

    @FindBy(xpath = "//input[contains(@id,'nameLink')]")
    private WebElement nombredjuntoLocator;

    @FindBy(xpath = "//input[@value='Adjuntar']")
    private WebElement btnAdjuntoLocator;

    @FindBy(xpath = "//input[@value='Adjuntar']")
    private WebElement cerrarAdjuntoLocator;


    @FindBy(xpath = "(//a[contains(.,'Portada')])[1]")
    private WebElement portadaLocator;

    @FindBy(xpath = "(//div[contains(.,'Èric Teixidó')])[11]")
    private WebElement imgPortadaLocator;

    @FindBy(xpath = "//a[@class='pop-over-header-close-btn icon-sm icon-close']")
    private WebElement cerrarPortadaLocator;

    @FindBy(xpath = "//textarea[@placeholder='Escriba un comentario...']")
    private WebElement comentarioLocator;

    @FindBy(xpath = "//input[@value='Guardar']")
    private WebElement guardarComentarioLocator;

    @FindBy(xpath = "//a[contains(@class,'icon-md icon-close dialog-close-button js-close-window dialog-close-button-light')]")
    private WebElement cerrarTarjetaLocator;

    @FindBy(xpath = "(//a[@aria-label='Acciones de la lista'])[1]")
    private WebElement accionListaLocator;

    @FindBy(xpath = "//a[contains(.,'Mover todas las tarjetas de esta lista…')]")
    private WebElement moverListaLocator;

    @FindBy(xpath = "//a[contains(.,'En Proceso 1')]")
    private WebElement selectListaLocator;



    @FindBy(xpath = "//span[contains(.,'Mostrar menú')]")
    private WebElement mostrarMenuLocator;

    @FindBy(xpath = "//a[contains(.,'Más')]")
    private WebElement masLocator;

    @FindBy(xpath = "//a[contains(.,'Cerrar tablero...')]")
    private WebElement cerrarTableroLocator;

    @FindBy(xpath = "//input[@value='Cerrar']")
    private WebElement cerrarLocator;

    @FindBy(xpath = "//button[contains(.,'Eliminar el tablero de forma permanente')]")
    private WebElement eliminarLocator;

    @FindBy(xpath = "//button[contains(@data-test-id,'close-board-delete-board-confirm-button')]")
    private WebElement eliminar2Locator;



    public void crearTListas() throws Exception {
        waitUntilElementIsVisibleNonThrow(crearListaLocator, 10);
        crearListaLocator.click();
        waitUntilElementIsVisibleNonThrow(crearListaLocator2, 10);
        crearListaLocator2.sendKeys("Por Hacer 1");
        crearListaLocator2.sendKeys((Keys.ENTER));

        waitUntilElementIsVisibleNonThrow(enProcesoLocator, 10);
        enProcesoLocator.click();
        enProcesoLocator2.sendKeys("En Proceso 1");
        enProcesoLocator2.sendKeys((Keys.ENTER));

        waitUntilElementIsVisibleNonThrow(hechoLocator, 10);
        hechoLocator.click();
        hechoLocator2.sendKeys("Finalizado 1");
        hechoLocator2.sendKeys((Keys.ENTER));
    }
    public void añadirTajeta() throws Exception {
        waitUntilElementIsVisibleNonThrow(añadirTarjetaLocator,10);
        añadirTarjetaLocator.click();
        añadirTarjetaLocator.sendKeys("Descripción");
        añadirTarjetaLocator.sendKeys((Keys.ENTER));
        waitUntilElementIsEnableNonThrow(descripcionLocator,10);
        descripcionLocator.click();

        waitUntilElementIsVisibleNonThrow(etiquetaLocator,10);
        etiquetaLocator.click();
        waitUntilElementIsVisibleNonThrow(clrEtiquetaLocator,10);
        clrEtiquetaLocator.click();
        waitUntilElementIsEnableNonThrow(btnCerrarEtiquetaLocator,10);
        btnCerrarEtiquetaLocator.click();

        waitUntilElementIsVisibleNonThrow(fechaLocator,10);
        fechaLocator.click();
        waitUntilElementIsVisibleNonThrow(btnfechaLocator,10);
        btnfechaLocator.click();

        waitUntilElementIsVisibleNonThrow(adjuntoLocator,10);
        adjuntoLocator.click();
        waitUntilElementIsVisibleNonThrow(txtAdjuntoLocator,10);
        txtAdjuntoLocator.click();
        txtAdjuntoLocator.sendKeys("https://upload.wikimedia.org/wikipedia/commons/7/7f/File-Explorer-fluent-icon.png?20200717170416");
        waitUntilElementIsVisibleNonThrow(nombredjuntoLocator,10);
        nombredjuntoLocator.click();
        nombredjuntoLocator.sendKeys("Archivo adjunto");
        waitUntilElementIsEnableNonThrow(btnAdjuntoLocator,10);
        btnAdjuntoLocator.click();

        waitUntilElementIsVisibleNonThrow(portadaLocator,10);
        portadaLocator.click();
        waitUntilElementIsVisibleNonThrow(imgPortadaLocator,10);
        imgPortadaLocator.click();
        cerrarPortadaLocator.click();

        waitUntilElementIsVisibleNonThrow(comentarioLocator,10);
        comentarioLocator.click();
        comentarioLocator.sendKeys("Comentario ");
        guardarComentarioLocator.click();

        waitUntilElementIsVisibleNonThrow(cerrarTarjetaLocator,10);
        cerrarTarjetaLocator.click();

    }
    public void moverTajeta() throws Exception {
        waitUntilElementIsVisibleNonThrow(accionListaLocator,10);
        accionListaLocator.click();
        waitUntilElementIsVisibleNonThrow(moverListaLocator,10);
        moverListaLocator.click();
        waitUntilElementIsVisibleNonThrow(selectListaLocator,10);
        selectListaLocator.click();
    }
    public void cerrarTablero() throws Exception {
        waitUntilElementIsVisibleNonThrow(mostrarMenuLocator,10);
        mostrarMenuLocator.click();
        waitUntilElementIsVisibleNonThrow(masLocator,10);
        masLocator.click();
        waitUntilElementIsVisibleNonThrow(cerrarTableroLocator,10);
        cerrarTableroLocator.click();
        waitUntilElementIsVisibleNonThrow(cerrarLocator,10);
        cerrarLocator.click();
        waitUntilElementIsVisibleNonThrow(eliminarLocator,10);
        eliminarLocator.click();
        waitUntilElementIsVisibleNonThrow(eliminar2Locator,10);
        waitUntilElementIsVisibleNonThrow(eliminar2Locator,10);
        eliminar2Locator.click();
    }

}
