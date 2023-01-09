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
    public void clicoEmProdutos() {
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
    public void clicoEmDetalhesDoProduto()  {
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
        Assert.assertEquals(texto, produtosPage.verificopreco());
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
        Assert.assertEquals(texto, produtosPage.verificoTextoTodosOsProdutos());
    }

    @Entao("verifico produto visivel")
    public void verificoProdutoVisivel() {
        Assert.assertTrue(produtosPage.verificoProdutoVisivel());
    }

    @E("pesquiso produto {string}")
    public void pesquisoProduto(String texto) {
        produtosPage.pesquisoProduto(texto);
    }

    @E("verifico que o produto procurado esta visivel")
    public void verificoQueOProdutoProcuradoEstaVisivel() {
        Assert.assertTrue(produtosPage.verificoProdutoVisivel());
    }

    @E("verifico texto do produto {string}")
    public void verificoTextoDoProduto(String texto) {
        Assert.assertEquals(texto, produtosPage.verificoTextoDoProduto());
    }

    @E("verifico que o produto esta visivel no carinho")
    public void verificoQueOProdutoEstaVisivelNoCarinho() {
        Assert.assertTrue(produtosPage.verificoQueOProdutoEstaVisivelNoCarinho());
    }

    @E("clico no botao exibir produto")
    public void clicoNoBotaoExibirProduto() {
        produtosPage.clicoNoBotaoExibirProduto();
    }

    @E("verifico que esta visivel avaliacao")
    public void verificoQueEstaVisivelAvaliacao() {
        Assert.assertTrue(produtosPage.verificoQueEstaVisivelAvaliacao());
    }

    @E("preencho nome email e comentario")
    public void preenchoNomeEmailEComentario(DataTable dataTable) {
        produtosPage.preenchoNomeEmailEComentario(dataTable);
    }

    @E("clico em adicionar comentario")
    public void clicoEmAdicionarComentario() {
        produtosPage.clicoEmAdicionarComentario();
    }

    @Entao("verifico a mensagem {string}")
    public void verificoAMensagem(String texto) {
        Assert.assertEquals(texto, produtosPage.verificoAMensagem());
    }

    @E("vou ate itens recomendados")
    public void vouAteItensRecomendados() {
        produtosPage.vouAteItensRecomendados();
    }

    @E("clico no produto")
    public void clicoNoProduto() {
        produtosPage.clicoNoProduto();
    }
}

