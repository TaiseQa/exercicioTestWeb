package driverFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaDriverService;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.nio.file.Path;
import java.sql.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.TimeUnit;



public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void iniciarDriver() {
        WebDriverManager.chromedriver().setup();
        //tirar anuncios
        ChromeOptions options = new ChromeOptions();
        options.addExtensions( new File("D:/adblock pluss/extension_3_15_2_0.crx"));
        //options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        //options.addArguments("load-extension/C:/Users/Bruno/AppData/Local/Google/Chrome/User Data/Default/Extensions/gighmmpiobklfepjocnamgkkbiglidom/5.3.3_0");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY,options);


        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public static void matarDriver() {
        driver.quit();
    }
}
