package Questao03;
import java.util.ArrayList;


public class MinhasFinancas {
    String nome;
    ArrayList<Lancamento> lancamentos = new ArrayList();
    private int i = 0;

    public MinhasFinancas(String nome) {
        this.nome = nome;
    }

    public boolean adicionarReceita(String desc, double valor) {
        if(desc == "" || valor <= 0){
            return false;
        }

        Lancamento item = new Lancamento(desc, valor, true);

        lancamentos.add(i, item);
        i++;

        return true;
    }

    public boolean adicionarDespesa(String desc, double valor) {

        if(desc == "" || valor <= 0){
            return false;
        }

        Lancamento item = new Lancamento(desc, valor, false);

        lancamentos.add(i, item);
        i++;

        return true;
    }

    public Double getSaldoGeral() {
        Double soma = 0.0;
        int k = 0;

        while(k < i){
            if(lancamentos.get(k).getTipo() == true){
                soma += lancamentos.get(k).getValor();
            } else {
                soma -= lancamentos.get(k).getValor();
            }
            k++;
        }

        return soma;
    }

    public Double getTotalReceitas() {
        Double soma = 0.0;
        int k = 0;

        while(k < i){
            if(lancamentos.get(k).getTipo() == true){
                soma += lancamentos.get(k).getValor();
            }
            k++;
        }

        return soma;
    }

    public Double getTotalDespesas() {
        Double soma = 0.0;
        int k = 0;

        while(k < i){
            if(lancamentos.get(k).getTipo() == false){
                soma += lancamentos.get(k).getValor();
            }
            k++;
        }

        return soma;
    }

}
