package TD3;

import java.util.Objects;
import java.util.Scanner;

public class Exercices {
    public static void menu(Scanner scanner){
        boolean running = true;

        while (running) {
            System.out.println("=".repeat(50));
            System.out.println("1. Afficher les nombres de 1 à 50");
            System.out.println("2. Somme des entiers de 1 à 100");
            System.out.println("3. Nombre pairs de 0 à 100");
            System.out.println("4. Compte à rebours à partir de 10");
            System.out.println("5. Nombre de voyelle d'un mot");
            System.out.println("6. Table de multiplication");
            System.out.println("7. Vérification de mot de passe");
            System.out.println("8. Pyramide d'étoiles");
            System.out.println("9. Inversion d'une suite de nombre");
            System.out.println("10. Somme des multiples de 3 et 5 sous 1000");
            System.out.println("0. Quitter");
            System.out.println("=".repeat(50));
            System.out.print("Que voulez vous faire ? -->");

            int choix = scanner.nextInt();
            switch (choix){
                case 1 -> Ex1();
                case 2 -> Ex2();
                case 3 -> Ex3();
                case 4 -> Ex4();
                case 5 -> Ex5(scanner);
                case 6 -> Ex6(scanner);
                case 7 -> Ex7(scanner);
                case 8 -> Ex8(scanner);
                case 9 -> Ex9(scanner);
                case 10 -> Ex10();
                case 0 -> running = false;
                default -> System.out.println("Veuillez rentrer un nombre valide !");
            }
        }
    }

    public static void Ex1(){
        for (int i=1; i<=50; i++) {
            System.out.println(i);
        }
    }

    public static void Ex2(){
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("La somme des 100 premiers entiers est : " + sum);
    }

    public static void Ex3(){
        int i = 0;
        while (i <=100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void Ex4(){
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i>=0);
    }

    public static void Ex5(Scanner scanner){
        String voyelles = "aeiouy";
        int compteur = 0;
        System.out.println("Veuillez saisir un mor pour savoir son nombre de voyelles\n->");
        scanner.nextLine();
        String mot = scanner.nextLine();
        for (int i=0; i<mot.length(); i++){
            String lettre = mot.substring(i, i+1).toLowerCase();
            if (voyelles.contains(lettre)){
                compteur++;
            }
        }
        System.out.println("Le mot : '" + mot +"', contient " + compteur + " voyelles !");
    }

    public static void Ex6(Scanner scanner){
        System.out.println("Veuillez saisir un nombre pour en connaître sa table de multiplication\n->");
        int num = scanner.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

    public static void Ex7(Scanner scanner){
        System.out.println("Veuillez saisir un mot de passe :\n->");
        String mdp = scanner.nextLine();
        while (!Objects.equals(mdp, "1234")){
            System.out.println("Mot de passe incorrect ! Réessayez\n->");
            mdp = scanner.nextLine();
        }
        System.out.println("Mot de passe correct!");
    }

    public static void Ex8(Scanner scanner){
        System.out.print("Veuillez entrer la hauteur de la pyramide\n-->");
        int haut = scanner.nextInt();
        for (int i=1; i<=haut; i++){
            for(int j=1; j<=haut; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Ex9(Scanner scanner){
        System.out.println("Entrez une suite de nombre à inverser :\n->");
        scanner.nextLine();
        String suite = scanner.nextLine();
        int indice = suite.length() - 1;
        String invers = "";
        for (int i=indice; i>=0; i--){
            char character = suite.charAt(i);
            invers += character;
        }
        System.out.println("La suite inversée est : " + invers);
    }

    public static void Ex10(){
        int compt = 0;
        for (int i = 1; i<1000; i++){
            if (i%3 == 0 || i%5 == 0){
                compt += i;
            }
        }
        System.out.println("La somme des entiers en dessous de 1000 qui sont multiples de 5 ou 3 est : " + compt);
    }
}
