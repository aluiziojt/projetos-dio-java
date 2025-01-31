import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // usando a classe Scanner que o professor ensinou
        Scanner scanner = new Scanner(System.in);

        // pede o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // pede e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // pede saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        // Exibe a mensagem final que foi pedida no projeto
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}