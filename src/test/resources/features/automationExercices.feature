#language: pt

@geral
Funcionalidade: criar login com sucesso


  @Teste
  Cenario: criar login e excluir login
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em me inscrever
    E preencho nome e email "Taise" "automacao@teste.com.br"
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


  @ct01

  Cenario: login incorreto
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em me inscrever
    E verifico se texto de login esta visivel "Login to your account"
    E preencho email e senha incorretos "teste@teste.com"
    E clico no botao login
    Entao verifico que o erro com texto "Your email or password is incorrect!"

  @ct02
  Cenario: sair do usuario
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em me inscrever
    E verifico se texto de login esta visivel "Login to your account"
    E preencho email e senha corretos "teste@teste.com.br"
    E clico no botao login
    E valido nome logado é visivel
    E clico no botao sair
    Entao verifico que fui reedirecionado pra pagina de login com texto "Login to your account"

  @ct03
  Cenario: registrar usuario com conta existente
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    E clico em me inscrever
    E preencho nome e email "teste" "teste@teste.com.br"
    E clico em me cadastrar
    E verifico com texto usuario existente "Email Address already exist!"

  @ct04
  Cenario: formulario de contato
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico no botao fale conosco
    E verifico que o testo no contato esta visivel "GET IN TOUCH"
    E preencho nome e email e assunto e mensagem
      | chave    | valor          |
      | nome     | taise          |
      | email    | teste@tste.com |
      | assunto  | teste          |
      | mensagem | tESTE          |
    E clico em subir arquivo
    E clico em enviar
    E clico em Ok
    E valido mensagem de sucesso visivel "Success! Your details have been submitted successfully."
    Entao valido que fui redirecionado para pagina inicial

  @ct05
  Cenario: validar casos de teste
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em caso de teste
    Entao verifico que fui redirecionado para pagina caso de teste

  @ct06
  Cenario: verificar produto e detalhes do produto
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel
    Quando clico em produtos
    E verifico texto do produtos "ALL PRODUCTS"
    E verifico que a lista de produtos e visivel
    E clico em detalhes do produto
    E verifico nome do produto "Blue Top"
#    E verifico categoria ""
#    E verifico preco ""
#    E verifico disponibilidade ""
#    E verifico condicao ""
#    E verifico marca ""

