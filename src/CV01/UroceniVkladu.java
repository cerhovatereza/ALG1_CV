//ulohy02 12
package CV01;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class UroceniVkladu {
    //privat static Scanner sc = new Scanner(System.in)

    public static void main(String[] args) {

        Scanner scK0 = new Scanner(System.in);
        System.out.println("Zadej pocatecni kapital (K0)");
        double K0 = scK0.nextInt();

        Scanner scu = new Scanner(System.in);
        System.out.println("Zadej v jake vysi ma byt rocni uroceni vkladu (u)");
        double u = scu.nextInt();

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadej kolik let chces urocit (n)");
        double n = scn.nextInt();

        Scanner scm = new Scanner(System.in);
        System.out.println("Zadej kolikrat do roka je pripisovan urok (m)");
        double m = scm.nextInt();

        double MN = m * n;
        double KnMoc = Math.pow((1 + (u / m)), MN);
        double Kn = (KnMoc / K0);

        System.out.printf("Kn je: " + "%,.4f", KnMoc);
        System.out.println("Kn neco je: " + Kn);
    }
}
