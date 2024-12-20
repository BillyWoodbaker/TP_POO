package TD4;

public class EX2 {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i: tab){
            sum += i;
        }

        System.out.println("La somme de tous les entiers du tableau est : " + sum);

    }
}
