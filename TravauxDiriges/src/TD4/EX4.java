package TD4;

public class EX4 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] inv = new int[tab.length];
        int j = 0;
        for(int i = tab.length -1; i >=0; i--){
            inv[j] = tab[i];
            j++;
        }
        for(int k: inv){
            System.out.print(k + " ");
        }
    }
}
