# Apresentação
No link a seguir, segue meu site com breve apresentação e contatos.

https://edicarlos.dev.br/
# O Projeto - githubusers
Aplicativo que consome a api do gitHub de usuários com 3 endpoints.

- https://api.github.com/users -> Lista de usuários
- https://api.github.com/users/{usuario} -> Obtém informações do usuário
- https://api.github.com/users/{usuario}/repos -> Lista dos repositórios do usuário

Foi construido focado para demonstrar conhecimentos em arquitetura e usos de tecnologias na plataforma Android nativo.

Em resumo, a idéia do **APP**, foi consumir 3 endpoints (simulando um BackEnd) da API.

# Como rodar
- Apenas clone o projeto, e sync o gradle via Android Studio.
- Talvez seja necessario informar o caminho da JDK no arquivo local.properties

Não deverá ter problemas.
# Arquitetura e Tecnologias
A estrutura está **bem sólida**, e a arquitetura está bem definida.

Seguindo com:
- **Clean Architecture, Conceitos de SOLID**
- **MVVM, Live Data**
- **Kotlin como linguagem de programação**
- **Retrofit para trabalhar com a API**
- **Koin para DI**
- **Glide para carregamento de imagens**
- **Mockito para testes automatizados**
- **RxJava para eventos assincronos**
- **ViewBinding para apoio com a UI**

Outros detalhes podem ser _conferidos nos arquivos do projeto._
# Melhorias
- Essa aplicação, teve uma deadline de 3 dias, e _precisa-se de melhorias visuais.
- O código também precisa de otimizações, como por exemplo **_remoção de codigo morto._**. Onde poderá ser feito futuramente.
- Também é necessário, para otimizar, criar um arquivo **dependences** e alinhar todos os .gradle que implementam as libs

Também acrescento que, **considero ferramentas, que posso usar a qualquer momento**, pode ser usado o jetpack compose, Flow e as coroutines mas devido a **deadline** segui com as quais 
consigo entregar dentro do tempo definido.

# Preview do APP rodando

Testes unitários foram criados para a camada de Network e Domain. Elas englobam:
- Remote data
- Repository
- Use Cases

Para executar os testes basta abrir o arquivo pelo android studio e apertar na flecha verde do inicio da classe de teste

# Preview do APP rodando


# Licensa
O código pode ser usado livremente, **isentando o autor** de qualquer responsabilidade de seu uso.
