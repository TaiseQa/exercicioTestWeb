package interacaoWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driverFactory.DriverFactory.getDriver;

public class InteracaoWeb {

    public InteracaoWeb() {
        PageFactory.initElements(getDriver(), this);

    }

    public void esperarElementoClicavel(WebElement elemento) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void clicarbotao(WebElement element) {
        esperarElementoClicavel(element);
        element.click();
    }
    public void escrever(WebElement element, String texto){
        esperarElementoClicavel(element);
        element.clear();
        element.sendKeys(texto);

    }

}
