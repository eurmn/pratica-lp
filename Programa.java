import java.util.Scanner;

/* 
 * Exercício 2 - Eleição Sindical
 * Aluno: Lucas Garrafielo - Matricula: 20220070609
*/
public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual questão deseja executar:");
        System.out.println("1. Tabuada.");
        System.out.println("2. Eleição Sindical;");
        System.out.println("3. Censo Altura.");
        System.out.println("4. RH Empresa.");
        System.out.println("5. Clube de Campo.");
        System.out.println("6. Calculadora.");
        System.out.println("7. Operações Matrizes.");
        System.out.println("8. Anagrama");

        System.out.print("Digite a questão: ");
        int questao = scanner.nextInt();

        switch (questao) {
            case 1:
                Tabuada.fazerTabuada(scanner);
                break;
            case 2:
                EleicaoSindical.simularEleicao(scanner);
                break;
            case 3:
                CensoAltura.simularCenso();
                break;
            case 4:
                RhEmpresa.simularRh(scanner);
                break;
            case 5:
                ClubeDeCampo.cadastrarFrequentadores(scanner);
                break;
            case 6:
                Calculadora.iniciarCalculadora(scanner);
                break;
            case 7:
                OperacoesMatrizes.operarMatrizes(scanner);
                break;
            case 8:
                Anagrama.verificarAnagrama(scanner);
                break;
            default:
                System.out.println("Questão " + Integer.toString(questao) + " inválida!");
                break;
        }
        scanner.close();
    }
}