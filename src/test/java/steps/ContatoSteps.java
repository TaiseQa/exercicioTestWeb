package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.ContatoPage;

public class ContatoSteps  {
    ContatoPage contatoPage;
    public ContatoSteps( ContatoPage contatoPage){
        this.contatoPage = contatoPage;
    }
    @Quando ("clico no botao fale conosco")
        public void clicoNoBotaoFaleCOnosco(){
        contatoPage.clicoNoBotaoFaleCOnosco();

    }

    @E("verifico que o testo no contato esta visivel {string}")
    public void verificoQueOTestoNoContatoEstaVisivel(String texto) {
        Assert.assertEquals(texto,contatoPage.verificoQueOTestoNoContatoEstaVisivel());
    }

    @E("preencho nome e email e assunto e mensagem")
    public void preenchoNomeEEmailEAssuntoEMensagem(DataTable dataTable) {
        contatoPage.preenchoNomeEEmailEAssuntoEMensagem(dataTable);

    }

    @E("clico em subir arquivo")
    public void clicoEmSubirArquivo() {
     contatoPage.clicoEmSubirArquivo();
    }

    @E("clico em enviar")
    public void clicoEmEnviar() {
        contatoPage.clicoEmEnviar();
    }

    @E("clico em Ok")
    public void clicoEmOk() {
        contatoPage.clicoEmOk();
    }

    @E("valido mensagem de sucesso visivel {string}")
    public void validoMensagemDeSucessoVisivel(String texto) {
        Assert.assertEquals(texto,contatoPage.validoMensagemDeSucessoVisivel());
    }

    @Entao("valido que fui redirecionado para pagina inicial")
    public void validoQueFuiRedirecionadoParaPaginaInicial() {
        Assert.assertEquals("https://automationexercise.com/",contatoPage.validoQueFuiRedirecionadoParaPaginaInicial());
    }


}
