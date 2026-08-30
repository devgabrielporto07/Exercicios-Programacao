// IntelliJ || NetBeans || Eclipse:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class TempodeJogocomMinutos {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();

        // O ideal é converter tudo para uma unidade só:
        int conversaoMinutoHoraInicial = horaInicial*60;
        int conversaoMinutoHoraFinal = horaFinal*60;
        int totalMinutosInicial = conversaoMinutoHoraInicial + minutoInicial;
        int totalMinutosFinal = conversaoMinutoHoraFinal + minutoFinal;

        // Condicional caso o usuario digite as horas de começo e final iguais
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
            // Caso o jogo não passe da meia noite
            if (totalMinutosInicial < totalMinutosFinal) {
                int diferencaMinutos = totalMinutosFinal - totalMinutosInicial;
                int horas = diferencaMinutos / 60; // Como eu to dividindo dois números inteiros o java pega apenas o inteiro a parte
                int minutos = diferencaMinutos % 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
            } else {
                int diferencaMinutos = (1440 - totalMinutosInicial) + totalMinutosFinal;
                int horas = diferencaMinutos / 60;
                int minutos = diferencaMinutos % 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
            }
        }
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();
        
        // O ideal é converter tudo para uma unidade só:
        int conversaoMinutoHoraInicial = horaInicial*60;
        int conversaoMinutoHoraFinal = horaFinal*60;
        int totalMinutosInicial = conversaoMinutoHoraInicial + minutoInicial;
        int totalMinutosFinal = conversaoMinutoHoraFinal + minutoFinal;
        
        // Condicional caso o usuario digite as horas de começo e final iguais
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
            // Caso o jogo não passe da meia noite
            if (totalMinutosInicial < totalMinutosFinal) {
                int diferencaMinutos = totalMinutosFinal - totalMinutosInicial;
                int horas = diferencaMinutos / 60; // Como eu to dividindo dois números inteiros o java pega apenas o inteiro a parte
                int minutos = diferencaMinutos % 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
            }
            else {
                int diferencaMinutos = (1440 - totalMinutosInicial) + totalMinutosFinal;
                int horas = diferencaMinutos / 60;
                int minutos = diferencaMinutos % 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
            }
        }    
    }
}