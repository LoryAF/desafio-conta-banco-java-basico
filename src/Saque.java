import java.util.Scanner;

public class Saque {

    public static void saque(Scanner scanner) {

        System.out.println("Você gostaria de realizar um saque? (s/n)");
        String resposta = scanner.next().toLowerCase();

        if (resposta.equals("s")){
            double saldo = ContaBancaria.getSaldo();

            System.out.println("Por favor, digite o valor que deseja sacar: R$");
            double valorSolicitado = scanner.nextDouble();

            if (saldo >= valorSolicitado){
                saldo -= valorSolicitado;
                ContaBancaria.setSaldo(saldo);
                System.out.println("Saque realizado com sucesso. Saldo atual: R$" + String.format("%.2f", saldo));
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Obrigado e volte Sempre!");
        }
    }
}
