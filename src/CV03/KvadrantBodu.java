//ulohy03_nejen_pocitame 7
package CV03;

import java.util.Scanner;

/**
 *
 * @author Tereza
 */
public class KvadrantBodu {
    //private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej souradnice bodu x y");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.format("Zadane souradnice x %.2f a y %.2f lezi na pocatku soustavi souradnic.%n", x, y);
        } else if (x >= 0 && y >= 0) {
            System.out.format("Zadane souradnice x %.2f a y %.2f lezi v 1. kvadrantu.%n", x, y);
        } else if (x <= 0 && y >= 0) {
            System.out.format("Zadane souradnice x %.2f a y %.2f lezi v 2. kvadrantu.%n", x, y);
        } else if (x <= 0 && y <= 0) {
            System.out.format("Zadane souradnice x %.2f a y %.2f lezi v 3. kvadrantu.%n", x, y);
        } else {
            System.out.format("Zadane souradnice x %.2f a y %.2f lezi v 4. kvadrantu.%n", x, y);
        }

    }
}
