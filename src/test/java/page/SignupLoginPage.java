package page;

import interacaoWeb.InteracaoWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPage extends InteracaoWeb {

    @FindBy(css = "[name='name']")
    private WebElement nome;

    @FindBy(css = "[data-qa='signup-email']")
    private WebElement email;

    @FindBy(css = "[data-qa='signup-button']")
    private WebElement cadastrar;

    @FindBy(css = "[data-qa='login-button']")
    private WebElement login;

    @FindBy(xpath = "(//div/h2)[1]")
    private WebElement textoDeLOginVisivel;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    private WebElement  emailLogin;

    @FindBy(css = "[data-qa='login-password']")
    private WebElement senha;

    @FindBy(css = "[data-qa='login-button']")
    private WebElement botaoLogin;

    @FindBy(xpath = "(//form/p)[1]")
    private WebElement textoErro;

    @FindBy(css = "[href='/logout']")
    private WebElement botaoSair;

    @FindBy(xpath = "(//form/p)[1]")
    private WebElement emailExixtente;

    @FindBy(css="[data-qa='login-email']")
    private WebElement getEmailLogin;

    @FindBy(css="[data-qa='login-password']")
    private WebElement senhaLogin;



    public void preenchoNomeEEmail(String name, String textoemail) {
        escrever(nome, name);
        escrever(email, getSaltString());
    }

    public void clicoEmMeCadastrar() {
        clicarbotao(cadastrar);
    }

    public String verificoSeTextoDeLoginEstaVisivel() {
        return textoDeLOginVisivel.getText().trim();
    }

    public void preenchoEmailESenhaIncorretos(String texto) {
        escrever(emailLogin, texto);
        escrever(senha, "12345678");
    }

    public void clicoNoBotaoLogin() {
        clicarbotao(botaoLogin);
    }

    public String verificoQueOErroComTexto() {
        return textoErro.getText().trim();
    }

    public void preenchoEmailESenhaCorretos(String texto) {
        escrever(emailLogin, texto);
        escrever(senha, "12345678");
    }

    public void clicoNoBotaoSair() {
        clicarbotao(botaoSair);
    }

    public String verificoQueFuiReedirecionadoPraPaginaDeLogin() {
        return textoDeLOginVisivel.getText().trim();
    }

    public String verificoComTextoUsuarioExistente() {
        return emailExixtente.getText().trim();
    }

    public void clicoEmFazerLogin() {
        clicarbotao(login);
    }
    public void preenchoNomeEEmailCorreto(String name, String emailCadastro) {
        escrever(nome,name);
        escrever(email,emailCadastro);
    }
}