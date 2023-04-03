import java.util.Scanner;
import java.util.Arrays;

/* 
 * Exercício 4 - RH Empresa
 * Aluno: Lucas Garrafielo - Matricula: 20220070609
*/
public class RhEmpresa {
    public static void simularRh(Scanner scanner) {
        System.out.println(
                "\nBem-vindo ao RH da empresa, aqui você pode calcular a média salarial e saber quem ganha acima ou abaixo da média.");

        System.out.print("Digite a quantidade de funcionários: ");
        int numeroDeFuncionarios = scanner.nextInt();

        if (numeroDeFuncionarios <= 0 || numeroDeFuncionarios >= 40) {
            System.out.println("Número de funcionários inválido! Escolha num número entre 1 e 39.");
            return;
        }

        String[] nomes = new String[numeroDeFuncionarios];
        float[] salarios = new float[numeroDeFuncionarios];
        float somaDosSalarios = 0;

        for (int i = 0; i < numeroDeFuncionarios; i++) {
            System.out.print("\nDigite o nome do funcionário: ");
            nomes[i] = scanner.next();

            System.out.print("Digite o salário do funcionário: ");
            salarios[i] = scanner.nextFloat();
            somaDosSalarios += salarios[i];
        }

        // Printar média salarial com duas casas decimais
        System.out
                .println("\nMédia salarial = " + String.format("%.2f", somaDosSalarios / (float) numeroDeFuncionarios));

        String[] funcionariosAcimaDaMedia = new String[numeroDeFuncionarios];
        String[] funcionariosAbaixoDaMedia = new String[numeroDeFuncionarios];

        int j = 0;
        for (int i = 0; i < funcionariosAcimaDaMedia.length; i++) {
            if (salarios[i] > somaDosSalarios / numeroDeFuncionarios) {
                funcionariosAcimaDaMedia[j] = nomes[i];
                j++;
            }
        }

        // "Cortar" o array para não ter valores nulos
        funcionariosAcimaDaMedia = Arrays.copyOfRange(funcionariosAcimaDaMedia, 0, j);

        j = 0;
        for (int i = 0; i < funcionariosAbaixoDaMedia.length; i++) {
            if (salarios[i] < somaDosSalarios / numeroDeFuncionarios) {
                funcionariosAbaixoDaMedia[j] = nomes[i];
                j++;
            }
        }

        // "Cortar" o array para não ter valores nulos
        funcionariosAbaixoDaMedia = Arrays.copyOfRange(funcionariosAbaixoDaMedia, 0, j);

        System.out.println("Funcionários com salário acima da média: ["
                + String.join(", ", funcionariosAcimaDaMedia) + "]");

        System.out.println("Funcionários com salário abaixo da média: ["
                + String.join(", ", funcionariosAbaixoDaMedia) + "]");
    }
}
