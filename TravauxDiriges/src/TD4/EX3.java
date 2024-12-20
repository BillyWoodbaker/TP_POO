package TD4;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = {1, 2, 3, 4, 5, 6};
        boolean present = false;

        System.out.print("Donnez un élément pour savoir si il se trouve dans le tableau :\n --> ");
        int cible = scan.nextInt();
        for(int i: tab){
            if(i==cible){
                present = true;
                break;
            }
        }
        if (present){
            System.out.println("L'élément donné est dans le tableau !");
        } else {
            System.out.println("L'élément n'est pas dans le tableau :(");
        }
    }
}
