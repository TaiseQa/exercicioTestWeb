package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
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

    @E("verifico categoria {string}")
    public void verificoCategoria(String texto) {
        Assert.assertEquals(texto, produtosPage.verificoCategoria());
    }


    @E("verifico preco {string}")
    public void verificoPreco(String texto) {
        Assert.assertEquals(texto,produtosPage.verificopreco());
    }

    @E("verifico disponibilidade {string}")
    public void verificoDisponibilidade(String texto) {
        System.out.println(produtosPage.verificoDisponibilidade());
    }

    @E("preencho nome do produto na barra de pesquisa{string}")
    public void preenchoNomeDoProdutoNaBarraDePesquisa(String texto) {
        produtosPage.preenchoNomeDoProdutoNaBarraDePesquisa(texto);
    }

    @E("clico em pesquisar")
    public void clicoEmPesquisar() {
        produtosPage.clicoEmPesquisar();
    }

    @E("verifico texto todos os produtos{string}")
    public void verificoTextoTodosOsProdutos(String texto) {
        Assert.assertEquals(texto,produtosPage.verificoTextoTodosOsProdutos());
    }

    @Entao("verifico produto visivel")
    public void verificoProdutoVisivel() {
Assert.assertTrue(produtosPage.verificoProdutoVisivel());
    }

}

