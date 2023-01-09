package page;

import interacaoWeb.InteracaoWeb;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static driverFactory.DriverFactory.getDriver;

public class ProdutosPage extends InteracaoWeb {
    @FindBy(xpath = "(//li/a)[2]")
    private WebElement btnProdutos;

    @FindBy(xpath = "//h2[.='All Products']")
    private WebElement textoProdutos;

    @FindBy(xpath = "//div[@class='features_items']")
    private WebElement lista;

    @FindBy(xpath = "(//li/a)[24]")
    private WebElement detalheDoProduto;

    @FindBy(xpath = "//h2[.='Blue Top']")
    private WebElement produto;

    @FindBy(xpath = "//p[.='Category: Women > Tops']")
    private WebElement categoria;

    @FindBy(xpath = "//span/span//font[.='500']")
    private WebElement preco;

    @FindBy(xpath = "(//div//p)[4]")
    private WebElement disponibilidade;

    @FindBy(id = "search_product")
    private WebElement pesquisa;

    @FindBy(id = "submit_search")
    private WebElement btnPesquisa;

    @FindBy(xpath = "//h2[.='Searched Products']")
    private WebElement textoTodosOsProdutos;

    @FindBy(xpath = "//h2[text()='All Products']")
    private WebElement textoDoProduto;

    @FindBy(css = "[href='/product_details/1']")
    private WebElement visualizarProduto;

    @FindBy(id = "name")
    private WebElement nome;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "review")
    private WebElement comentario;

    @FindBy(id = "button-review")
    private WebElement enviar;

    @FindBy(xpath = "//span[text() = 'Thank you for your review.']")
    private WebElement textoConfirmacao;

    @FindBy(css = "[class='right recommended-item-control']")
    private WebElement btnRight;

    @FindBy(css = "[class='left recommended-item-control']")
    private WebElement btnLeft;

    @FindBy(xpath = "//div[@class='item active']//div//a[@data-product-id='1']")
    private WebElement CamisetaProduto;


    public void clicoEmProdutos() {
        esperar(5000);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@class='nav navbar-nav']//a)[2]")));
        clicarbotao(btnProdutos);
        verificarIframe();
    }

    public String verificoTextoDoProdutos() {
        return textoProdutos.getText();
    }

    public boolean verificoQueAListaDeProdutosEVisivel() {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        return getDriver().findElements(By.xpath("//div[@class='features_items']")).size() > 0;
    }

    public void clicoEmDetalhesDoProduto() {
        esperar(2000);
        clicarbotao(detalheDoProduto);
    }

    public String verificoNomeDoProduto() {
        return produto.getText();
    }

    public String verificoCategoria() {
        return categoria.getText();
    }

    public String verificopreco() {
        return preco.getText();
    }

    public String verificoDisponibilidade() {
        return disponibilidade.getText();
    }

    public void preenchoNomeDoProdutoNaBarraDePesquisa(String texto) {
        escrever(pesquisa, texto);
    }

    public void clicoEmPesquisar() {
        clicarbotao(btnPesquisa);
    }

    public String verificoTextoTodosOsProdutos() {
        return textoTodosOsProdutos.getText();
    }

    public boolean verificoProdutoVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return getDriver().findElements(By.xpath("//div[@class='productinfo text-center']")).size() > 0;
    }

    public String verificoTextoDoProduto() {
        return textoDoProduto.getText();
    }

    public void pesquisoProduto(String texto) {
        escrever(pesquisa, texto);
        clicarbotao(pesquisa);
    }

    public boolean verificoQueOProdutoEstaVisivelNoCarinho() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return getDriver().findElements(By.xpath("//img[@src='get_product_picture/1']")).size() > 0;
    }

    public void clicoNoBotaoExibirProduto() {
        clicarbotao(visualizarProduto);
    }

    public boolean verificoQueEstaVisivelAvaliacao() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return getDriver().findElements(By.cssSelector("[href='#reviews']")).size() > 0;
    }

    public void preenchoNomeEmailEComentario(DataTable dataTable) {
        List<List<String>> data = dataTable.cells();
        escrever(nome, data.get(1).get(1));
        escrever(email, data.get(2).get(1));
        escrever(comentario, data.get(3).get(1));
    }

    public void clicoEmAdicionarComentario() {
        enviar.submit();
    }

    public String verificoAMensagem() {
        return textoConfirmacao.getText();
    }

    public void vouAteItensRecomendados() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clicoNoProduto() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='item active']//div//a[@data-product-id='1']")));

        clicarbotao(CamisetaProduto);
    }
}
