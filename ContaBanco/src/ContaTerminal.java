
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) throws Exception{
      //TODO: Conhecer e importar a classe Scanner
      Scanner scanner = new Scanner(System.in);

      //TODO: Exibir as mensagens para nosso usuário
      System.out.println("Digite o número  de sua Agência:");
      String agencia = scanner.nextLine();

      System.out.println("Digite o número da sua conta:");
      int numero = scanner.nextInt();
      scanner.nextLine();//Consumir a linha restante

      System.out.println("Digite o nome do Cliente:");
      String nomeCliente = scanner.nextLine();

      System.out.println("Digite o saldo:");
      double saldo = scanner.nextDouble();

      String mensagem = String.format("Olá %s, Obrigada por criar uma conta em nosso banco, sua agência é %s, conta %d e seu  saldo %.2f já está disponivél para saque.", nomeCliente, agencia, numero, saldo);

      System.out.println(mensagem);

      scanner.close();

      //Obter pela scanner os valores digitados no terminal
}

}