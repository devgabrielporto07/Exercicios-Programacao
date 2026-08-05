// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Triangulo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        final double PERIMETRO = valor_A + valor_B + valor_C;
        final double TRAPEZIO = ((valor_A + valor_B)*valor_C) / 2;
        if (valor_A + valor_B > valor_C && valor_B + valor_C > valor_A && valor_C + valor_A > valor_B) {
            System.out.printf ("Perimetro = %.1f\n", PERIMETRO);
        }
        else {
            System.out.printf ("Area = %.1f\n", TRAPEZIO);
        }
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        final double PERIMETRO = valor_A + valor_B + valor_C;
        final double TRAPEZIO = ((valor_A + valor_B)*valor_C) / 2;
        if (valor_A + valor_B > valor_C && valor_B + valor_C > valor_A && valor_C + valor_A > valor_B) {
            System.out.printf ("Perimetro = %.1f\n", PERIMETRO);
        }
        else {
            System.out.printf ("Area = %.1f\n", TRAPEZIO);
        }
    }
}