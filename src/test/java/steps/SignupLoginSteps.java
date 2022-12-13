package steps;

import io.cucumber.java.pt.E;
import page.SignupLoginPage;

public class SignupLoginSteps {
    SignupLoginPage signupLoginPage;

    public SignupLoginSteps(SignupLoginPage signupLoginPage) {
        this.signupLoginPage = signupLoginPage;
    }

    @E("preencho nome e email {string} {string}")
    public void preenchoNomeEEmail(String nome, String email) {
        signupLoginPage.preenchoNomeEEmail(nome, email);

    }

    @E("clico em me cadastrar")
    public void clicoEmMeCadastrar(){
        signupLoginPage.clicoEmMeCadastrar();

    }
}
