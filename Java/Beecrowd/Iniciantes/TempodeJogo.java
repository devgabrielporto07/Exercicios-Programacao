// IntelliJ || NetBeans || Eclipse:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class TempodeJogo {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int hora_inicial_game = scanner.nextInt();
        int hora_final_game = scanner.nextInt();
        if (hora_final_game > hora_inicial_game) {
            int duracao_jogo = hora_final_game - hora_inicial_game;
            System.out.println("O JOGO DUROU " + duracao_jogo + " HORA(S)");
        }
        else if (hora_final_game < hora_inicial_game) {
            int duracao_jogo = (24 - hora_inicial_game) + hora_final_game;
            System.out.println("O JOGO DUROU " + duracao_jogo + " HORA(S)");
        }
        else {
            System.out.println ("O JOGO DUROU 24 HORA(S)");
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
        int hora_inicial_game = scanner.nextInt();
        int hora_final_game = scanner.nextInt();
        if (hora_final_game > hora_inicial_game) {
            int duracao_jogo = hora_final_game - hora_inicial_game;
            System.out.println("O JOGO DUROU " + duracao_jogo + " HORA(S)");
        }
        else if (hora_final_game < hora_inicial_game) {
            int duracao_jogo = (24 - hora_inicial_game) + hora_final_game;
            System.out.println("O JOGO DUROU " + duracao_jogo + " HORA(S)");
        }
        else {
            System.out.println ("O JOGO DUROU 24 HORA(S)");
        }
    }
}