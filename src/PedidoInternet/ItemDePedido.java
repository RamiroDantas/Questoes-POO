package PedidoInternet;

public class ItemDePedido {
    private String codigo;
    private String descricao;
    private int quantidade;
    private Double peso;
    private Double valorUnitario;

    public ItemDePedido(String codigo, String descricao, int quantidade, double peso, double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.peso = peso;
        this.valorUnitario = valorUnitario;
    }

    public Double getPesoTotal() {
        return this.peso * this.quantidade;
    }

    public Double getValorTotal() {
        return this.quantidade * this.valorUnitario;
    }

}
