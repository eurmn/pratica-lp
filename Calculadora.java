import java.util.Scanner;

/* 
 * Exercício 6 - Eleição Sindical
 * Aluno: Lucas Garrafielo - Matricula: 20220070609
*/
public class Calculadora {
    static float calcularDobro(float numero) {
        return numero * 2;
    }

    static float calcularTriplo(float numero) {
        return numero * 3;
    }

    static float calcularMetade(float numero) {
        return numero / 2;
    }

    static float calcularQuadrado(float numero) {
        return numero * numero;
    }

    static float calcularCubo(float numero) {
        return numero * numero * numero;
    }

    static float calcularRaizQuadrada(float numero) {
        return (float) Math.sqrt(numero);
    }

    static float calcularRaizCubica(float numero) {
        return (float) Math.cbrt(numero);
    }

    static float calcularModulo(float numero) {
        return Math.abs(numero);
    }

    static float calcularInverso(float numero) {
        return 1 / numero;
    }

    public static void iniciarCalculadora(Scanner scanner) {
        System.out.println("\nEscolha qual operação deseja executar:");
        System.out.println("1. Dobro.");
        System.out.println("2. Triplo.");
        System.out.println("3. Metade.");
        System.out.println("4. Quadrado.");
        System.out.println("5. Cubo.");
        System.out.println("6. Raiz Quadrada.");
        System.out.println("7. Raiz Cúbica.");
        System.out.println("8. Módulo.");
        System.out.println("9. Inverso.");
        System.out.println("0. Sair do Programa.");

        System.out.print("Digite a operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o número: ");
        float numero = scanner.nextFloat();
        
        switch (operacao) {
            case 1:
                System.out.println("O dobro de " + numero + " é " + calcularDobro(numero));
                break;
            case 2:
                System.out.println("O triplo de " + numero + " é " + calcularTriplo(numero));
                break;
            case 3:
                System.out.println("A metade de " + numero + " é " + calcularMetade(numero));
                break;
            case 4:
                System.out.println("O quadrado de " + numero + " é " + calcularQuadrado(numero));
                break;
            case 5:
                System.out.println("O cubo de " + numero + " é " + calcularCubo(numero));
                break;
            case 6:
                System.out.println("A raiz quadrada de " + numero + " é " + calcularRaizQuadrada(numero));
                break;
            case 7:
                System.out.println("A raiz cúbica de " + numero + " é " + calcularRaizCubica(numero));
                break;
            case 8:
                System.out.println("O módulo de " + numero + " é " + calcularModulo(numero));
                break;
            case 9:
                System.out.println("O inverso de " + numero + " é " + calcularInverso(numero));
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Operação " + Integer.toString(operacao) + " inválida!");
                break;
        }
    }
}
