package page;

import interacaoWeb.InteracaoWeb;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

import static driverFactory.DriverFactory.getDriver;

public class CarrinhoPage extends InteracaoWeb {
    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement btnCarrinho;

    @FindBy(xpath = "(//a[@data-product-id='1'])[2]")
    private WebElement addCarrinho;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[1]")
    private WebElement modalProduto;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    private WebElement continuarComprando;

    @FindBy(xpath = "(//div[@class='product-image-wrapper'])[2]")
    private WebElement modalProduto2;
    @FindBy(xpath = "(//a[@data-product-id='2'])[2]")
    private WebElement addCarinho2;

    @FindBy(xpath = "//div[@id='cartModal']//a")
    private WebElement visualizarCarrinho;

    @FindBy(xpath = "//tr[@id='product-1']//td[3]/p")
    private WebElement visualizarPreco;

    @FindBy(xpath = "//tr[@id='product-1']//td[4]")
    private WebElement visualizoQuantidade;

    @FindBy(xpath = "//tr[@id='product-1']//td[5]")
    private WebElement visualizarValorTotal;

    @FindBy(xpath = "//tr[@id='product-2']//td[3]")
    private WebElement visualizarpreco2;

    @FindBy(xpath = "//tr[@id='product-2']//td[4]")
    private WebElement visualizarQuantidade2;

    @FindBy(xpath = "//tr[@id='product-2']//td[5]")
    private WebElement visualizarPrecoTotalItem2;

    @FindBy(css = "[href='/product_details/1']")
    private WebElement detalhesDoProduto;

    @FindBy(id = "quantity")
    private WebElement quantidade;

    @FindBy(xpath = "(//button)[2]")
    private WebElement addProduto;

    @FindBy(xpath = "//tr[@id='product-1']//td[4]")
    private WebElement quantidadeVisivel;

    @FindBy(xpath = "(//a[@class='btn btn-default check_out'])")
    private WebElement btnCheckout;

    @FindBy(xpath = "//*[@id='checkoutModal']/div/div/div[2]/p[2]/a")
    private WebElement registrar;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    private WebElement carrinhoEntrar;

    @FindBy(xpath = "//textarea")
    private WebElement areaTexto;

    @FindBy(css = "[class='btn btn-default check_out']")
    private WebElement comprar;

    @FindBy(css = "[name='name_on_card']")
    private WebElement nomeDoCartao;

    @FindBy(css = "[data-qa='card-number']")
    private WebElement numeroDoCartao;

    @FindBy(css = "[data-qa='cvc']")
    private WebElement cvc;

    @FindBy(css = "[data-qa='expiry-month']")
    private WebElement expiracao;

    @FindBy(css = "[data-qa='expiry-year']")
    private WebElement ano;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(css = "[data-qa='order-placed']")
    private WebElement pedifoFeito;

    @FindBy(css = "[data-product-id='1']")
    private WebElement excluirProduto;

    @FindBy(xpath = "//p/b")
    private WebElement textoDoCarrinho;

    public void ClicoEmCarrinho() {
        esperar(5000);
        clicarbotao(btnCarrinho);
    }

    public void adicionoItemNoCarrinho() {
        focarElemento(modalProduto);
        new Actions(getDriver()).moveToElement(modalProduto).perform();
        clicarbotao(addCarrinho);
    }

    public void clicoEmContinuarComprando() {
        clicarbotao(continuarComprando);
    }

    public void adicionoSegundoItem() {
        new Actions(getDriver()).moveToElement(modalProduto2).perform();
        focarElemento(addCarinho2);
        clicarbotao(addCarinho2);
    }

    public void clicoEmVisualizarCarrinho() {
        clicarbotao(visualizarCarrinho);
    }

    public boolean verificoOsProdutosEstaoVisiveis() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.cssSelector("[class='table table-condensed']")).size() > 0;
    }

    public String verificoPrecoDoItem() {
        return visualizarPreco.getText();
    }

    public String verificoQuantidadeDoItem() {
        return visualizoQuantidade.getText();
    }

    public String verificoValorTotalDoItem() {
        return visualizarValorTotal.getText();
    }

    public String verificoPrecoDoItemDois() {
        return visualizarpreco2.getText();
    }

    public String verificoQuantidadeDoItemDois() {
        return visualizarQuantidade2.getText();
    }

    public String verificoValorTotalDoItemDois() {
        return visualizarPrecoTotalItem2.getText();
    }

    public void clicoEmVisualizarDetalhesDoProduto() {
        clicarbotao(detalhesDoProduto);
    }

    public boolean verificoVisualicaoDoDetalhes() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.cssSelector("[class='col-sm-7']")).size() > 0;
    }

    public void preenchoQuantidade(String texto) {
        escrever(quantidade, texto);
    }

    public void clicoEmAdicionarProduto() {
        clicarbotao(addProduto);
    }

    public String verificoAQuantidadeE() {
        return quantidadeVisivel.getText();
    }

    public void clicoEmCheckout() {
        clicarbotao(btnCheckout);
    }

    public void clicoEmFazerRegistro() {
        clicarbotao(registrar);
    }

    public void clicoNoBotaoCarrinho() {
        focarElemento(carrinhoEntrar);
        clicarbotao(carrinhoEntrar);
    }

    public boolean verificoDadosVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.id("address_delivery")).size() > 0;
    }

    public void insiroDescricaoEClicoEmFazerPedido(String texto) {
        escrever(areaTexto, texto);
        clicarbotao(comprar);
    }

    public void prenchoNomeDoCartaoENumeroDoCartaoECvcEExpiracaoEAno(DataTable dataTable) {
        List<List<String>> data = dataTable.cells();
        escrever(nomeDoCartao, data.get(1).get(1));
        escrever(numeroDoCartao, data.get(2).get(1));
        escrever(cvc, data.get(3).get(1));
        escrever(expiracao, data.get(3).get(1));
        escrever(ano, data.get(4).get(1));
    }

    public void clicoEmSubmit() {
        clicarbotao(submit);
    }

    public String verifiqueAMensagemVisivel() {
        return pedifoFeito.getText();
    }

    public boolean verificoQueAPaginaCarrinhoEVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.cssSelector("[class='active']")).size() > 0;
    }

    public void excluoOProdutoDoCarrinho() {
        clicarbotao(excluirProduto);
    }

    public String validoQueOProdutoFoiExcluido() {
        esperar(1000);
        return textoDoCarrinho.getText().trim();
    }

}


