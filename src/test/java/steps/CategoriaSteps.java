package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.CategoriaPage;

public class CategoriaSteps {
    CategoriaPage categoriaPage;

    public CategoriaSteps(CategoriaPage categoriaPage) {
        this.categoriaPage = categoriaPage;
    }

    @E("verifico que catergoria mulheres esta visivel")
    public void verificoQueCategoriaMulheresEstaVisivel() {
        Assert.assertTrue(categoriaPage.verificoQueCategoriaMulheresEstaVisivel());
    }

    @E("cliclo em mulheres opecao vestido")
    public void clicloEmMulheresOpecaoVestido() {
        categoriaPage.clicloEmMulheresOpecaoVestido();
    }

    @E("verifico se estou na opcao vestido com texto {string}")
    public void verificoSeEstouNaOpcaoVestidoComTexto(String texto)  {
        Assert.assertEquals(texto, categoriaPage.verificoSeEstouNaOpcaoVestido());
    }

    @E("clico em categoria homens")
    public void clicoEmCategoriaHomens()  {
        categoriaPage.clicoEmCategoriaHomens();
    }

    @Entao("verifico que estou na pagina jeans com texto{string}")
    public void verificoQueEstouNaPaginaJeansComTexto(String texto) {
        Assert.assertEquals(texto, categoriaPage.verificoQueEstouNaPaginaJeansComTexto());
    }
}
