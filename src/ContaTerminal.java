import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurar o Scanner para aceitar ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        // Consumindo a quebra de linha deixada pelo nextInt
        scanner.nextLine();

        // Solicitando o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando o nome do cliente
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando o saldo da conta
        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                ", conta " + numeroConta +
                " e seu saldo R$ " + saldo + " já está disponível para saque.");

        // Fechando o Scanner
        scanner.close();
    }
}
