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
                Tabuada tabuada = new Tabuada();
                tabuada.fazerTabuada(scanner);
                break;
            case 2:
                EleicaoSindical eleicaoSindical = new EleicaoSindical();
                eleicaoSindical.simularEleicao(scanner);
                break;
            case 3:
                CensoAltura censoAltura = new CensoAltura();
                censoAltura.simularCenso();
                break;
            /* case 4:
                RHEmpresa rhEmpresa = new RHEmpresa();
                rhEmpresa.cadastrarFuncionario();
                break;
            case 5:
                ClubeCampo clubeCampo = new ClubeCampo();
                clubeCampo.cadastrarMembro();
                break;
            case 6:
                Calculadora calculadora = new Calculadora();
                calculadora.calcular();
                break;
            case 7:
                OperacoesMatrizes operacoesMatrizes = new OperacoesMatrizes();
                operacoesMatrizes.operarMatrizes();
                break;
            case 8:
                Anagrama anagrama = new Anagrama();
                anagrama.verificarAnagrama();
                break; */
            default:
                System.out.println("Questão " + Integer.toString(questao) + " inválida!");
                break;
        }
    }
}