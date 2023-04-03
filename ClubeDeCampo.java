import java.util.Scanner;

/* 
 * Exercício 5 - Clube de Campo
 * Aluno: Lucas Garrafielo - Matricula: 20220070609
*/
public class ClubeDeCampo {
    public static void cadastrarFrequentadores(Scanner scanner) {
        System.out.print("\nDigite o número de frequentadores: ");
        int numeroDeFrequentadores = scanner.nextInt();

        if (numeroDeFrequentadores < 1 || numeroDeFrequentadores > 10) {
            System.out.println("Número de frequentadores inválido! Escolha num número entre 1 e 10.");
            return;
        }

        int[] id = new int[numeroDeFrequentadores];
        float[] alt = new float[numeroDeFrequentadores];

        for (int i = 0; i < numeroDeFrequentadores; i++) {
            System.out.print("\nDigite a idade do frequentador: ");
            id[i] = scanner.nextInt();

            System.out.print("Digite a altura do frequentador: ");
            alt[i] = scanner.nextFloat();
        }

        float faixa1Total = 0;
        int faixa1Count = 0;

        float faixa2Total = 0;
        int faixa2Count = 0;

        float faixa3Total = 0;
        int faixa3Count = 0;

        float faixa4Total = 0;
        int faixa4Count = 0;

        for (int i = 0; i < numeroDeFrequentadores; i++) {
            if (id[i] <= 10) {
                faixa1Total += alt[i];
                faixa1Count++;
            } else if (id[i] <= 15) {
                faixa2Total += alt[i];
                faixa2Count++;
            } else if (id[i] <= 21) {
                faixa3Total += alt[i];
                faixa3Count++;
            } else {
                faixa4Total += alt[i];
                faixa4Count++;
            }
        }

        if (faixa1Count == 0)
            System.out.println("Não há frequentadores na faixa etária 1.");
        else
            System.out.println("A média de altura da faixa etária 1 é: " + faixa1Total / (float)faixa1Count);

        if (faixa2Count == 0)
            System.out.println("Não há frequentadores na faixa etária 2.");
        else
            System.out.println("A média de altura da faixa etária 2 é: " + faixa2Total / (float)faixa2Count);
        
        if (faixa3Count == 0)
            System.out.println("Não há frequentadores na faixa etária 3.");
        else
            System.out.println("A média de altura da faixa etária 3 é: " + faixa3Total / (float)faixa3Count);
        
        if (faixa4Count == 0)
            System.out.println("Não há frequentadores na faixa etária 4.");
        else
            System.out.println("A média de altura da faixa etária 4 é: " + faixa4Total / (float)faixa4Count);
    }
}
