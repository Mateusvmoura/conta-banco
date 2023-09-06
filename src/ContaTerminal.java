import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando dados de número de agência
        System.out.println("Por Favor, digite o número da agência ! ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine();

        // Solicitando dados de número de conta 
        System.out.println("Por favor, digite número da conta !");
        String numeroConta = scanner.nextLine();

        // Solicitando dados de nome completo
        System.out.println("Por favor, digite seu nome completo !");
        String nomeCompleto = scanner.nextLine();

        // Solicitando dados de nome completo
        System.out.println("Por favor, digite seu saldo !");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com informações inseridas 
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        // Fechando o Scanner 
        scanner.close();
    }
}