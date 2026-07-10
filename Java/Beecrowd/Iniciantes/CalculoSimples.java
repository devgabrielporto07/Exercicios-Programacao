// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
// o scanner não se importa com linhas de lado apenas siga o codigo respectivamente
// não é necessário usar o map mapear as variáveis
public class CalculoSimples {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int cod_Peca1 = scanner.nextInt();
        int number_Peca1 = scanner.nextInt();
        double valor_Peca1 = scanner.nextDouble();
        int cod_Peca2 = scanner.nextInt();
        int number_Peca2 = scanner.nextInt();
        double valor_Peca2 = scanner.nextDouble();
        final double valor_Pagarpeca1 = number_Peca1*valor_Peca1;
        final double valor_Pagarpeca2 = number_Peca2*valor_Peca2;
        double soma_Pagamento = valor_Pagarpeca1 + valor_Pagarpeca2;
        System.out.printf ("VALOR A PAGAR: R$ %.2f\n", soma_Pagamento);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int cod_Peca1 = scanner.nextInt();
        int number_Peca1 = scanner.nextInt();
        double valor_Peca1 = scanner.nextDouble();
        int cod_Peca2 = scanner.nextInt();
        int number_Peca2 = scanner.nextInt();
        double valor_Peca2 = scanner.nextDouble();
        final double valor_Pagarpeca1 = number_Peca1*valor_Peca1;
        final double valor_Pagarpeca2 = number_Peca2*valor_Peca2;
        double soma_Pagamento = valor_Pagarpeca1 + valor_Pagarpeca2;
        System.out.printf ("VALOR A PAGAR: R$ %.2f\n", soma_Pagamento);
    }
}