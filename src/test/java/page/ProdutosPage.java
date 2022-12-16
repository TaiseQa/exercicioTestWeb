package page;

import interacaoWeb.InteracaoWeb;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static driverFactory.DriverFactory.getDriver;

public class ProdutosPage extends InteracaoWeb {
    @FindBy(xpath= "(//li/a)[2]")
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

    @FindBy(xpath ="//span/span//font[.='500']" )
    private WebElement preco;

    @FindBy(xpath = "(//div//p)[4]")
    private WebElement disponibilidade;

    @FindBy(id= "search_product")
    private WebElement pesquisa;

    @FindBy(id = "submit_search")
    private WebElement btnPesquisa;

    @FindBy(xpath = "//h2[.='Searched Products']")
    private WebElement textoTodosOsProdutos;

    public void clicoEmProdutos() throws InterruptedException {
        Thread.sleep(5000);
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
    public void clicoEmDetalhesDoProduto() throws InterruptedException {
        Thread.sleep(2000);
        clicarbotao(detalheDoProduto);
    }

    public String verificoNomeDoProduto() {
        return  produto.getText();

    }
    public String verificoCategoria() {
        return categoria.getText();
    }
    public String verificopreco(){
        return preco.getText();
    }
    public String verificoDisponibilidade(){
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
    public boolean verificoProdutoVisivel(){
        getDriver().manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
        return getDriver().findElements(By.xpath("//div[@class='productinfo text-center']")).size() >0;

    }
    }
