// IntelliJ:
// Sintaxe das condicionais semelhante ao JavaScript
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class TestedeSelecao {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_A = scanner.nextInt();
        int valor_B = scanner.nextInt();
        int valor_C = scanner.nextInt();
        int valor_D = scanner.nextInt();
        if (valor_B > valor_C && valor_D > valor_A && valor_C + valor_D > valor_A + valor_B && valor_C > 0 && valor_D > 0 && valor_A % 2 == 0) {
            System.out.println ("Valores aceitos");
        }
        else {
            System.out.println ("Valores nao aceitos");
        }
        scanner.close();
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_A = scanner.nextInt();
        int valor_B = scanner.nextInt();
        int valor_C = scanner.nextInt();
        int valor_D = scanner.nextInt();
        if (valor_B > valor_C && valor_D > valor_A && valor_C + valor_D > valor_A + valor_B && valor_C > 0 && valor_D > 0 && valor_A % 2 == 0) {
            System.out.println ("Valores aceitos");
        }
        else {
            System.out.println ("Valores nao aceitos");
        }
        scanner.close();
    }
}