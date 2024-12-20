package TD5;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot que vous voulez mettre en majuscule\n --> ");
        String mot = scanner.nextLine();
        String motMaj = mot.toUpperCase();
        System.out.println();
        System.out.print("Le mot en majuscule est : " + motMaj);

    }
}
