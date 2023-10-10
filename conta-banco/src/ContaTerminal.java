import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Porfavor digite sua conta ");       
        int conta = scanner.nextInt();
          
        System.out.println("agora digite sua agência");        
        String agencia = scanner.next();
  
        System.out.println("Informe o seu nome");
        String nome = scanner.next();        

        System.out.println("Digite o seu saldo");
        double saldo =scanner.nextDouble();

        
        System.out.println("Olá " + nome + ", obrigado por abrir sua conta conosco, sua agência é " + agencia + " conta " +conta+ " o seu saudo de R$" +saldo+ " já está disponivel para saque");

        
    }
}
