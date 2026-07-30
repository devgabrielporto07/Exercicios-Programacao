// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Intervalo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_Qualquer = scanner.nextDouble();
        if (valor_Qualquer >= 0 && valor_Qualquer <= 25) {
            System.out.println ("Intervalo [0,25]");
        }
        else if (valor_Qualquer > 25 && valor_Qualquer <= 50) {
            System.out.println ("Intervalo (25,50]");
        }
        else if (valor_Qualquer > 50 && valor_Qualquer <= 75) {
            System.out.println ("Intervalo (50,75]");
        }
        else if (valor_Qualquer > 75 && valor_Qualquer <= 100) {
            System.out.println ("Intervalo (75,100]");
        }
        else {
            System.out.println ("Fora de intervalo");
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
        double valor_Qualquer = scanner.nextDouble();
        if (valor_Qualquer >= 0 && valor_Qualquer <= 25) {
            System.out.println ("Intervalo [0,25]");
        }
        else if (valor_Qualquer > 25 && valor_Qualquer <= 50) {
            System.out.println ("Intervalo (25,50]");
        }
        else if (valor_Qualquer > 50 && valor_Qualquer <= 75) {
            System.out.println ("Intervalo (50,75]");
        }
        else if (valor_Qualquer > 75 && valor_Qualquer <= 100) {
            System.out.println ("Intervalo (75,100]");
        }
        else {
            System.out.println ("Fora de intervalo");
        }
        scanner.close();
    }
}