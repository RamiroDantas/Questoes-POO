package PedidoInternet;

import java.util.ArrayList;

public class Pedido {
    String numeroPedido;
    String cidade;
    String estado;
    int i = 0;

    ArrayList<ItemDePedido> items = new ArrayList();

    public Pedido(String numeroPedido, String cidade, String estado) {
        this.numeroPedido = numeroPedido;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String adicionarItem(String codigo, String descricao, int quantidade, double peso, double valorUnitario) {
        if (quantidade > 0) {
            if (valorUnitario > 0) {
                if (peso > 0) {
                    if (codigo != "" && descricao != "") {
                        ItemDePedido item = new ItemDePedido(codigo, descricao, quantidade, peso, valorUnitario);
                        items.add(i, item);
                        i++;
                    }
                }
            }
        }

        return null;
    }

    public Double getValorFrete() {
        if (this.getValorTotal() >= 1000.00) {
            return 0.0;
        }


        Double frete = 0.0;
        Double pesoTotal = 0.0;
        int valorPesoFrete = 0;

        for (int t = 0; t < i; t++) {
            pesoTotal += items.get(t).getPesoTotal();
        }

        if (this.estado == "SC" || this.estado == "PR" || this.estado == "RS") {
            valorPesoFrete = 30;
        }

        if (this.estado == "DF" || this.estado == "GO" || this.estado == "MT" || this.estado == "MS"
                || this.estado == "ES" || this.estado == "MG" || this.estado == "RJ" || this.estado == "SP") {
            valorPesoFrete = 25;
        }

        if (this.estado == "CE" || this.estado == "RN" || this.estado == "MA" || this.estado == "BA"
                || this.estado == "AC" || this.estado == "PA" || this.estado == "PB" || this.estado == "PE"
                || this.estado == "PI" || this.estado == "RO" || this.estado == "RR" || this.estado == "SE"
                || this.estado == "TO") {
            valorPesoFrete = 20;
        }


        frete = (pesoTotal * valorPesoFrete);

        return frete;

    }

    public Double getValorTotal() {
        int k = 0;
        Double soma = 0.0;

        while (k < i) {
            soma += items.get(k).getValorTotal();
            k++;
        }

        return soma;

    }

}
