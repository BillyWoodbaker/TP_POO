package TD4;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = {2,3,4,1};
        int longueur = tab.length;
        System.out.println("=".repeat(25));
        System.out.println("Choisissez le total recherché");
        System.out.println("=".repeat(25));
        System.out.print("--> ");
        int cible = scanner.nextInt();

        for(int i = 0; i < longueur; i++){
            int somme = 0;
            for(int j = i; j<longueur; j++){
                somme += tab[j];
                if (somme==cible){
                    for (int k = i; k<= j; k++){
                        System.out.print(tab[k] + " ");
                    }
                    System.out.println();
                }

                if (somme > cible){
                    break;
                }
            }

        }
    }

}
