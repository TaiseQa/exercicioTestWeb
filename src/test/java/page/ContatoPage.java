package page;

import interacaoWeb.InteracaoWeb;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static driverFactory.DriverFactory.getDriver;

public class ContatoPage extends InteracaoWeb {

    @FindBy(css = "[href='/contact_us']")
    private WebElement botaocontato;

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    private WebElement textoContato;

    @FindBy(css = "[data-qa='name']")
    private WebElement nome;

    @FindBy(css = "[data-qa='email']")
    private WebElement email;

    @FindBy(css = "[data-qa='subject']")
    private WebElement assunto;

    @FindBy(css = "[data-qa='message']")
    private WebElement menssagem;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement uploadArquivo;

    @FindBy(css = "[data-qa='submit-button']")
    private WebElement botaoEnviar;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement msgSucesso;

    @FindBy(xpath = "(//div/div[1]/ul/li/a)[1]")
    private WebElement btnPaginaInicial;

    @FindBy(xpath = "//div[@id='dismiss-button']/div/span")
    private WebElement btnFecharAnuncio;

    public void clicoNoBotaoFaleCOnosco() {
        clicarbotao(botaocontato);
    }

    public String verificoQueOTestoNoContatoEstaVisivel() {
        return textoContato.getText().trim();
    }

    public void preenchoNomeEEmailEAssuntoEMensagem(DataTable dataTable) {
        List<List<String>> data = dataTable.cells();
        // get coluna e linha
        escrever(nome, data.get(1).get(1));
        escrever(email, data.get(2).get(1));
        escrever(assunto, data.get(3).get(1));
        escrever(menssagem, data.get(4).get(1));

    }

    public void clicoEmSubirArquivo() {
        //clicarbotao(uploadArquivo);
        uploadArquivo.sendKeys("D:/img/avatar.png");
    }

    public void clicoEmEnviar() {
        clicarbotao(botaoEnviar);
    }

    public void clicoEmOk() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }

    public String validoMensagemDeSucessoVisivel() {
        return msgSucesso.getText();
    }

    public String validoQueFuiRedirecionadoParaPaginaInicial() {
        clicarbotao(btnPaginaInicial);
        return  getDriver().getCurrentUrl();


    }
}
