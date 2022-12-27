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


    public String verificoMarca() {
        return textoMarca.getText().trim();

    }

    public void clicoEmUmaMarca() throws InterruptedException {
        Thread.sleep(3000);
        focarElemento(polo);
        Thread.sleep(3000);
        clicarbotao(polo);
        Thread.sleep(5000);
        teste();
    }

    public boolean verificoQueFuiRedirecionadoParaPaginasDeMarcas() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return getDriver().findElements(By.cssSelector("//h2[text() = 'Brand - Polo Products']")).size() > 0;

    }
}
