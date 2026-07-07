// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Diferenca {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_A = scanner.nextInt();
        int valor_B = scanner.nextInt();
        int valor_C = scanner.nextInt();
        int valor_D = scanner.nextInt();
        final int DIFERENCA = ((valor_A*valor_B) - (valor_C*valor_D));
        System.out.println ("DIFERENCA = " + DIFERENCA);
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
        final int DIFERENCA = ((valor_A*valor_B) - (valor_C*valor_D));
        System.out.println ("DIFERENCA = " + DIFERENCA);
    }
}