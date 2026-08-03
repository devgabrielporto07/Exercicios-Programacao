// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class CoordenadasDeUmPonto {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_X = scanner.nextDouble();
        double valor_Y = scanner.nextDouble();
        if (valor_X == 0.0 && valor_Y == 0.0) {
            System.out.println ("Origem");
        }
        else if (valor_X > 0 && valor_Y > 0) {
            System.out.println ("Q1");
        }
        else if (valor_X < 0 && valor_Y > 0) {
            System.out.println ("Q2");
        }
        else if (valor_X < 0 && valor_Y < 0) {
            System.out.println ("Q3");
        }
        else if (valor_X > 0 && valor_Y < 0) {
            System.out.println ("Q4");
        }
        else if (valor_X != 0 && valor_Y == 0) {
            System.out.println ("Eixo X");
        }
        else if (valor_X == 0 && valor_Y != 0) {
            System.out.println ("Eixo Y");
        }
        scanner.close();
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_X = scanner.nextDouble();
        double valor_Y = scanner.nextDouble();
        if (valor_X == 0.0 && valor_Y == 0.0) {
            System.out.println ("Origem");
        }
        else if (valor_X > 0 && valor_Y > 0) {
            System.out.println ("Q1");
        }
        else if (valor_X < 0 && valor_Y > 0) {
            System.out.println ("Q2");
        }
        else if (valor_X < 0 && valor_Y < 0) {
            System.out.println ("Q3");
        }
        else if (valor_X > 0 && valor_Y < 0) {
            System.out.println ("Q4");
        }
        else if (valor_X != 0 && valor_Y == 0) {
            System.out.println ("Eixo X");
        }
        else if (valor_X == 0 && valor_Y != 0) {
            System.out.println ("Eixo Y");
        }
        scanner.close();
    }
}