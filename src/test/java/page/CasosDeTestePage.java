package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasosDeTestePage extends InteracaoWeb {
    @FindBy(xpath = "//li/a[@href='/test_cases']")
    private WebElement btnCasoDeTeste;

    @FindBy(xpath = "//h2/b")
    private WebElement textoVisivel;

    public void clicoEmCasoDeTeste() {
        clicarbotao(btnCasoDeTeste);
    }

    public String verificoQueFuiRedirecionadoParaPaginaCasoDeTeste() {
        return textoVisivel.getText();
    }
}