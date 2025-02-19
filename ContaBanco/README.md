# Bootcamp-Bradesco-Java-Cloud-Native-Conta-Bancaria-sonsole

Trata-se de um "Desafio" bem simples cujo objetivo é colocar em prática os fundamentos da linguagem Java, Noções de Regras de Estrutura de Sintaxe. Com a crescente dos Frameworks, muitas vezes não exercitamos o básico da linguagem, o que para quem está começando não traz muitos benefícios. Conhecer como as coisas acontecem é muito importante, e para isso temos que usar os recursos da linguagem no "braço".

### 🎯 Objetivo : Representar um sistema bancário simples, onde o usuário pode cadastrar um cliente e criar uma conta bancária no terminal.

Composição do Código:<br>
O código é composto por três classes:<br>
Cliente – Representa um cliente do banco, contendo atributos como nome e cpf.<br>
Conta – Representa a conta bancária do cliente, incluindo atributos como número da conta, agência, saldo, tipo de conta e cheque especial.<br>
ContaTerminal – É a classe principal que interage com o usuário via terminal.<br>

### 🛠 Exemplo de execução
✅ Entrada do Usuário (O usuário digita as informações quando solicitado pelo programa).

```terminal
Digite o nome do cliente: João Silva
Digite o CPF do cliente: 123.456.789-00
Digite o email do cliente: joao.silva@email.com
Digite o telefone do cliente: (11) 98765-4321
Digite o número da conta: 12345
Digite o número da agência: 001-9
Digite o tipo da conta: Corrente
Digite o saldo da conta: 1500.75
Possui cheque especial? (Sim/Não): Sim
```
**Saída:** do Programa(O programa exibe os dados coletados).
```terminal
*********** Informações da Conta ***********
Olá João Silva, obrigado por criar uma conta em nosso banco.
CPF: 123.456.789-00
Email: joao.silva@email.com
Telefone: (11) 98765-4321
Agência: 001-9
Tipo de Conta: Corrente
Número da Conta: 12345
Seu saldo de R$ 1500.75 já está disponível para saque.
Cheque Especial: Sim
```
