package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driverFactory.DriverFactory.getDriver;

public class CategoriaPage extends InteracaoWeb {
    @FindBy(css = "[href='#Women']")
    private WebElement opcmulhers;
    @FindBy(css = "[href='/category_products/1']")
    private WebElement vestido;

    @FindBy(xpath = "//h2[text() = 'Women - Dress Products']")
    private WebElement textoDosProdutos;

    @FindBy(css = "[href='#Men']")
    private WebElement homens;

    @FindBy(css = "[href='/category_products/6']")
    private WebElement jeans;

    @FindBy(xpath = "//h2[text() = 'Men - Jeans Products']")
    private WebElement textoVisivelJeans;


    public boolean verificoQueCategoriaMulheresEstaVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.cssSelector("[href='#Women']")).size() > 0;
    }

    public void clicloEmMulheresOpecaoVestido() {
        clicarbotao(opcmulhers);
        clicarbotao(vestido);
    }

    public String verificoSeEstouNaOpcaoVestido() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(textoDosProdutos));
        return textoDosProdutos.getText().trim();
    }

    public void clicoEmCategoriaHomens() throws InterruptedException {
        Thread.sleep(2000);
        clicarbotao(homens);
        clicarbotao(jeans);
    }

    public String verificoQueEstouNaPaginaJeansComTexto() {
        return textoVisivelJeans.getText().trim();
    }
}
