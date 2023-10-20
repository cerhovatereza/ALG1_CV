//ulohy02_pocitame 15
package CV03;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class VypocetTeles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej hodnotu a b c pro delku stran kvadru (cm).");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        //vypocet kvadr
        double VKvadr = a * b * c;
        double SKvadr = 2 * (a * b + b * c + a * c);
        System.out.format("Kvadr: V = %.2fcm^3 S = %.2fcm^2%n", VKvadr, SKvadr);
        //vypocet krychle
        double aKKrychle = Math.pow(VKvadr, 1.0 / 3);
        double aSKrychle = Math.pow(6 * SKvadr, 1.0 / 2) / 6;
        //vypocet koule
        double rKKoule = Math.pow(6 * (Math.pow(Math.PI, 2)) * VKvadr, 1.0 / 3) / (2 * Math.PI);
        double rSKoule = Math.pow(Math.PI * SKvadr, 1.0 / 2) / (2 * Math.PI);
        //vypocet ctyrsten
        double aKCtyrsten = Math.pow(72 * Math.pow(VKvadr, 2), 1.0 / 6);
        double aSCtyrsten = Math.pow(27 * Math.pow(SKvadr, 2), 1.0 / 4) / 3;

        System.out.format("Krychle: strana a pro V kvadru : %.2f strana a pro S kvadru : %.2f%n", aKKrychle, aSKrychle);
        System.out.format("Koule: polomer r pro V kvadru : %.2f polomer r pro S kvadru : %.2f%n", rKKoule, rSKoule);
        System.out.format("Ctyrsten: strana a pro V kvadru : %.2f strana a pro S kvadru : %.2f%n", aKCtyrsten, aSCtyrsten);
    }

}
