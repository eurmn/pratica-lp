import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void verificarAnagrama(Scanner scanner) {
        scanner.nextLine();
        
        System.out.print("\nDigite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.length() != palavra2.length()) {
            System.out.println(palavra1);
            System.out.println(palavra2);
            System.out.println("As palavras não são anagramas!");
            return;
        }

        char[] palavra1Array = palavra1.toCharArray();
        char[] palavra2Array = palavra2.toCharArray();

        Arrays.sort(palavra1Array);
        Arrays.sort(palavra2Array);

        if (Arrays.equals(palavra1Array, palavra2Array)) {
            System.out.println("As palavras são anagramas!");
        } else {
            System.out.println("As palavras não são anagramas!");
        }
    }
}
