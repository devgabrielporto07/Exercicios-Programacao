// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Media2 {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
//        Clean Code
        final int peso_A = 2;
        final int peso_B = 3;
        final int peso_C = 5;
        final int soma_PesoABC = peso_A + peso_B + peso_C;
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        double media_ValoresABC = ((valor_A*peso_A) + (valor_B*peso_B) + (valor_C*peso_C)) / (soma_PesoABC);
        System.out.printf ("MEDIA = %.1f\n", media_ValoresABC);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final int peso_A = 2; 
        final int peso_B = 3;
        final int peso_C = 5;
        final int soma_PesoABC = peso_A + peso_B + peso_C;
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        double media_ValoresABC = ((valor_A*peso_A) + (valor_B*peso_B) + (valor_C*peso_C)) / (soma_PesoABC);
        System.out.printf ("MEDIA = %.1f\n", media_ValoresABC);
    }
}