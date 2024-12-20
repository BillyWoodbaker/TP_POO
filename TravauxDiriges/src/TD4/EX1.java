package TD4;

public class EX1 {
    public static void main(String[] args) {

        System.out.println("Première version :");

        int[] tab = {1, 2, 3, 4, 5};
        for(int i = 0; i < tab.length; i++ ){
            System.out.println(tab[i]);
        }

        System.out.println("Deuxième version :");

        for (int j: tab){
            System.out.println(j);
        }
    }

}
