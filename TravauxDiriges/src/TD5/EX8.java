package TD5;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot : \n ---> ");
        String input = scanner.nextLine();
        StringBuilder comp = new StringBuilder();

        if (input != null && !input.isEmpty()) {
            char currentChar = input.charAt(0);
            int count = 1;

            for (int i = 1; i < input.length(); i++) {
                char nextChar = input.charAt(i);
                if (nextChar == currentChar) {
                    count++;
                } else {
                    comp.append(currentChar).append(count);
                    currentChar = nextChar;
                    count = 1;
                }
            }
            comp.append(currentChar).append(count);
        }

        System.out.println("Entrée : " + input);
        System.out.println("Sortie : " + comp.toString());
    }
}

