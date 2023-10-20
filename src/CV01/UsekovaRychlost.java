//ulohy02 9
package CV01;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class UsekovaRychlost {

    public static void main(String[] args) {

        //nasobime 3.6 protoze do ted pocitame pro m/s a chceme km/h
        Scanner scMaxRychlost = new Scanner(System.in);
        System.out.println("Zadej maximalni povolena rychlost v danem useku (km/h).");
        int maxRychlost = scMaxRychlost.nextInt();

        Scanner scDelkaUseku = new Scanner(System.in);
        System.out.println("Zadej delku useku v metrech.");
        int delkaUseku = scDelkaUseku.nextInt();

        Scanner scVjezd = new Scanner(System.in);
        System.out.println("Zadej casove udaje pri vjezdu do useku");
        System.out.println("V kolik hodin");
        int vjezdHod = scVjezd.nextInt();
        System.out.println("V kolik minut");
        int vjezdMin = scVjezd.nextInt();
        System.out.println("V kolik vterin");
        int vjezdSek = scVjezd.nextInt();

        int prevodVjezdHodNaSek = vjezdHod * 3600;
        int prevodVjezdMinNaSek = vjezdMin * 60;
        int vjezdCelkoveSekundy = prevodVjezdHodNaSek + prevodVjezdMinNaSek + vjezdSek;

        Scanner scVyjezd = new Scanner(System.in);
        System.out.println("Zadej casove udaje pri vyjezd do useku");
        System.out.println("V kolik hodin");
        int vyjezdHod = scVyjezd.nextInt();
        System.out.println("V kolik minut");
        int vyjezdMin = scVyjezd.nextInt();
        System.out.println("V kolik vterin");
        int vyjezdSek = scVyjezd.nextInt();

        int prevodVyjezdHodNaSek = vyjezdHod * 3600;
        int prevodVyjezdMinNaSek = vyjezdMin * 60;
        int vyjezdCelkoveSekundy = prevodVyjezdHodNaSek + prevodVyjezdMinNaSek + vyjezdSek;

        int celkovyCas = vyjezdCelkoveSekundy - vjezdCelkoveSekundy;

        double prumernaRychlost = (delkaUseku / celkovyCas) * 3.6;
        double prekroceniPovoleneRychlosti = prumernaRychlost - maxRychlost;
        //String prekrocenaMaxRychlost = (prumernaRychlost > maxRychlost)? "0" : "Maximalni povolena rychlost byla prekrocena o " + prekroceniPovoleneRychlosti;

        System.out.println("Tvoje prumerna rychlost je: " + prumernaRychlost + " km/h");
        System.out.printf("Maximalni povolenou rychlost jsi prekrocil o " + "%,.2f", prekroceniPovoleneRychlosti);
    }

}
