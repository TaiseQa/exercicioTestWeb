package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static driverFactory.DriverFactory.getDriver;

public class HomePage extends InteracaoWeb {

  @FindBy (css = "[href='/login']")
  private WebElement inscreverLogin;

  @FindBy(id = "scrollUp")
  private WebElement seta;

  @FindBy(xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")
  private WebElement mensagem;

  @FindBy(css = "[class='fa fa-angle-right']")
  private WebElement setaDireita;

    public void queAcessoONavegador(String url) {
        getDriver().get(url);
        ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
        getDriver().close();
        getDriver().switchTo().window(tabs2.get(0));
    }

    public boolean verificoQueAPaginaEstaVisivel() {
        return verificoQueAPaginaEstaVisivelXpath("(//a[@href='/'])[1]");
    }

    public void clicoEmMeInscrever() {
        clicarbotao(inscreverLogin);
    }
    public void roloAteOFinalDaPagina() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public boolean verificoAssinatura() {
        return verificoQueAPaginaEstaVisivelXpath("//h2[text()='Subscription']");
    }
    public void clicoNaSetaParaSubirAPagina() {
        clicarbotao(seta);
    }
    public String validoMensagem() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']")));

        return mensagem.getText();
    }
}

