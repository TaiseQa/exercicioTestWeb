package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.HomePage;

public class HomeSteps {
    HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Dado("que acesso o navegador {string}")
    public void queAcessoONavegador(String url) {
        homePage.queAcessoONavegador(url);
    }

    @E("verifico que a pagina esta visivel")
    public void verificoQueAPaginaEstaVisivel() {
        Assert.assertTrue(homePage.verificoQueAPaginaEstaVisivel());
    }

    @Quando("clico em me inscrever")
    public void clicoEmMeInscrever() {
        homePage.clicoEmMeInscrever();
    }

    @Quando("rolo ate o final da pagina")
    public void roloAteOFinalDaPagina() {
        homePage.roloAteOFinalDaPagina();
    }
    @E("verifico assinatura")
    public void verificoAssinatura() {
        homePage.verificoAssinatura();
    }

    @E("clico na seta para subir a pagina")
    public void clicoNaSetaParaSubirAPagina() {
        homePage.clicoNaSetaParaSubirAPagina();
    }

    @Entao("valido mensagem {string}")
    public void validoMensagem(String texto) {
        Assert.assertEquals(texto,homePage.validoMensagem());
    }
}
