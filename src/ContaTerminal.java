import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar a conta e exibir os dados
        ContaBancaria.criarConta(scanner);

        // Simular um saque
        Saque.saque(scanner);

        // Fechar o scanner
        scanner.close();
    }
}