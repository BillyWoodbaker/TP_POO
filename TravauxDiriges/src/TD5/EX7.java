package TD5;

import java.util.Arrays;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot pour savoir si c'est un palindrome \n --> ");
        String mot = scanner.nextLine().toLowerCase();
        boolean palindrome = false;
        int longueur = mot.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (mot.charAt(i) != mot.charAt(longueur - 1 - i)) {
                palindrome = false;
                break;
            } else {
                palindrome = true;
            }
        }
        if (palindrome){
            System.out.println("Ce mot est un palindrome");
        } else {
            System.out.println("Ce mot n'est pas un palindrome");
        }
    }
}
