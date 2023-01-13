package interacaoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import static driverFactory.DriverFactory.getDriver;

public class InteracaoWeb {

    public InteracaoWeb() {
        PageFactory.initElements(getDriver(), this);
    }

    public void esperarElementoClicavel(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void clicarbotao(WebElement element) {
        esperarElementoClicavel(element);
        element.click();
    }

    public void escrever(WebElement element, String texto) {
        esperarElementoClicavel(element);
        element.clear();
        element.sendKeys(texto);
    }

    public void verificarIframe() {
        if (verificoQueAPaginaEstaVisivelId("aswift_6")) {
            getDriver().switchTo().frame(getDriver().findElement(By.id("aswift_6")));
            getDriver().findElement(By.id("dismiss-button")).click();
            getDriver().switchTo().defaultContent();
        }
    }

    public boolean verificoQueAPaginaEstaVisivelXpath(String xpathElement) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return getDriver().findElements(By.xpath(xpathElement)).size() > 0;
    }

    public boolean verificoQueAPaginaEstaVisivelId(String idElement) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return getDriver().findElements(By.id(idElement)).size() > 0;
    }

    public boolean verificoQueAPaginaEstaVisivelCss(String CssElement) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return getDriver().findElements(By.cssSelector(CssElement)).size() > 0;
    }

    public void focarElemento(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void esperar(long time) {
        try {
            synchronized (this) {
                wait(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt +"@gmail.com";

    }
}
