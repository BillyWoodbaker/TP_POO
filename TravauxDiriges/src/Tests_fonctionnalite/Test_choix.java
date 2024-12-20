package Tests_fonctionnalite;

import java.util.Objects;
import java.util.Scanner;

public class Test_choix {

    public static void Exercice(Scanner scanner){
        String code = "Le code s'affiche";
        System.out.print("1. Affiche le code, 2 affiche le résultat, 3 affiche les deux\n--> ");
        int choix = scanner.nextInt();
        switch (choix) {
            case 1 -> System.out.println(code);
            case 2 -> {
                System.out.print("Veuillez saisir un mot de passe :\n--> ");
                String mdp = scanner.nextLine();
                while (!Objects.equals(mdp, "1234")) {
                    System.out.print("Mot de passe incorrect ! Réessayez\n--> ");
                    mdp = scanner.nextLine();
                }
                System.out.println("Mot de passe correct!");
            }
            case 3 -> {
                System.out.println("-".repeat(5) + " CODE " + "-".repeat(5));
                System.out.println(code);
                System.out.println("-".repeat(5) + " EXECUTION " + "-".repeat(5) + "\n");
                System.out.println("Veuillez saisir un mot de passe :\n->");
                scanner.nextLine();
                String mdp = scanner.nextLine();
                while (!Objects.equals(mdp, "1234")) {
                    System.out.println("Mot de passe incorrect ! Réessayez\n->");
                    mdp = scanner.nextLine();
                }
                System.out.println("Mot de passe correct!");
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("1 pour accéder à l'exercice, 0 pour arrêter\n--> ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> Exercice(scanner);
                case 0 -> running = false;
            }
        }
    }
}
