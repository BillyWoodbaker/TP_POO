package TD5;

public class EX10 {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "test";
        }
        long end = System.currentTimeMillis();
        System.out.println("Temps pour 'String' : " + (end - debut) + " ms");

        debut = System.currentTimeMillis();
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            build.append("test");
        }
        end = System.currentTimeMillis();
        System.out.println("Temps pour 'StringBuilder' : " + (end - debut) + " ms");
    }

}
