package VendaSimples;

import java.util.ArrayList;

public class Venda {

    ArrayList<ItemDeVenda> items = new ArrayList();
    String numeroNotaFiscal;
    int itemsTotal = 0;

    public Venda(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public void adicionarItem(String codigo, String descricao, double quantidade, String unidade,
            double valorUnitario) {

        if (quantidade > 0) {
            if (valorUnitario > 0) {
                if (codigo != "" && descricao != "" && unidade != "") {
                    ItemDeVenda item = new ItemDeVenda(codigo, descricao, quantidade, unidade, valorUnitario);
                    this.items.add(itemsTotal, item);
                    itemsTotal++;
                }
            }
        }

    }

    public Double getValorTotal() {
        int k = 0;
        Double soma = 0.0;

        while (k < itemsTotal) {
            soma += items.get(k).getValorTotal();
            k++;
        }

        if(itemsTotal == 0){
            return 0.0;
        }

        return soma;

    }

    public String imprimir(){
        int k = 0;
        String notaFiscal = "";
        while(k < itemsTotal){
            notaFiscal += items.get(k).imprimir();
            k++;
        }

        notaFiscal += "Valor total " + this.getValorTotal() + "\n" + "Notal fiscal " + numeroNotaFiscal + "\n";

        return notaFiscal;
    }

}
