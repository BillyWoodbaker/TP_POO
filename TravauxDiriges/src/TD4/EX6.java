package TD4;

public class EX6 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6};
        int[] tab2 = {4, 6, 8, 10, 12};
        int long1 = tab1.length;
        int long2 = tab2.length;
        int[] tab3 = new int[long1 + long2];
        int j = 0;

        for(int i = 0; i <= long1 -1; i++){
            tab3[j] = tab1[i];
            j++;
        }
        for (int k = 0; k <= long2 -1; k++){
            boolean present = false;
            for(int l: tab3){
                if (tab2[k] == l) {
                    present = true;
                    break;
                }
            }
            if(!present){
                tab3[j] = tab2[k];
                j++;
            }
        }

        int[] tabFinal = new int[j];
        for (int m = 0; m < j; m++) {
            tabFinal[m] = tab3[m];
        }

        for (int n: tabFinal){
            System.out.print(n + " ");
        }
    }
}
