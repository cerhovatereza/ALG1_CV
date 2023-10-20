
//ulohy03_nejen_pocitame 5
package CV03;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class KvadratickaRovnice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej a b c pro vypocet rovnice.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.format("Takto vypada tva rovnice: %.2fx^2 + %.2fx + %.2f%n", a, b, c);
        double D = Math.pow(b, 2) - 4.0 * a * c;

        if (a == 0) { // lin rce
            double xLin = (-1.0 * c) / b;
            System.out.format("Rovnice je linearni. x = %.2f%n", xLin);
        } else if (D >= 0 && c != 0) { // nezaporny diskriminant
            double x1Real = (-b + Math.pow(D, 1.0 / 2)) / 2.0 * a;
            double x2Real = (-b - Math.pow(D, 1.0 / 2)) / 2.0 * a;
            System.out.format("Rovnice je kvadraticka, realna. x1 = %.2f x2 = %.2f%n", x1Real, x2Real);
        } else { // zaporny diskriminant => komplexni cisla
            double real = (-b) / 2.0 / a;
            double x1Kom = (-b + Math.pow((-1.0 * D), 1.0 / 2)) / 2.0 * a;
            double x2Kom = (-b - Math.pow((-1.0 * D), 1.0 / 2)) / 2.0 * a;
            System.out.format("Rovnice je kvadraticka, komplexni. %.2f + %.2fi", real, x1Kom);
            System.out.format("Rovnice je kvadraticka, komplexni. %.2f - %.2fi", real, x2Kom);
        }
    }
}
