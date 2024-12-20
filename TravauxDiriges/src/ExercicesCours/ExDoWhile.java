package ExercicesCours;

import java.util.Scanner;

public class ExDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choix;

        do {
            System.out.println("Entrez un mot, écrivez 'Quitter' pour arrêter");
            choix = input.next();
        } while (!choix.equalsIgnoreCase("Quitter"));{
            System.out.println("Merci au revoir");
        }
    }
}
