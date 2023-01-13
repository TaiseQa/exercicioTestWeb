package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static driverFactory.DriverFactory.*;

public class Hooks {
    @Before
    public void iniciarNavegador() {
        iniciarDriver();
    }

    @After
    public void fecharNavegador(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) getDriver();

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.embed(src,"image.png", "Print Da Falha");
        }
        matarDriver();

    }

}
