import java.util.Scanner;

public class OperacoesMatrizes {
    private static void mediaAritmeticaAbaixoDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        int qtdElementos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > j) {
                    soma += matriz[i][j];
                    qtdElementos++;
                }
            }
        }

        System.out.println("Média aritmética dos elementos abaixo da diagonal principal: " + Double.toString((double) soma / qtdElementos));
    }

    private static void somaElementosAcimaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos acima da diagonal principal: " + Integer.toString(soma));
    }

    private static void mediaAritmeticaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Média aritmética dos elementos da diagonal principal: " + Double.toString((double) soma / matriz.length));
    }

    private static void menorElementoMatriz(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Menor elemento da matriz: " + Integer.toString(menor));
    }
    
    private static void somaElementosMatriz(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos da matriz: " + Integer.toString(soma));
    }

    public static void operarMatrizes(Scanner scanner) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + Integer.toString(i) + "][" + Integer.toString(j) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        mediaAritmeticaAbaixoDiagonalPrincipal(matriz);
        somaElementosAcimaDiagonalPrincipal(matriz);
        mediaAritmeticaDiagonalPrincipal(matriz);
        menorElementoMatriz(matriz);
        somaElementosMatriz(matriz);        
    }
}
