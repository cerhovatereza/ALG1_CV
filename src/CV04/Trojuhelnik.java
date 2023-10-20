package CV04;


import java.util.Scanner;

public class Trojuhelnik {

    private static final Scanner sc = new Scanner(System.in);
    //private static final double EPS = 1E-8; lepsi tolerance

    public static void main(String[] args) {
        System.out.println("Zadej delky stran trojuhelniku");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        if (x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Nutno zadat kladna cisla.");
            return;
        }
        if ((x + y <= z) || (Math.abs(x - y) >= z)) {
            System.out.println("Nelze sestrojit trojuhelnik");
            return;
        }
        double a, b, c;
        // serazeni delek strn a, b, c tak, aby a <= b <= c
        if (x < y) {
            if (y < z) {
                a = x;
                b = y;
                c = z;
            } else if (z < x) {
                a = z;
                b = x;
                c = y;
            } else {
                a = x;
                b = z;
                c = y;
            }
        } else if (x < z) {
            a = y;
            b = x;
            c = z;
        } else if (y < z) {
            a = y;
            b = z;
            c = x;
        } else {
            a = z;
            b = y;
            c = x;
        }

        // vypocet plochy a obvodu
        double obvod = a + b + c;
        // Heronov vzorec
        double s = obvod / 2;
        double plocha = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Obvod trojuhelnika: " + obvod);
        System.out.println("Plocha trojuhelnika: " + plocha);

        // urceni trojuhelniku podle delkz stran
        //double eps = c *EPS; //eps = nejdelsi strana * EPS
        if (a == b && b == c) { //(Math.abs(a-b) < EPS && Math.abs(b-c) < EPS)
            System.out.println("Trojuhelnik je rovnostranny.");
        } else if (a == b || b == c || a == c) { //((Math.abs(a-b) < EPS || (Math.abs(b-c) < EPS || (Math.abs(a-c) < EPS)
            System.out.println("Trojuhelnik je rovnoramenny.");
        } else {
            System.out.println("Trojuhelnik je obecny.");
        }

        // vypocet uhlu ve stupnich
        // znovu zadat EPS eps = c*c*EPS; //eps = nejdelsi strana * EPS
        double uhelA = Math.toDegrees(Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c)));
        double uhelB = Math.toDegrees(Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c)));
        double uhelC = Math.toDegrees(Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b)));

        // urceni trojuhelniku podle uhlu
        if (uhelA == 90 || uhelB == 90 || uhelC == 90) {
            System.out.println("Trojuhelnik je pravouhly.");
        } else if (uhelA < 90 && uhelB < 90 && uhelC < 90) {
            System.out.println("Trojuhelnik je ostry.");
        } else {
            System.out.println("Trojuhelnik je tupy.");
        }
    }
}
