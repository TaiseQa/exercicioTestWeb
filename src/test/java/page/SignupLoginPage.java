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

    public void preenchoNomeEEmail(String name, String textoemail) {
        escrever(nome, name);
        escrever(email, textoemail);
    }

    public void clicoEmMeCadastrar() {
        clicarbotao(cadastrar);
    }
}