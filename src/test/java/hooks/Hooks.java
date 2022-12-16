package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import static driverFactory.DriverFactory.iniciarDriver;
import static driverFactory.DriverFactory.matarDriver;

public class Hooks {
    @Before
    public void iniciarNavegador() {
        iniciarDriver();

    }
    @After
    public void fecharNavegador(){
//            matarDriver();
    }
}
