package VendaSimples;

public class ItemDeVenda {

    private String codigo;
    private String descricao;
    private Double quantidade;
    private String unidade;
    private Double valorUnitario;

    public ItemDeVenda(String codigo, String descricao, double quantidade, String unidade, double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }

    public String imprimir(){
        return this.codigo + " " + this.descricao + " " + this.quantidade + " " + this.unidade + " " +
        this.valorUnitario + " " + this.getValorTotal() + "\n";
    }

    public Double getValorTotal(){
        Double valorTotal = 0.0;
        valorTotal = this.quantidade * this.valorUnitario;
        return valorTotal;
    }    

}
