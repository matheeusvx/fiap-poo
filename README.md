# 🚗 FiapRide - Sistema de Passageiros

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** da FIAP.

O sistema simula o gerenciamento de passageiros de um aplicativo de transporte fictício chamado **FiapRide**, permitindo cadastrar passageiros, adicionar saldo e realizar pagamento de viagens.

---

# 📚 Conceitos de POO aplicados

Este projeto utiliza conceitos fundamentais de **Programação Orientada a Objetos em Java**:

* Classes e Objetos
* Encapsulamento
* Construtores
* Métodos
* Getters e Setters
* Controle de acesso (`private` e `public`)
* Regras de negócio dentro da classe

---

# 🧱 Estrutura do Projeto

fiap-poo
│
├── src
│   └── br
│       └── com
│           └── fiapride
│               ├── main
│               │   └── SistemaPrincipal.java
│               │
│               └── model
│                   └── Passageiro.java
│
└── README.md

---

# 👤 Classe Passageiro

A classe **Passageiro** representa um usuário do sistema FiapRide.

### Atributos

nome (String)
Nome do passageiro.

cpf (String)
CPF do passageiro.

saldo (double)
Saldo disponível para pagamento de viagens.

Todos os atributos são **privados**, garantindo o **encapsulamento dos dados**.

---

# ⚙️ Métodos da Classe

### Construtor

public Passageiro(String nome, String cpf)

Responsável por criar um passageiro já com:

* Nome
* CPF
* Saldo inicial igual a 0

---

### Adicionar saldo

Método responsável por permitir que o passageiro adicione crédito ao sistema.

Regra de negócio:

* O valor precisa ser maior que zero.

Se o valor for válido, o saldo do passageiro é incrementado.

---

### Pagar viagem

Método responsável por descontar o valor da viagem do saldo do passageiro.

Regra de negócio:

* A viagem só pode ser paga se o saldo disponível for suficiente.

Caso contrário, o sistema informa que o saldo é insuficiente.

---

### Getters

Os getters permitem acessar os dados do passageiro de forma segura.

Métodos disponíveis:

getNome()
Retorna o nome do passageiro.

getCpf()
Retorna o CPF do passageiro.

getSaldo()
Retorna o saldo atual do passageiro.

---

# 🖥️ Classe SistemaPrincipal

A classe **SistemaPrincipal** contém o método **main**, responsável por executar o programa.

Ela realiza as seguintes operações:

1. Cria passageiros no sistema
2. Adiciona saldo para cada passageiro
3. Exibe informações dos passageiros
4. Simula pagamento de viagens
5. Valida se o passageiro possui saldo suficiente

---

# ▶️ Exemplo de Execução do Sistema

--- Iniciando o Sistema FiapRide ---

> > > Recarga Passageiro 1:
> > > Saldo adicionado com sucesso!

> > > Recarga Passageiro 2:
> > > Saldo adicionado com sucesso!

--- Status dos Passageiros ---

Passageiro: Ana Silva | Saldo: R$ 50.0 | CPF: 222.222.222-22
Passageiro: Carlos Souza | Saldo: R$ 12.5 | CPF: 333.333.333-33

--- Realizando Viagens ---

Pagando viagem do passageiro 1 (Ana)...
Viagem paga com sucesso!

Pagando viagem do passageiro 2 (Carlos)...
Saldo insuficiente!

---

# 🛠️ Tecnologias Utilizadas

Java
Programação Orientada a Objetos
Git
GitHub
IntelliJ IDEA

---

# 🎓 Objetivo Acadêmico

Este projeto tem como objetivo praticar os seguintes conceitos:

* Estruturação de classes em Java
* Encapsulamento de atributos
* Implementação de regras de negócio dentro da classe
* Organização de pacotes em projetos Java
* Uso de construtores e métodos

---

# 👨‍💻 Autor

Projeto desenvolvido por **Matheus**
Aluno da **FIAP**

---

# 📌 Possíveis Melhorias Futuras

Algumas melhorias que podem ser implementadas no sistema:

* Criar classe **Motorista**
* Criar classe **Viagem**
* Implementar sistema de avaliação de corridas
* Criar interface gráfica para o sistema
* Integrar banco de dados para armazenamento de passageiros

---

# 📄 Licença

Este projeto foi desenvolvido apenas para **fins educacionais**.
