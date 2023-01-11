package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.CarrinhoPage;

public class CarrinhoSteps {
    CarrinhoPage carrinhoPage;

    public CarrinhoSteps(CarrinhoPage carrinhoPage) {
        this.carrinhoPage = carrinhoPage;
    }

    @Quando("clico em carrinho")
    public void ClicoEmCarrinho() throws InterruptedException {
        carrinhoPage.ClicoEmCarrinho();
    }

    @E("adiciono item no carrinho")
    public void adicionoItemNoCarrinho() {
        carrinhoPage.adicionoItemNoCarrinho();

    }

    @E("clico em continuar comprando")
    public void clicoEmContinuarComprando() {
        carrinhoPage.clicoEmContinuarComprando();
    }

    @E("adiciono segundo item")
    public void adicionoSegundoItem() {
        carrinhoPage.adicionoSegundoItem();
    }

    @E("clico em visualizar carrinho")
    public void clicoEmVisualizarCarrinho() {
        carrinhoPage.clicoEmVisualizarCarrinho();
    }

    @E("verifico os produtos estao visiveis")
    public void verificoOsProdutosEstaoVisiveis() {
        Assert.assertTrue(carrinhoPage.verificoOsProdutosEstaoVisiveis());
    }

    @E("verifico preco do item {string}")
    public void verificoPrecoDoItem(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoPrecoDoItem());

    }

    @E("verifico quantidade do item{string}")
    public void verificoQuantidadeDoItem(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoQuantidadeDoItem());
    }

    @E("verifico valor total do item {string}")
    public void verificoValorTotalDoItem(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoValorTotalDoItem());
    }


    @E("verifico preco do item dois{string}")
    public void verificoPrecoDoItemDois(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoPrecoDoItemDois());

    }

    @E("Verifico quantidade do item dois{string}")
    public void verificoQuantidadeDoItemDois(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoQuantidadeDoItemDois());
    }

    @Entao("verifico valor total do item dois{string}")
    public void verificoValorTotalDoItemDois(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoValorTotalDoItemDois());
    }

    @E("clico em visualizar detalhes do produto")
    public void clicoEmVisualizarDetalhesDoProduto() {
        carrinhoPage.clicoEmVisualizarDetalhesDoProduto();
    }

    @E("verifico visualicao do detalhes")
    public void verificoVisualicaoDoDetalhes() {
        carrinhoPage.verificoVisualicaoDoDetalhes();

    }

    @E("preencho quantidade {string}")
    public void preenchoQuantidade(String texto) {
        carrinhoPage.preenchoQuantidade(texto);
    }

    @E("clico em adicionar produto")
    public void clicoEmAdicionarProduto() {
        carrinhoPage.clicoEmAdicionarProduto();
    }

    @Entao("verifico a quantidade e {string}")
    public void verificoAQuantidadeE(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoAQuantidadeE());

    }

    @E("clico em  checkout")
    public void clicoEmCheckout() {
        carrinhoPage.clicoEmCheckout();

    }

    @E("clico em fazer registro")
    public void clicoEmFazerRegistro() {
        carrinhoPage.clicoEmFazerRegistro();
    }

    @E("clico no botao carrinho")
    public void clicoNoBotaoCarrinho() {
        carrinhoPage.clicoNoBotaoCarrinho();
    }

    @E("verifico dados visivel")
    public void verificoDadosVisivel() {
        carrinhoPage.verificoDadosVisivel();

    }

    @E("insiro descricao e clico em fazer pedido {string}")
    public void insiroDescricaoEClicoEmFazerPedido(String texto) {
        carrinhoPage.insiroDescricaoEClicoEmFazerPedido(texto);

    }

    @E("prencho nome do cartao e numero do cartao e cvc e expiracao e ano")
    public void prenchoNomeDoCartaoENumeroDoCartaoECvcEExpiracaoEAno(DataTable dataTable) {
        carrinhoPage.prenchoNomeDoCartaoENumeroDoCartaoECvcEExpiracaoEAno(dataTable);
    }

    @E("clico em submit")
    public void clicoEmSubmit() {
        carrinhoPage.clicoEmSubmit();

    }

    @Entao("verifique a mensagem visivel {string}")
    public void verifiqueAMensagemVisivel(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verifiqueAMensagemVisivel());
        ;
    }

    @E("verifico que a pagina carrinho e visivel")
    public void verificoQueAPaginaCarrinhoEVisivel() {
        Assert.assertTrue(carrinhoPage.verificoQueAPaginaCarrinhoEVisivel());

    }

    @E("excluo o produto do carrinho")
    public void excluoOProdutoDoCarrinho() {
        carrinhoPage.excluoOProdutoDoCarrinho();

    }

    @Entao("valido que o produto foi excluido")
    public void validoQueOProdutoFoiExcluido() {
        Assert.assertEquals("Cart is empty!", carrinhoPage.validoQueOProdutoFoiExcluido());
    }

    @E("clico em adicionar ao carrinho")
    public void clicoEmAdicionarAoCarrinho() {
    }

    @E("verifico que o endereco de entrega e {string}")
    public void verificoQueOEnderecoDeEntregaE(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoQueOEnderecoDeEntregaE());
    }

    @E("verifico o endereco de cobranca e {string}")
    public void verificoOEnderecoDeCobrancaE(String texto) {
        Assert.assertEquals(texto, carrinhoPage.verificoOEnderecoDeCobrancaE());
    }

    @E("clico em registrar")
    public void clicoEmRegistrar() {
        carrinhoPage.clicoEmRegistrar();
    }

    @E("adiciono comentario {string}")
    public void adicionoComentario(String texto) {
        carrinhoPage.adicionoComentario(texto);
    }

    @E("clico em fazer pedido")
    public void clicoEmFazerPedido() {
        carrinhoPage.clicoEmFazerPedido();
    }

    @E("clico em fazer download")
    public void clicoEmFazerDownload() {
        carrinhoPage.clicoEmFazerDownload();

    }

    @Entao("valido que o download foi feito")
    public void validoQueODownloadFoiFeito() {
        Assert.assertTrue(carrinhoPage.validoQueODownloadFoiFeito());

    }
}
