package CV04;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class CeleCislo {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //uloha 03 21 
        while (true) {
            System.out.println("Zadej cislo cv1: ");
            int cislo = sc.nextInt();

            if (cislo <= 0) {
                System.out.println("Program ukoncen!");
                break;
            }

            int pocetDelitelu = 0;
            System.out.println("Delitele cisla " + cislo + ":");
            for (int i = 2; i <= cislo / 2; i++) {
                if (cislo % i == 0) {
                    System.out.print(i + " ");
                    pocetDelitelu++;
                }
            }
            System.out.println();
            System.out.println("Pocet delitelu: " + pocetDelitelu);

//            //uloha 03 22
//boolean jePrvocislo = cislo >1; na fotce chybi
            while (true) {
                System.out.println("Zadejte cislo cv2: ");
                cislo = sc.nextInt();

                if (cislo <= 0) {
                    System.out.println("Program ukoncen!");
                    break;
                }
                boolean jePrvocislo = true;

                if (cislo <= 1) {
                    jePrvocislo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(cislo); i++) {
                        if (cislo % i == 0) {
                            jePrvocislo = false;
                            break;
                        }
                    }
                }
                System.out.println("Cislo " + ((jePrvocislo) ? ("je") : ("neni")) + " prvocislo.");
                break;
            }

            //uloha 03 23
            while (true) {
                System.out.println();
                System.out.format("Zadejte cislo cv3: ");
                cislo = sc.nextInt();

                if (cislo <= 0) {
                    System.out.println("Program ukoncen!");
                    break;
                }

                System.out.println("Soucin prvocisel pro " + cislo + " je: ");
                int delitel = 2;
                while (cislo > 1) {
                    if (cislo % delitel == 0) {
                        System.out.print(delitel);
                        cislo /= delitel;
                        if (cislo > 1) {
                            System.out.print(" * ");
                        }
                    } else {
                        delitel++;
                    }
                }
            }

        }
    }
}
