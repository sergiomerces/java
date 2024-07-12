package variavel;

public class Variavel {
    public static void main(String[] args) {

        //Tipos de Dados

        String nomeCompleto = "Sérgio da Costa Mercês";
        char sexo = 'M';
        byte idade = 44;
        final int ANO_DE_NASCIMENTO = 1979;
        float altura = 1.70f;
        float peso = 92.4f;
        double rendaAnual = 42900.00;
        boolean destro = false;
        //Date dataAdmissao = new Date();

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascimento: " + ANO_DE_NASCIMENTO);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Renda Anual: R$ " + rendaAnual);
        System.out.println("Destro: " + destro);
    }
}
