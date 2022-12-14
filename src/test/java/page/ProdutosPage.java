package page;

import interacaoWeb.InteracaoWeb;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
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

    public void clicoEmProdutos() throws InterruptedException {
        Thread.sleep(3000);
        clicarbotao(btnProdutos);
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
    }
