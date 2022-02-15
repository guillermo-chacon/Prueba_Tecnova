package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends TestBase {

    @Given("^usuario en pagina trello preciona boton inicio de sesion$")
    public void usuarioEnPaginaTrelloPrecionaBotonInicioDeSesion() throws Throwable {
        loginPage.iniciarSesion();
        Assert.assertTrue(loginPage.showTextoInicioDisplayed());
    }
    @When("^ingresar \"([^\"]*)\" y \"([^\"]*)\" presionar boton iniciar sesion$")
    public void ingresarYContraseñaPresionarBotonIniciarSesion(String correo, String contraseña ) throws Throwable {
        loginPage.ingresarCorreoSesion(correo);
        Assert.assertTrue(loginPage.showTextoCorreoOKDisplayed());
        loginPage.ingresarContraseñaSesion(contraseña);
    }

    @Then("^ingresa a pagina principal$")
    public void ingresaAPaginaPrincipal() throws Throwable {
        Assert.assertTrue(loginPage.showTextoContraseñaOKDisplayed());
    }

    ///////////////////// crear tablero /////////////////////////////

    @Given("^Ir a la url de trello y Loguearse en la aplicación \"([^\"]*)\" y \"([^\"]*)\"$")
    public void irALaUrlDeTrelloYLoguearseEnLaAplicaciónY(String correo, String contraseña) throws Throwable {
        loginPage.iniciarSesion();
        loginPage.ingresarCorreoSesion(correo);
        loginPage.ingresarContraseñaSesion(contraseña);
    }
    @When("^Crear Tablero$")
    public void crearTablero() throws Throwable {
        homePage.crearTablero();
    }
    @When("^Crear Listas Por Hacer En Proceso Finalizado$")
    public void crearListasPorHacerEnProcesoFinalizado() throws Throwable {
        tableroPage.crearTListas();
    }

    @When("^Generar una tarjeta nueva en la lista por hacer$")
    public void generarUnaTarjetaNuevaEnLaListaPorHacer() throws Throwable {
        tableroPage.añadirTajeta();
    }

    @Then("^Mover la tarjeta previamente creada a En proceso$")
    public void moverLaTarjetaPreviamenteCreadaAEnProceso() throws Throwable {
        tableroPage.moverTajeta();
    }
    @When("^cerrar$")
    public void cerrar() throws Throwable {
        tableroPage.cerrarTablero();
    }
}