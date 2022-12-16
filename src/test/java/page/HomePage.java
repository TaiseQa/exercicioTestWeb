package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static driverFactory.DriverFactory.getDriver;

public class HomePage extends InteracaoWeb {

  @FindBy (css = "[href='/login']")
  private WebElement inscreverLogin;

    public void queAcessoONavegador(String url) {
        getDriver().get(url);
    }

    public boolean verificoQueAPaginaEstaVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.xpath("(//a[@href='/'])[1]")).size() > 0;
    }

    public void clicoEmMeInscrever() {
        clicarbotao(inscreverLogin);
    }

}

