// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Multiplos {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        if (number_2 % number_1 == 0 || number_1 % number_2 == 0) {
            System.out.println ("Sao Multiplos");
        }
        else {
            System.out.println ("Nao sao Multiplos");
        }
        // ser multiplo é você pegar 6 e 24 pegar 24 dividir por 6 se o resto dê zero é porque são multiplos
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        if (number_2 % number_1 == 0 || number_1 % number_2 == 0) {
            System.out.println ("Sao Multiplos");
        }
        else {
            System.out.println ("Nao sao Multiplos");
        }
    }
}