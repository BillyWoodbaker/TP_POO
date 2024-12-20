package TD5;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        String[] voyelles = {"a", "e", "i", "o", "u", "y"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaine de charactère pour en savoir le nombre de voyelles \n --> ");
        String mot = scanner.nextLine().toLowerCase();
        int compteur = 0;
        for (int i = 0; i < mot.length(); i++) {
            for (int j = 0; j < voyelles.length; j++){
                if((String.valueOf(mot.charAt(i)).equals(voyelles[j]))){
                    compteur += 1;
                    break;
                }
            }
        }
        if (compteur != 0){
            System.out.println(compteur + " voyelles");
        } else {
            System.out.println("Il n'y a pas de voyelles");
        }
    }
}
