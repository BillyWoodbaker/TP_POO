package TD5;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le mot \n --> ");
        String mot = scanner.nextLine().toLowerCase();
        System.out.println();
        System.out.print("Entrez la lettre à chercher \n --> ");
        String lettre = scanner.nextLine().toLowerCase();
        boolean rep = true;
        int position = 0;
        for(int i = 0; i < mot.length(); i++){
            if (lettre.equals(String.valueOf(mot.charAt(i)))){
                rep = true;
                position = i+1;
                break;
            } else {
                rep = false;
            }
        }
        if (rep){
            System.out.println("Le charactère " + lettre + " se trouve à la position " + position);
        } else {
            System.out.println("Le charactère n'est pas dans le mot");
        }
    }
}
