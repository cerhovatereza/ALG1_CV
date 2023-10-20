package CV04;


import java.util.Scanner;

public class DveRovnice {

    private static final Scanner sc = new Scanner(System.in);
    private static final double SKORO_NULA=1E-20; //lepsi pro porovnani realnych cisel

    public static void main(String[] args) {
        System.out.println("Zadejte koeficienty pro první rovnici (A B C): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Zadejte koeficienty pro druhou rovnici (D E F): ");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double determinant = a * e - d * b;

        if (Math.abs(determinant) != SKORO_NULA) {
            double x = ((c * e) - (f * b)) / determinant;
            double y = ((a * f) - (d * c)) / determinant;

            System.out.println("Reseni soustavy rovnic:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("Soustava nema jednoznacne reseni.");
        }
    }
}
