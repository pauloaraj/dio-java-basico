import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();      
       
        System.out.println("Digite sua agência");        
        String agencia = scanner.next();

        System.out.println("Digite sua conta ");       
        int conta = scanner.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo =scanner.nextDouble();

        
        System.out.println("Olá " + nome +" "+ sobrenome +", obrigado por abrir sua conta conosco, sua agência é " + agencia + " e a sua conta é " +conta+ " o seu saudo de R$" +saldo+ " já está disponivel para saque");

        
    }
}
