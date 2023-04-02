class Pessoa {
    private int idade;
    private double altura;
    private char genero;

    public Pessoa(char genero, int idade, double altura) {
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }

    public String getGeneroString() {
        return genero == 'M' ? "masculino" : "feminino";
    }
}

public class CensoAltura {
    public void simularCenso() {
        Pessoa[] pessoas = new Pessoa[] {
            new Pessoa('M', 20, 1.80),
            new Pessoa('F', 19, 1.60),
            new Pessoa('M', 6, 1.00),
            new Pessoa('M', 21, 1.75),
            new Pessoa('F', 18, 1.65),
            new Pessoa('F', 6, 1.15),
            new Pessoa('M', 22, 1.90),
            new Pessoa('M', 23, 1.85),
            new Pessoa('F', 24, 1.70),
            new Pessoa('F', 7, 1.05),
            new Pessoa('M', 25, 1.95),
            new Pessoa('F', 26, 1.55),
            new Pessoa('M', 7, 1.10),
            new Pessoa('M', 27, 1.66),
            new Pessoa('F', 28, 1.61),
            new Pessoa('M', 7, 1.20),
            new Pessoa('M', 11, 1.40),
            new Pessoa('F', 30, 1.75),
            new Pessoa('M', 31, 1.90),
            new Pessoa('F', 7, 1.25)
        };

        Pessoa maiorPessoa = pessoas[0];
        Pessoa menorPessoa = pessoas[0];

        int somaAlturaMulheres = 0;
        int quantidadeMulheres = 0;
        int somaAlturaHomens = 0;
        int quantidadeHomens = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getAltura() > maiorPessoa.getAltura()) {
                maiorPessoa = pessoa;
            }
            if (pessoa.getAltura() < menorPessoa.getAltura()) {
                menorPessoa = pessoa;
            }

            if (pessoa.getGenero() == 'F') {
                somaAlturaMulheres += pessoa.getAltura();
                quantidadeMulheres++;
            } else {
                somaAlturaHomens += pessoa.getAltura();
                quantidadeHomens++;
            }
        }

        int totalPessoas = quantidadeHomens + quantidadeMulheres;

        System.out.print("\n");
        System.out.println("A maior pessoa (" + maiorPessoa.getAltura() + "m) é do sexo " + maiorPessoa.getGeneroString() + " e tem " + maiorPessoa.getIdade() + " anos.");
        System.out.println("A menor pessoa (" + menorPessoa.getAltura() + "m) é do sexo " + menorPessoa.getGeneroString() + " e tem " + menorPessoa.getIdade() + " anos.");

        System.out.println("A média de altura das mulheres é " + (somaAlturaMulheres / quantidadeMulheres) + " metro(s).");
        System.out.println("A média de altura dos homens é " + (somaAlturaHomens / quantidadeHomens) + " metro(s).");

        System.out.println("O número de mulheres é " + quantidadeMulheres + ".");
        System.out.println("O número de homens é " + quantidadeHomens + ".");

        System.out.println("A porcentagem de mulheres é " + (quantidadeMulheres * 100 / totalPessoas) + "%.");
        System.out.println("A porcentagem de homens é " + (quantidadeHomens * 100 / totalPessoas) + "%.");
    }
}
