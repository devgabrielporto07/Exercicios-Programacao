// IntelliJ || NetBeans || Eclipse:

package com.mycstudyjava.estudosjava;

/**
 *
 * @author gabriel_porto
 */

import java.util.Locale;
import java.util.Scanner;
public class NumerosPares {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        for (int loop = 1; loop < 101; loop++) {
            if (loop % 2 == 0) {
                System.out.println(loop);
                continue;
            }
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
        
        for (int loop = 1; loop < 101; loop++) {
            if (loop % 2 == 0) {
                System.out.println (loop);
                continue;
            }
        }
        scanner.close();
    }
}