package TD4;

public class EX5 {
    public static void main(String[] args) {
        int[] tab = {10, 1, 8, 7, 4, 3, 9};
        int n = tab.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(tab[j] > tab[j+1]){
                    int x = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = x;
                }
            }
        }
        for (int k : tab) {
            System.out.print(k + " ");
        }

    }
}
