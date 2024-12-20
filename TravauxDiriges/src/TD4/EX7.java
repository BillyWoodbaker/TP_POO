package TD4;
public class EX7 {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4};

        int premier = tableau[0];
        for (int i = 0; i < tableau.length - 1; i++) {
            tableau[i] = tableau[i + 1];
        }
        tableau[tableau.length - 1] = premier;

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

}
