// IntelliJ:

package desafiosbeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int dist_TotalX = scanner.nextInt(); // quilõmetros (km)
        double total_Combustivel = scanner.nextDouble(); // litros (l)
        double consumo = (dist_TotalX / total_Combustivel);
        System.out.printf ("%.3f ", consumo);
        System.out.println ("km/l");
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int dist_TotalX = scanner.nextInt(); // quilõmetros (km)
        double total_Combustivel = scanner.nextDouble(); // litros (l)
        double consumo = (dist_TotalX / total_Combustivel);
        System.out.printf ("%.3f ", consumo);
        System.out.println ("km/l");
    }
}