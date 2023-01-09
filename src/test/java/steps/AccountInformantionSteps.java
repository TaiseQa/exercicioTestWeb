package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import page.AccountInformantionPage;

public class AccountInformantionSteps {
    AccountInformantionPage accountInformantionPage;

    public AccountInformantionSteps(AccountInformantionPage accountInformantionPage) {
        this.accountInformantionPage = accountInformantionPage;
    }

    @E("verifco que as informacoes das contas sao visiveis")
    public void verificoInformacoes() {
        Assert.assertTrue(accountInformantionPage.verificoInformacoes());
    }

    @E("preencho title {string}")
    public void preenchotitle(String texto) {
        accountInformantionPage.preenchotitle(texto);
    }

    @E("preencho senha")
    public void preenchoSenha() {
        accountInformantionPage.preenchoSenha();
    }

    @E("preencho date of birth {string} {string} {string}")
    public void preenchoDateOfBirth(String days, String month, String year) {
        accountInformantionPage.preenchoDateOfBirth(days, month, year);
    }


    @E("seleciono Sign up for our newsletter!")
    public void selecionoSignUpForOurNewsletter() {
        accountInformantionPage.selecionoSignUpForOurNewsletter();
    }

    @E("seleciono Receive special offers from our partners!")
    public void selecionoReceiveSpecialOffersFromOurPartners() {
        accountInformantionPage.selecionoReceiveSpecialOffersFromOurPartners();
    }

    @E("preencho first name {string}")
    public void preenchoFirstName(String nome) {
        accountInformantionPage.preenchoFirstName(nome);
    }

    @E("preencho last name {string}")
    public void preenchoLastName(String sobrenome) {
        accountInformantionPage.preenchoLastName(sobrenome);
    }

    @E("preencho company {string}")
    public void preenchoCompany(String companhia) {
        accountInformantionPage.preenchoCompany(companhia);
    }

    @E("prencho address {string}")
    public void prenchoAddress(String texto) {
        accountInformantionPage.prenchoAddress(texto);
    }

    @E("seleciono country {string}")
    public void selecionoCountry(String texto) {
        accountInformantionPage.selecionoCountry(texto);
    }

    @E("preencho state {string}")
    public void preenchoState(String texto) {
        accountInformantionPage.preenchoState(texto);
    }

    @E("preencho city {string}")
    public void preenchoCity(String texto) {
        accountInformantionPage.preenchoCity(texto);
    }

    @E("preencho zipcode {string}")
    public void preenchoZipcode(String texto) {
        accountInformantionPage.preenchoZipcode(texto);
    }

    @E("preencho moblie number {string}")
    public void preenchoMoblieNumber(String number) {
        accountInformantionPage.preenchoMoblieNumber(number);
    }

    @E("clico em create account")
    public void clicoEmCreateAccount() {
        accountInformantionPage.clicoEmCreateAccount();
    }

    @Entao("valido conta criada com sucesso {string}")
    public void validoContaCriadaComSucesso(String sucesso) {
        Assert.assertEquals(sucesso,accountInformantionPage.validoContaCriadaComSucesso());
    }

    @E("clico em continuar")
    public void clicoEmContinuar() {
        accountInformantionPage.clicoEmContinuar();

    }

    @E("valido nome logado é visivel")
    public void validoNomeLogadoÉVisivel() {
        accountInformantionPage.validoNomeLogadoÉVisivel();
    }

    @E("clico em excluir conta")
    public void clicoEmExcluirConta() {
        accountInformantionPage.clicoEmExcluirConta();
    }

    @Entao("valido que a conta foi excluida {string}")
    public void validoQueAContaFoiExcluida(String excluida) {
        Assert.assertEquals(excluida, accountInformantionPage.validoQueAContaFoiExcluida());
        accountInformantionPage.clicoEmContinuar();
    }



}
