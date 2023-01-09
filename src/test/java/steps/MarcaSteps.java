package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.MarcaPage;

public class MarcaSteps {
    MarcaPage marcaPage;

    public MarcaSteps(MarcaPage marcaPage) {
        this.marcaPage = marcaPage;
    }

    @E("verifico marca")
    public void verificoMarca() {
        Assert.assertEquals("BRANDS", marcaPage.verificoMarca());
    }

    @E("clico em uma marca")
    public void clicoEmUmaMarca() {
        marcaPage.clicoEmUmaMarca();
    }

    @E("verifico que fui redirecionado para paginas de marcas")
    public void verificoQueFuiRedirecionadoParaPaginasDeMarcas() {
        Assert.assertTrue(marcaPage.verificoQueFuiRedirecionadoParaPaginasDeMarcas());
    }

    @E("clico em uma marca H&M")
    public void clicoEmUmaMarcaHM() throws InterruptedException {
        marcaPage.clicoEmUmaMarcaHM();
    }

    @Entao("verifico que o usuario pode ver os produtods da marca")
    public void verificoQueOUsuarioPodeVerOsProdutodsDaMarca() {
        Assert.assertTrue(marcaPage.verificoQueOUsuarioPodeVerOsProdutodsDaMarca());
    }

}
