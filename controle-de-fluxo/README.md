# Bootcamp-Bradesco-Java-Cloud-Native- Controle de Fluxo - Desafio

🎯 Objetivo:
✔ Pede dois números ao usuário.<br>
✔ Verifica se o segundo número é maior que o primeiro.<br>
✔ Imprime uma contagem, caso a entrada seja válida.<br>
✔ Exibe uma mensagem de erro, caso os valores sejam inválidos.

<br>

## 🛠 Exemplo de execução

✅ Entrada válida:

```terminal
Digite o primeiro parâmetro
2
Digite o segundo parâmetro
5
```
**Saída:**
```terminal
Imprimindo número 1
Imprimindo número 2
Imprimindo número 3
```

### ❌ Entrada inválida:
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, será lançada uma exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro".

```
Digite o primeiro parâmetro
7
Digite o segundo parâmetro
3
```

**Saída:**
```terminal
O segundo parâmetro deve ser maior que o primeiro
```

