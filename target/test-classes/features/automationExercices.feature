#language: pt

@geral
Funcionalidade: criar login com sucesso

  Contexto: entar na pagina
    Dado que acesso o navegador "https://automationexercise.com"
    E verifico que a pagina esta visivel

  @Teste
  Cenario: criar login e excluir login
    Quando clico em me inscrever
    E preencho nome e email "Taise" "automacao@testee.com.br"
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
    Quando clico em me inscrever
    E verifico se texto de login esta visivel "Login to your account"
    E preencho email e senha incorretos "teste@teste.com"
    E clico no botao login
    Entao verifico que o erro com texto "Your email or password is incorrect!"

  @ct02
  Cenario: sair do usuario
    Quando clico em me inscrever
    E verifico se texto de login esta visivel "Login to your account"
    E preencho email e senha corretos "teste@teste.com.br"
    E clico no botao login
    E valido nome logado é visivel
    E clico no botao sair
    Entao verifico que fui reedirecionado pra pagina de login com texto "Login to your account"

  @ct03
  Cenario: registrar usuario com conta existente
    E clico em me inscrever
    E preencho nome e email "teste" "teste@teste.com.br"
    E clico em me cadastrar
    E verifico com texto usuario existente "Email Address already exist!"

  @ct04
  Cenario: formulario de contato
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
    Quando clico em caso de teste
    Entao verifico que fui redirecionado para pagina caso de teste

#  @ct06
  Cenario: verificar produto e detalhes do produto
    Quando clico em produtos
    E verifico texto do produtos "ALL PRODUCTS"
#    E verifico que a lista de produtos e visivel
#    E clico em detalhes do produto
#    E verifico nome do produto "Blue Top"
#    E verifico categoria "Category: Women > Tops"
#    E verifico preco "500"
#    E verifico disponibilidade ""
##    E verifico condicao ""
##    E verifico marca ""

  @ct07
  Cenario: produto de pesquisa
    Quando clico em produtos
    E verifico texto do produtos "ALL PRODUCTS"
    E preencho nome do produto na barra de pesquisa"blue top"
    E clico em pesquisar
    E verifico texto todos os produtos"SEARCHED PRODUCTS"
    Entao verifico produto visivel

  @ct08
  Cenario: vefique assinatura pagina inicial
    E verifico texto assinatura "SUBSCRIPTION"
    E preencho email"teste@teste.com.br"
    E clico no botao assinatura
    Entao valido mensagem de sucesso "You have been successfully subscribed!"

  @ct09
  Cenario: verificar assinatura na pagina de carrinho
    Quando clico em carrinho
    E verifico texto assinatura "SUBSCRIPTION"
    E preencho email"teste@test.com"
    E clico no botao assinatura
    Entao valido mensagem de sucesso "You have been successfully subscribed!"

  @ct10
  Cenario: adicionar produtos no carrinho
    E clico em produtos
    E adiciono item no carrinho
    E clico em continuar comprando
    E adiciono segundo item
    E clico em visualizar carrinho
    E verifico os produtos estao visiveis
    E verifico preco do item "Rs. 500"
    E verifico quantidade do item"1"
    E verifico valor total do item "Rs. 500"
    E verifico preco do item dois"Rs. 400"
    E Verifico quantidade do item dois"1"
    Entao verifico valor total do item dois"Rs. 400"

  @ct11
  Cenario: verificar quantidade no carrinho
    E clico em visualizar detalhes do produto
    E verifico visualicao do detalhes
    E preencho quantidade "4"
    E clico em adicionar produto
    E clico em visualizar carrinho
    Entao verifico a quantidade e "4"

  @ct12
  Cenario:  fazer pedido regristar durante o checkout
    E adiciono item no carrinho
    E clico em visualizar carrinho
    E clico em  checkout
    E clico em fazer registro
    E preencho nome e email "Taise" "automacaoteste@testee.com.br"
    E clico em me cadastrar
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
    E clico em continuar
    E valido nome logado é visivel
    E clico no botao carrinho
    E clico em  checkout
    E verifico dados visivel
    E insiro descricao e clico em fazer pedido "teste"
    E prencho nome do cartao e numero do cartao e cvc e expiracao e ano
      | chave            | valor     |
      | nome do cartao   | teste     |
      | numero do cartao | 123456789 |
      | cvc              | 822       |
      | expiracao        | 05        |
      | ano              | 2020      |
    E clico em submit
    Entao verifique a mensagem visivel "ORDER PLACED!"
    E valido nome logado é visivel
    E clico em excluir conta
    Entao valido que a conta foi excluida "ACCOUNT DELETED!"
    E clico em continuar
