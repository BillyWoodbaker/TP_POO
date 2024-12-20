package TD5;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Entrez un mot pour en connaître le nombre de charactère : \n ---> ");
        String entree = scanner.nextLine();
        int sortie;
        int sortie2;
        sortie = entree.length();
        sortie2 = entree.replace(" ", "").length();

        System.out.println(sortie);
        System.out.println(sortie2);

    }
}
