package TD5;

import java.util.Arrays;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMME POUR CONNAITRE SI DEUX MOTS SONT DES ANAGRAMES \n" + "=".repeat(56));
        System.out.print("Entrez un premier mot : \n --> ");
        String mot1 = scanner.nextLine().toLowerCase();
        System.out.print("Entrez un deuxième mot : \n --> ");
        String mot2 = scanner.nextLine().toLowerCase();

        char mot1Liste[] = mot1.toCharArray();
        char mot2Liste[] = mot2.toCharArray();

        Arrays.sort(mot1Liste);
        Arrays.sort(mot2Liste);

        mot1 = Arrays.toString(mot1Liste);
        mot2 = Arrays.toString(mot2Liste);

        if (mot1.equals(mot2)){
            System.out.println("Ces mots sont des anagrammes");
        } else {
            System.out.println("Ces mots ne sont pas des anagrammes");
        }

    }
}
