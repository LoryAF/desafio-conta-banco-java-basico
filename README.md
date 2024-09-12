# Desafio de Programação Java - Conta Bancária (DIO - Trilha Java Básico)

## Descrição do Desafio
Este projeto foi desenvolvido para cumprir os desafios propostos do curso do [DIO - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/sintaxe/README.md) e o [Exercício operadores](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/exercicios/banco-terminal/README.md). O objetivo era exercitar os conceitos aprendidos.

### Desafio: 

- Criação de um programa que simulasse uma conta bancária simples.
- Utilização da classe `Scanner` para receber dados do usuário via terminal (número da conta, agência, nome do cliente e saldo inicial).
- Impressão de uma mensagem personalizada com os dados da conta utilizando concatenação de strings.

### Exercício Operadores:

- Implementação de uma funcionalidade de saque na conta bancária.
- Verificação do saldo para autorizar ou negar a operação de saque.
- Impressão de mensagens informativas sobre o resultado da operação.

## Implementação
Em vez de criar dois programas separados como sugerido nos desafios, optei por desenvolver uma solução mais completa e organizada, utilizando múltiplas classes e um menu interativo.

### Estrutura do Projeto:

- **ContaTerminal.java:** Contém o método `main` e serve como ponto de entrada da aplicação.
- **ContaBancaria.java:** Representa uma conta bancária, armazena seus dados e fornece métodos para manipulação do saldo.
- **Saque.java:** Responsável por realizar a operação de saque, interagindo com o usuário e atualizando o saldo da conta.

### Funcionalidades:

1. **Criar Conta:** Coleta os dados da conta (número, agência, nome do cliente e saldo inicial) via terminal e instancia um objeto `ContaBancaria`.
2. **Realizar Saque:**
- Solicita ao usuário o valor que deseja sacar.
- Verifica se o saldo é suficiente.
- Se o saldo for suficiente, realiza o saque e atualiza o saldo da conta.
- Exibe mensagens informativas ao usuário sobre o resultado da operação.

