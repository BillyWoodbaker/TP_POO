package ExerciceManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("VISUALISEUR D'EXERCICES");
            System.out.println("=".repeat(25));
            System.out.println("1. Exercices du TD1");
            System.out.println("2. Exercices du TD2");
            System.out.println("3. Exercices du TD3");
            System.out.println("0. Quitter le visualiseur");
            System.out.println("=".repeat(25));
            System.out.print("Que voulez vous faire ? -->");

            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> TD1.Exercices.menu(scanner);
                case 2 -> TD2.Exercices.menu(scanner);
                case 3 -> TD3.Exercices.menu(scanner);
                case 0 -> {
                    System.out.println("Au revoir et merci");
                    running = false;
                }
                default -> System.out.println("Veuillez rentrer un nombre valable.");
            }
        }
    }
}
