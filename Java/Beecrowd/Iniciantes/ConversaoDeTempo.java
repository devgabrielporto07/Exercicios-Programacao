// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class ConversaoDeTempo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final int segundos_Emhoras = 3600;
        int tempo_dadoSegundos= scanner.nextInt();
        int tempo_Horas = tempo_dadoSegundos / segundos_Emhoras;
        int resto = tempo_dadoSegundos % segundos_Emhoras;
        int tempo_Minutos = resto / 60;
        int tempo_Segundos = resto % 60;
        System.out.println (tempo_Horas+":"+tempo_Minutos+":"+tempo_Segundos);
    }
}
// (divisao inteira) dois tipos primitivos iguais o java força apenas ficar em inteiro
// Entendimento do Problema:
//  5 5 6  | 3 6 0 0
//-     0  |---------
//--------   0  <-- QUOCIENTE INTEIRO (Horas: //)
//  5 5 6  <----- RESTO (Segundos restantes: %)

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
      Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final int segundos_Emhoras = 3600;
        int tempo_dadoSegundos= scanner.nextInt();
        int tempo_Horas = tempo_dadoSegundos / segundos_Emhoras;
        int resto = tempo_dadoSegundos % segundos_Emhoras;
        int tempo_Minutos = resto / 60;
        int tempo_Segundos = resto % 60;
        System.out.println (tempo_Horas+":"+tempo_Minutos+":"+tempo_Segundos);
    }
}
