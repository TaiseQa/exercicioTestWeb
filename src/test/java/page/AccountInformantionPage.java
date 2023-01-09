package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static driverFactory.DriverFactory.getDriver;

public class AccountInformantionPage extends InteracaoWeb {

    @FindBy(id = "id_gender1")
    private WebElement masculino;

    @FindBy(id = "id_gender2")
    private WebElement feminino;

    @FindBy(id = "password")
    private WebElement senha;

    @FindBy(id = "days")
    private WebElement dias;

    @FindBy(id = "months")
    private WebElement mes;

    @FindBy(id = "years")
    private WebElement anos;

    @FindBy(id = "newsletter")
    private WebElement assine;

    @FindBy(id = "optin")
    private WebElement promocoes;

    @FindBy(id = "first_name")
    private WebElement primeiroNome;

    @FindBy(id = "last_name")
    private WebElement sobrenome;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement endereco;

    @FindBy(id = "country")
    private WebElement pais;

    @FindBy(id = "state")
    private WebElement estado;

    @FindBy(id = "city")
    private WebElement cidade;

    @FindBy(id = "zipcode")
    private WebElement codegoPostal;

    @FindBy(id = "mobile_number")
    private WebElement numero;

    @FindBy(css = "[data-qa='create-account']")
    private WebElement criarConta;

    @FindBy(xpath = "//h2/b")
    private WebElement sucesso;

    @FindBy(css = "[data-qa='continue-button']")
    private WebElement continuar;

    @FindBy(css = "[href='/delete_account']")
    private WebElement excluirconta;

    @FindBy(xpath = "//h2//b")
    private WebElement excluircontamsg;

    public boolean verificoInformacoes() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        return getDriver().findElements(By.xpath("(//h2[@class='title text-center'])[1]")).size() > 0;
    }

    public void preenchotitle(String title) {
        switch (title) {
            case "Mr.":
                clicarbotao(masculino);
                break;
            case "Mrs.":
                clicarbotao(feminino);
                break;
            default:
                System.out.println("Nenhum parametro valido");
        }

    }

    public void preenchoSenha() {
        escrever(senha, "12345678");
    }

    public void preenchoDateOfBirth(String days, String month, String year) {
        Select select = new Select(dias);
        select.selectByVisibleText(days);
        Select select1 = new Select(mes);
        select1.selectByVisibleText(month);
        Select select2 = new Select(anos);
        select2.selectByVisibleText(year);
    }

    public void selecionoSignUpForOurNewsletter() {
        clicarbotao(assine);
    }

    public void selecionoReceiveSpecialOffersFromOurPartners() {
        clicarbotao(promocoes);
    }

    public void preenchoFirstName(String nome) {
        escrever(primeiroNome, nome);
    }

    public void preenchoLastName(String segundonome) {
        escrever(sobrenome, segundonome);
    }

    public void preenchoCompany(String companhia) {
        escrever(company, companhia);
    }

    public void prenchoAddress(String texto) {
        escrever(endereco, texto);
    }

    public void selecionoCountry(String texto) {
        Select select = new Select(pais);
        select.selectByVisibleText(texto);
    }

    public void preenchoState(String texto) {
        escrever(estado, texto);
    }

    public void preenchoCity(String texto) {
        escrever(cidade, texto);
    }

    public void preenchoZipcode(String texto) {
        escrever(codegoPostal, texto);
    }

    public void preenchoMoblieNumber(String number) {
        escrever(numero, number);
    }

    public void clicoEmCreateAccount() {
        focarElemento(criarConta);
        clicarbotao(criarConta);
    }

    public String validoContaCriadaComSucesso() {
        return sucesso.getText().trim();
    }

    public void clicoEmContinuar() {
        clicarbotao(continuar);
    }

    public boolean validoNomeLogadoÉVisivel() {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return getDriver().findElements(By.xpath("//a//b")).size() > 0;
    }

    public void clicoEmExcluirConta() {
        clicarbotao(excluirconta);
    }

    public String validoQueAContaFoiExcluida() {
        return excluircontamsg.getText().trim();
    }

}