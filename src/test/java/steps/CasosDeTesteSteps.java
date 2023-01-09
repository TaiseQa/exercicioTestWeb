package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.CasosDeTestePage;

public class CasosDeTesteSteps {
    CasosDeTestePage casosDeTestePage;

    public CasosDeTesteSteps(CasosDeTestePage casosDeTestePage) {
        this.casosDeTestePage = casosDeTestePage;
    }

    @Quando("clico em caso de teste")
    public void clicoEmCasoDeTeste() {
        casosDeTestePage.clicoEmCasoDeTeste();
    }

    @Entao("verifico que fui redirecionado para pagina caso de teste")
    public void verificoQueFuiRedirecionadoParaPaginaCasoDeTeste() {
        Assert.assertEquals("TEST CASES", casosDeTestePage.verificoQueFuiRedirecionadoParaPaginaCasoDeTeste());
    }
}
