
import java.util.Scanner;

public class DesafioSintaxe {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o número:\n");
            int a = scanner.nextInt();

            System.out.println("Digite seu nome:\n");
            String b = scanner.next();

            System.out.println("Digite o número da agência:\n");
            String c = scanner.next();

            System.out.println("Digite o saldo na conta:\n");
            double d = scanner.nextDouble();

            System.out.println("Olá " + b + ", obrigado por criar uma conta em nosso banco," +
                    " " +
                    "sua agência é " + c + ", sua conta " + a + " e seu saldo é " + d + " já está disponível para saque");
        }
}
