import java.util.Scanner;

public class Tabuada {
    public void fazerTabuada(Scanner scanner) {
        System.out.println("\nOs tipos de operação são:");

        System.out.println("1. Soma;");
        System.out.println("2. Subtração;");
        System.out.println("3. Multiplicação;");
        System.out.println("4. Divisão.");

        System.out.print("\nDigite a operação da tabuada: ");

        int type = scanner.nextInt();

        System.out.print("Digite o número: ");
        int number = scanner.nextInt();

        switch (type) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d + %d = %d\n", i, number, number + i);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d - %d = %d\n", i, number, number - i);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d\n", i, number, number * i);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d / %d = %d\n", i, number, number / i);
                }
                break;
            default:
                System.out.println("Operação " + Integer.toString(type) + " inválida!");
                break;
        }
        
    }
}
