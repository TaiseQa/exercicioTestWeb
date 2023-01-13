package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
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
    public void clicoEmMeCadastrar() {
        signupLoginPage.clicoEmMeCadastrar();
    }

    @E("clico em fazer login")
    public void clicoEmFazerLogin() {
        signupLoginPage.clicoEmFazerLogin();
    }

    @E("verifico se texto de login esta visivel {string}")
    public void verificoSeTextoDeLoginEstaVisivel(String texto) {
        Assert.assertEquals(texto, signupLoginPage.verificoSeTextoDeLoginEstaVisivel());
    }

    @E("preencho email e senha incorretos {string}")
    public void preenchoEmailESenhaIncorretos(String texto) {
        signupLoginPage.preenchoEmailESenhaIncorretos(texto);
    }

    @E("clico no botao login")
    public void clicoNoBotaoLogin() {
        signupLoginPage.clicoNoBotaoLogin();
    }

    @Entao("verifico que o erro com texto {string}")
    public void verificoQueOErroComTexto(String texto) {
        Assert.assertEquals(texto, signupLoginPage.verificoQueOErroComTexto());
    }

    @E("preencho email e senha corretos {string}")
    public void preenchoEmailESenhaCorretos(String texto) {
        signupLoginPage.preenchoEmailESenhaCorretos(texto);
    }

    @E("clico no botao sair")
    public void clicoNoBotaoSair() {
        signupLoginPage.clicoNoBotaoSair();
    }

    @Entao("verifico que fui reedirecionado pra pagina de login com texto {string}")
    public void verificoQueFuiReedirecionadoPraPaginaDeLoginComTexto(String texto) {
        Assert.assertEquals(texto, signupLoginPage.verificoQueFuiReedirecionadoPraPaginaDeLogin());
    }

    @Entao("verifico com texto usuario existente {string}")
    public void verificoComTextoUsuarioExistente(String texto) {
        Assert.assertEquals(texto, signupLoginPage.verificoComTextoUsuarioExistente());
    }
    @E("preencho nome e email correto {string} {string}")
    public void preenchoNomeEEmailCorreto(String nome, String email) {
        signupLoginPage.preenchoNomeEEmailCorreto(nome,email);
    }

}
