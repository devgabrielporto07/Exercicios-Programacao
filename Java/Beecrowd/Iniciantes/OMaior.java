// IntelliJ:
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class OMaior {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int valor_A = scanner.nextInt();
        int valor_B = scanner.nextInt();
        int valor_C = scanner.nextInt();
        int maior_AB = (valor_A + valor_B + Math.abs(valor_A - valor_B)) / 2;
        int maior_ABC = (maior_AB + valor_C + Math.abs(maior_AB - valor_C)) / 2;
        System.out.print (maior_ABC);
        System.out.println (" eh o maior");
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
        int maior_AB = (valor_A + valor_B + Math.abs(valor_A - valor_B)) / 2;
        int maior_ABC = (maior_AB + valor_C + Math.abs(maior_AB - valor_C)) / 2;
        System.out.print (maior_ABC);
        System.out.println (" eh o maior");
        scanner.close();
    }
}