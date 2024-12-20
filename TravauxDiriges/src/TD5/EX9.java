package TD5;

public class EX9 {
    public static void main(String[] args) {
        String[] mots = {"Bonjour", "à", "tous"};
        String resultat = "";
        for (int i = 0; i < mots.length; i++) {
            resultat += mots[i];
            if (i < mots.length - 1) {
                resultat += " ";
            }
        }
        System.out.println("Résultat : " + resultat);
    }
}
