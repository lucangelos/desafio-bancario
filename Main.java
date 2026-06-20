import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String nome = "Lucas Ângelo";
       String tipoDeConta = "Corrente";
       double saldo = 250.00;
       double recebe, transferencia;
       int opc = 0;

       System.out.println("DADOS PESSOAIS\n\nNome: " + nome +
               "\nTipo de Conta: " + tipoDeConta +
               "\nSaldo Bancário: " + saldo + "\n***********************************");

       while(opc != 4) {

           System.out.println("\n\nOperações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair");
           opc = scanner.nextInt();

           switch (opc) {
               case 1:
                   System.out.println("\nO saldo atual é de R$" + saldo);
                   break;

               case 2:
                   System.out.println("\nDigite o valor que irá receber: ");
                   recebe = scanner.nextDouble();
                   saldo += recebe;
                   System.out.println("O saldo atual é de R$" + saldo);
                   break;

               case 3:
                   System.out.println("\nDigite o valor que será transferido: ");
                   transferencia = scanner.nextDouble();
                   saldo -= transferencia;
                   System.out.println("O saldo atual é de R$" + saldo);
                   break;

               case 4:
                   System.out.println("\nSaindo...");
                   break;

               default:
                   System.out.println("\nValor Inválido! Digite outro valor\n");
                   break;
           }
       }
    }
}

