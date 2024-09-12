import java.util.Scanner;

public class ContaBancaria {

    private static double saldo;

    public static void criarConta(Scanner scanner) {

        System.out.println("Bem-vindo ao nosso Banco!\n");

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo Inicial: R$");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +
                "! Obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero +
                " e seu saldo R$" + String.format("%.2f", saldo) +
                " já está disponível para saque.\n");
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }
}
