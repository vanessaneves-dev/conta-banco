import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String cliente = scanner.nextLine();

        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da conta:");
        String numero = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        String saldoFormatado = df.format(saldo);

        System.out
                .println("Olá " + cliente + ", ficamos felizes por te-lô(a) conosco, segue seus dados: \n" +
                        "Agência: " + agencia + "\n" +
                        "Conta: " + numero + "\n" +
                        "Saldo Atual: R$ " + saldoFormatado);
    }
}
