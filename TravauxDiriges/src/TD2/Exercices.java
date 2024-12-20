package TD2;

import java.util.Random;
import java.util.Scanner;

public class Exercices {

    public static void menu(Scanner scanner){
        boolean running = true;
        while (running){
            System.out.println("=".repeat(50));
            System.out.println("1. Vérification de la parité d’un nombre");
            System.out.println("2. Comparaison de deux nombres");
            System.out.println("3. Classification des notes");
            System.out.println("4. Calcul du prix total avec remise");
            System.out.println("5. Jour de la semaine");
            System.out.println("6. Calculatrice simple");
            System.out.println("7. Calcul de l’impôt sur le revenu");
            System.out.println("8. Validation de triangle");
            System.out.println("9. Deviner un nombre aléatoire");
            System.out.println("10. Convertisseur de monnaie");
            System.out.println("0. Quitter");

            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> Ex1(scanner);
                case 2 -> Ex2(scanner);
                case 3 -> Ex3(scanner);
                case 4 -> Ex4(scanner);
                case 5 -> Ex5(scanner);
                case 6 -> Ex6(scanner);
                case 7 -> Ex7(scanner);
                case 8 -> Ex8(scanner);
                case 9 -> Ex9(scanner);
                case 10 -> Ex10(scanner);
                case 0 -> running = false;
                default -> System.out.println("Veuillez rentrer un nombre valide !");
            }
        }
    }

    public static void Ex1(Scanner scanner){
        System.out.print("Quel est votre nombre ?\n-->");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Le nombre " + x + " est pair :))");
        } else {
            System.out.println("Le nombre " + x + "est impair :((");
        }
    }

    public static void Ex2(Scanner scanner){
        System.out.print("Quel est le nombre 1 ?\n-->");
        int x = scanner.nextInt();
        System.out.println("Quel est le nombre 2 ?\n-> ");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println(x + " est plus grand que " + y);
        } else if (x == y) {
            System.out.println(x + " est égal à " + y);
        } else {
            System.out.println(x + " est plus petit que " + y);
        }
    }

    public static void Ex3(Scanner scanner){
        System.out.print("Veuillez entrer la note \n-->");
        int note = scanner.nextInt();
        if (note >= 90) {
            System.out.println("Excellent");
        } else if (note < 90 && note >= 70) {
            System.out.println("Bien");
        } else {
            System.out.println("Besoin amélioration");
        }
    }

    public static void Ex4(Scanner scanner){
        double remise;
        System.out.println("Veuillez entrer le montant\n-> ");
        double montant = scanner.nextDouble();
        if (montant >= 100) {
            remise = 0.10;
        } else if (montant >= 50 && montant < 100) {
            remise = 0.05 ;
        } else {
            remise = 0;
        }
        System.out.println("Le prix à payer est " + (montant - (montant * remise)));
    }

    public static void Ex5(Scanner scanner){
        System.out.print("Entrez un nombre entre 1 et 7\n-->");
        int jour = scanner.nextInt();
        switch (jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("J'ai dit entre 1 et 7, il faut apprendre à lire là");
                break;
        }
    }

    public static void Ex6(Scanner scanner){
        System.out.print("Entrez un nombre\n--> ");
        double x = scanner.nextDouble();
        System.out.print("Entrez un autre nombre\n--> ");
        double y = scanner.nextDouble();
        System.out.print("Veuillez entrer l'opérateur de votre choix \n Possibilités : '+' '-' '*' '/'\n--> ");
        String calcul = scanner.next();
        switch (calcul) {
            case "+":
                System.out.println(x + " + " + y + " = " + (x+y));
                break;
            case "-":
                System.out.println(x + " - " + y + " = " + (x-y));
                break;
            case "*":
                System.out.println(x + " x " + y + " = " + (x*y));
                break;
            case "/":
                System.out.println(x + " / " + y + " = " + (x/y));
                break;
            default:
                System.out.println("Oh chef c'est quoi ton calcul là ?");
                break;
        }
    }

    public static void Ex7(Scanner scanner){
        double impot;
        System.out.print("Veuillez entrer votre revenu valeur\n-->");
        double x = scanner.nextDouble();
        if (x <= 10000) {
            impot = 1;
        } else if (x > 10000 && x <= 30000){
            impot = 0.10;
        } else {
            impot = 0.20;
        }
        System.out.println("L'impot par rapport à votre revenu (" + x + ") vaut " + (x * impot));
    }

    public static void Ex8(Scanner scanner){
        System.out.println("Entrez le nombre 1\n-> ");
        double a = scanner.nextDouble();
        System.out.println("Entrez le nombre 2\n-> ");
        double b = scanner.nextDouble();
        System.out.println("Entrez le nombre 3\n-> ");
        double c = scanner.nextDouble();
        if ((a > 0 && b > 0 && c > 0) && ((a+b > c) || (a+c > b) || (b+c > a))) {
            System.out.println("Sympa le triangle");
        } else {
            System.out.println("Tu dis n'importe quoi ça peut pas être un triangle ça");
        }
    }

    public static void Ex9(Scanner scanner){
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int essai = 0;
        System.out.println("Devinez le nombre entre 1 et 100 :");
        while (essai != target) {
            System.out.print("Proposez un nombre -->");
            essai = scanner.nextInt();
            if (essai == target) {
                System.out.println("C'est gagné !!!");
            } else if (essai < target) {
                System.out.println("Le nombre recherché est plus grand");
            } else {
                System.out.println("Le nombre recherché est plus petit");
            }
        }
    }

    public static void Ex10(Scanner scanner){
        double conv;
        System.out.print("Entrez un une somme en euros\n-->");
        double x = scanner.nextDouble();
        System.out.print("Entrez la devise pour faire la conversion\nPossibilités :  'USD', 'GBP' et 'JPY'\n-->");
        String devise = scanner.next();
        switch (devise.toUpperCase()) {
            case "USD":
                conv = x * 1.05;
                System.out.println(x +"€ = $"+ conv);
                break;
            case "GBP":
                conv = x * 0.83;
                System.out.println(x +"€ = "+ conv + " £");
                break;
            case "JPY":
                conv = x * 163.77;
                System.out.println(x +"€ = "+ conv + " ¥");
                break;
            default:
                System.out.println("Qu'est ce que c'est que ça pour une devise ?");
                break;
        }
    }
}
