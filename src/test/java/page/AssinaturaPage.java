package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverFactory.DriverFactory.getDriver;

public class AssinaturaPage extends InteracaoWeb {
    @FindBy(xpath = "//h2[.='Subscription']")
    private WebElement textoAssinatura;

    @FindBy(id = "susbscribe_email")
    private WebElement email;

    @FindBy(id = "subscribe")
    private WebElement btnAssinatura;

    @FindBy(css = "[class='col-md-9 form-group']")
    private WebElement TextoDeSucesso;

    public String verificoTextoAssinatura() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("scrollBy(0,250)", "");
        return textoAssinatura.getText();
    }

    public void preenchoEmail(String texto) {
        escrever(email, texto);
    }

    public void clicoNoBotaoAssinatura() {
        clicarbotao(btnAssinatura);
    }

    public String validoMensagemDeSucesso() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='col-md-9 form-group']")));
        return TextoDeSucesso.getText();
    }

}
