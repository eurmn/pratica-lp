import java.util.Scanner;

public class EleicaoSindical {
    public void simularEleicao(Scanner scanner) {
        System.out.println("\nBem-vindo às eleições sindicais, aqui encontram-se 3 candidatos: A, B e C.");
        
        System.out.print("Digite a quantidade de votos para o candidato A: ");
        int votosA = scanner.nextInt();
        
        System.out.print("Digite a quantidade de votos para o candidato B: ");
        int votosB = scanner.nextInt();

        System.out.print("Digite a quantidade de votos para o candidato C: ");
        int votosC = scanner.nextInt();

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        scanner.close();

        int votosValidos = votosA + votosB + votosC;
        int votosTotais = votosValidos + votosNulos + votosBrancos;

        System.out.println("\nHouveram " + Integer.toString(votosValidos) + " votos válidos.");
        System.out.println("Houveram " + Integer.toString(votosTotais) + " votos totais.");

        System.out.println("\nO candidato A obteve [" + Integer.toString(votosA * 100 / votosTotais) + "%] dos votos.");
        System.out.println("O candidato B obteve [" + Integer.toString(votosB * 100 / votosTotais) + "%] dos votos.");
        System.out.println("O candidato C obteve [" + Integer.toString(votosC * 100 / votosTotais) + "%] dos votos.");

        System.out.println("\nOs votos nulos equivalem a [" + Integer.toString(votosNulos * 100 / votosTotais) + "%] dos votos.");
        System.out.println("Os votos brancos equivalem a [" + Integer.toString(votosBrancos * 100 / votosTotais) + "%] dos votos.");
    }
}