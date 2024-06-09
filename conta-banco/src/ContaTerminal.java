import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            // Exibir mensagens ao usuário
            System.out.println("Por gentileza, me diga seu nome completo:");
            String nome = scanner.nextLine();  // Agora lê o nome completo

            System.out.println("Por favor, digite o número da sua agência:");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua conta:");
            int conta = scanner.nextInt();

            System.out.println("Por gentileza digite o seu saldo:");
            double saldo = scanner.nextDouble();

            // Exibir a mensagem conta criada
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n", nome, agencia, conta, saldo);
        } finally {
            scanner.close();  // Garante que o scanner é fechado
        }
    }
}