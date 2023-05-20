package Questao03;

public class Runner {

	public static void main(final String[] args) {

        MinhasFinancas m1 = new MinhasFinancas("Fulano");

        m1.adicionarReceita("salario", 3599.90);
        m1.adicionarDespesa("roupas", 139.90);
        m1.adicionarDespesa("farmacia", 202.00);
        m1.adicionarReceita("lucro acoes", 159.90);
        m1.adicionarDespesa("plano saude", 345.00);
        m1.adicionarDespesa("aluguel", 740.00);

        System.out.println("esperado = 2332.9, retornado = " + m1.getSaldoGeral());
        System.out.println("esperado = 3759.8, retornado = " + m1.getTotalReceitas());
        System.out.println("esperado = 1426.9, retornado = " + m1.getTotalDespesas());

        if(m1.adicionarDespesa("", 10.0)){
            System.out.println("erro - lancamento sem descricao");
        }
        if(m1.adicionarReceita("", 10.0)){
            System.out.println("erro - lancamento sem descricao");
        }
        if(m1.adicionarReceita("restaurante", 0.0)){
            System.out.println("erro - lancamento menor ou igual a zero");
        }
        if(m1.adicionarDespesa("restaurante", -10.0)){
            System.out.println("erro - lancamento menor ou igual a zero");
        }

    }
}
