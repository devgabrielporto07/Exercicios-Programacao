// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class DistanciaEntreDoisPontos {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double plano1_X1 = scanner.nextDouble(); // primeira linha
        double plano1_Y1 = scanner.nextDouble();
        double plano2_X2 = scanner.nextDouble(); // segunda lihha
        double plano2_Y2 = scanner.nextDouble();
        double dist_Doispontos = Math.sqrt(Math.pow (plano2_X2 - plano1_X1, 2) + Math.pow (plano2_Y2 - plano1_Y1, 2));
        System.out.printf ("%.4f\n", dist_Doispontos);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double plano1_X1 = scanner.nextDouble(); 
        double plano1_Y1 = scanner.nextDouble();
        double plano2_X2 = scanner.nextDouble(); 
        double plano2_Y2 = scanner.nextDouble();
        double dist_Doispontos = Math.sqrt(Math.pow (plano2_X2 - plano1_X1, 2) + Math.pow (plano2_Y2 - plano1_Y1, 2));
        System.out.printf ("%.4f\n", dist_Doispontos);
     }
}