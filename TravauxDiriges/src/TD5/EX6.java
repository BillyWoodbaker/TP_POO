package TD5;

import java.util.Arrays;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot dont vous voulez remplacer les e avec des a \n --> ");
        String mot = scanner.nextLine();

        char motListe[] = mot.toCharArray();

        for (int i = 0; i < motListe.length; i++) {
            if (motListe[i] == 'e') {
                motListe[i] = 'a';
            } else if (motListe[i] == 'E') {
                motListe[i] = 'A';
            }
        }

        mot = Arrays.toString(motListe);
        System.out.print("Le nouveau mot est : \n -->");
        System.out.println(motListe);
    }
}
