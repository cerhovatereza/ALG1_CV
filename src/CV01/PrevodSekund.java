//ulohy02 1
package CV01;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class PrevodSekund {

    public static void main(String[] args) {

        Scanner scH = new Scanner(System.in);
        System.out.println("Program se postupne zepta na tri casovo udaje zavodnika");
        System.out.println("Zadej hodiny");
        int h = scH.nextInt();

        Scanner scM = new Scanner(System.in);
        System.out.println("Zadej minuty");
        int m = scM.nextInt();

        Scanner scS = new Scanner(System.in);
        System.out.println("Zadej sekundy");
        int s = scS.nextInt();

        int prevodHodNaSek = h * 3600;
        int prevodMinNaSek = m * 60;
        int celkovyPocetSek = prevodHodNaSek + prevodMinNaSek + s;

        System.out.println("Zavodnik jel " + celkovyPocetSek + " sekund.");

        //ulohy02 2
        Scanner scSekundy = new Scanner(System.in);
        System.out.println("Zadej sekundy pro prevod");
        int sekundy = scSekundy.nextInt();

        int HH = sekundy / 3600;
        int HHm = sekundy % 3600;

        int MM = HHm / 60;
        int SS = HHm % 60;

        System.out.printf("%02d:%02d:%02d%n", HH, MM, SS);
    }

}
