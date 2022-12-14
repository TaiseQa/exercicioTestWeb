package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.ProdutosPage;

public class ProdutosSteps {
    ProdutosPage produtosPage;

    public ProdutosSteps(ProdutosPage produtosPage) {
        this.produtosPage = produtosPage;
    }

    @Quando("clico em produtos")
    public void clicoEmProdutos() throws InterruptedException {
        produtosPage.clicoEmProdutos();
    }

    @E("verifico texto do produtos {string}")
    public void verificoTextoDoProdutos(String texto) {
        Assert.assertEquals(texto, produtosPage.verificoTextoDoProdutos());
    }

    @E("verifico que a lista de produtos e visivel")
    public void verificoQueAListaDeProdutosEVisivel() {
        Assert.assertTrue(produtosPage.verificoQueAListaDeProdutosEVisivel());
    }

    @E("clico em detalhes do produto")
    public void clicoEmDetalhesDoProduto() throws InterruptedException {
        produtosPage.clicoEmDetalhesDoProduto();
    }

    @E("verifico nome do produto e categoria e preco e disponibilidade e condicao e marca")
    public void verificoNomeDoProdutoECategoriaEPrecoEDisponibilidadeECondicaoEMarca(DataTable dataTable) {

    }
    @E("verifico nome do produto {string}")
    public void verificoNomeDoProduto(String texto) {
        Assert.assertEquals(texto, produtosPage.verificoNomeDoProduto());
    }
    @E("verifico preco {string}")
    public void verificoPreco(String arg0) {

    }


}
