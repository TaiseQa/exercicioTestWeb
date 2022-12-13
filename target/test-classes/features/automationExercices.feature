#language: pt

Funcionalidade: criar login com sucesso


  @Teste
  Cenario: criar login e excluir login
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em me inscrever
    E preencho nome e email "Taise" "teste@teste.com.br"
    E clico em me cadastrar
    E verifco que as informacoes das contas sao visiveis
    E preencho title "Mrs."
    E preencho senha
    E preencho date of birth "12" "November" "2020"
    E seleciono Sign up for our newsletter!
    E seleciono Receive special offers from our partners!
    E preencho first name "Taise"
    E preencho last name "Almeida"
    E preencho company "Teste"
    E prencho address "rua dos lagos"
    E seleciono country "India"
    E preencho state "india"
    E preencho city "india"
    E preencho zipcode "026798000"
    E preencho moblie number "1198969585"
    E clico em create account
    Entao valido conta criada com sucesso "ACCOUNT CREATED!"
    E clico em continuar
    E valido nome logado é visivel
    E clico em excluir conta
    Entao valido que a conta foi excluida "ACCOUNT DELETED!"
   E clico em continuar


