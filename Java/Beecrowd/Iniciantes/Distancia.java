// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Distancia {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int distancia_Km = scanner.nextInt(); // Km
        int tempo_Minutos = distancia_Km*2; // Minutos
        System.out.print (tempo_Minutos);
        System.out.println (" minutos");
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int distancia_Km = scanner.nextInt();
        int tempo_Minutos = distancia_Km*2; 
        System.out.print (tempo_Minutos);
        System.out.println (" minutos");
    }
}