package TD1;

import java.util.Scanner;

public class Exercices {

    public static void menu(Scanner scanner){
        boolean running = true;

        while (running) {
            System.out.println("=".repeat(50));
            System.out.println("1. Déclarer des variables et les afficher");
            System.out.println("2. Opérations arithmétiques");
            System.out.println("3. Manipulation de chaînes");
            System.out.println("4. Convertir des types de données");
            System.out.println("5. Calcul avec des opérateurs d'affectation");
            System.out.println("6. Formatage de texte");
            System.out.println("7. Conversion entre Fahrenheit et Celsius");
            System.out.println("8. Conversion de minutes en heures et minutes");
            System.out.println("9. Calcul du périmètre et de l'aire d'un cercle");
            System.out.println("10. Calcul de l'IMC (Indice de Masse Corporelle)");
            System.out.println("0. Quitter");
            System.out.println("=".repeat(50));
            System.out.print("Que voulez vous faire ? -->");

            int choix = scanner.nextInt();
            switch (choix){
                case 1 -> Ex1();
                case 2 -> Ex2();
                case 3 -> Ex3();
                case 4 -> Ex4();
                case 5 -> Ex5();
                case 6 -> Ex6();
                case 7 -> Ex7();
                case 8 -> Ex8();
                case 9 -> Ex9();
                case 10 -> Ex10();
                case 0 -> running = false;
                default -> System.out.println("Veuillez rentrer un nombre valide !");
            }
        }
    }

    public static void Ex1(){
        int x = 5;
        double y = 5.11;
        String z = "Thomas";
        System.out.println(x + "\n" + y + "\n" + z);
    }

    public static void Ex2(){
        int a = 10;
        int b = 5;
        //Opérations
        int add = a + b;
        int sous = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println("Addition : "+ add);
        System.out.println("Soustraction : "+ sous);
        System.out.println("Multiplication : "+ mult);
        System.out.println("Division : "+ div);
        System.out.println("Modulo : "+ mod);
    }

    public static void Ex3(){
        String nom = "Thomas Vrydagh";
        System.out.println("Nom : " + nom );
        System.out.println("Longueur du nom avec espace = " + nom.length());
        System.out.println("Longueur du nom sans espace = " + nom.replace(" ", "").length());
        System.out.println("Nom en majuscule = " + nom.toUpperCase());
    }

    public static void Ex4(){
        double x = 6.9;
        int y = (int) x; // cast d'un double en int
        System.out.println("Double : " + x + "\n" + "Int : " + y);
    }

    public static void Ex5(){
        int x = 5;
        System.out.println("x + 4 = " + (x+=4) + "- 8 = " + (x-=8) + "*10 = " + (x*=10) + "/5 = " + (x/=5));
    }

    public static void Ex6(){
        String prenom = "Thomas";
        String nom = "Vrydagh";
        int age = 24;
        System.out.println("Je m'appelle " + prenom + " " + nom + ", et j'ai " + age + " ans.");
    }

    public static void Ex7(){
        double fahr = 62.0;
        double celc = 5.0/9.0*(fahr-32.0);
        System.out.println(fahr + " en F° font " + celc + " C°");
    }

    public static void Ex8(){
        int min = 129;
        int heure = min / 60;
        int min2 = min % 60;
        System.out.println(min + " minutes font " + heure + " heures et " + min2 + " minutes.");
    }

    public static void Ex9(){
        double rayon = 9.0;
        double perim = 2 * Math.PI * rayon ;
        double aire = Math.PI * Math.pow(rayon, 2);
        System.out.printf("Périmètre = %.2f\n", perim); // f pour float et .2 pour dire 2 chiffres après la virgules
        System.out.printf("Aire = %.2f", aire);
    }

    public static void Ex10(){
        double poids = 92;
        double taille = 1.79;
        double IMC = poids/(taille*taille); //Calcul IMC = poids divisé par la taille au carré
        System.out.printf("L'IMC est de : %.2f", IMC);
    }
}
