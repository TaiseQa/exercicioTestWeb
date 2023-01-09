package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.AssinaturaPage;

public class AssinaturaSteps {
    AssinaturaPage assinaturaPage;

    public AssinaturaSteps(AssinaturaPage assinaturaPage) {
        this.assinaturaPage = assinaturaPage;
    }

    @E("verifico texto assinatura {string}")
    public void verificoTextoAssinatura(String texto) {
        Assert.assertEquals(texto, assinaturaPage.verificoTextoAssinatura());
    }

    @E("preencho email{string}")
    public void preenchoEmail(String texto) {
        assinaturaPage.preenchoEmail(texto);
    }

    @E("clico no botao assinatura")
    public void clicoNoBotaoAssinatura() {
        assinaturaPage.clicoNoBotaoAssinatura();
    }

    @Entao("valido mensagem de sucesso {string}")
    public void validoMensagemDeSucesso(String texto) {
        Assert.assertEquals(texto, assinaturaPage.validoMensagemDeSucesso());
    }
}
