package interacaoWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverFactory.DriverFactory.getDriver;

public class InteracaoWeb {

    public InteracaoWeb() {
        PageFactory.initElements(getDriver(), this);

    }

    public void esperarElementoClicavel(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
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
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.xpath(xpathElement)).size() > 0;
    }

    public boolean verificoQueAPaginaEstaVisivelId(String idElement) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.id("idElement")).size() > 0;
    }
public void focarElemento(WebElement element){
    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);

}


}
