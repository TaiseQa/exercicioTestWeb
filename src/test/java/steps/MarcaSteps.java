package steps;

import io.cucumber.java.pt.E;
import org.junit.Assert;
import page.MarcaPage;

public class MarcaSteps {
    MarcaPage marcaPage;

    public MarcaSteps(MarcaPage marcaPage){
        this.marcaPage = marcaPage;
    }
    @E("verifico marca")
    public void verificoMarca(){
        Assert.assertEquals("BRANDS",marcaPage.verificoMarca());

    }

    @E("clico em uma marca")
    public void clicoEmUmaMarca() throws InterruptedException {
        marcaPage.clicoEmUmaMarca();
    }

    @E("verifico que fui redirecionado para paginas de marcas")
    public void verificoQueFuiRedirecionadoParaPaginasDeMarcas() {
        Assert.assertTrue(marcaPage.verificoQueFuiRedirecionadoParaPaginasDeMarcas());

    }
}
