package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static driverFactory.DriverFactory.getDriver;

public class MarcaPage extends InteracaoWeb {

    @FindBy(xpath = "//h2[text() = 'Brands']")
    private WebElement textoMarca;

    @FindBy(css = "[href='/brand_products/Polo']")
    private WebElement polo;

    @FindBy(css = "[href='/brand_products/H&M']")
    private WebElement marcaHeM;

    @FindBy(xpath = "//h2[text()='Brand - Polo Products']")
    private WebElement textoPolo;


    public String verificoMarca() {
        return textoMarca.getText().trim();
    }

    public void clicoEmUmaMarca()  {
        esperar(2000);
        focarElemento(polo);
        esperar(3000);
        clicarbotao(polo);
        esperar(5000);
    }

    public boolean verificoQueFuiRedirecionadoParaPaginasDeMarcas() {
        return verificoQueAPaginaEstaVisivelXpath("//h2[text() = 'Brand - Polo Products']");
    }

    public void clicoEmUmaMarcaHM() {
        esperar(2000);
        focarElemento(marcaHeM);
        esperar(2000);
        clicarbotao(marcaHeM);
    }

    public boolean verificoQueOUsuarioPodeVerOsProdutodsDaMarca() {
        return verificoQueAPaginaEstaVisivelXpath("//h2[text()='Brand - H&M Products']");
    }
}
