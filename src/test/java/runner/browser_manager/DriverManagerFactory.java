package runner.browser_manager;


public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager = null;
    switch (type){
        case CHROME:
            driverManager = new ChromeDriverManager();
        break;

        default:
            System.out.println("Browser Invalido");
            break;
    }
    return driverManager;
    }
}
