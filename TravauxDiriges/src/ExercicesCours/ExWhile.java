package ExercicesCours;

import java.util.Objects;
import java.util.Scanner;

public class ExWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez un mot, 'OK' pour arrêter");
        String mot = input.next();
        while(!Objects.equals(mot, "OK")) {
            System.out.println("Entrez un mot, 'OK' pour arrêter");
            mot = input.next();
        }
    }
}
