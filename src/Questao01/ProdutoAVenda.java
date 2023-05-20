package Questao01;

public class ProdutoAVenda {

    private String nome;
    private Integer estoque;
    private Double preco;

    public ProdutoAVenda(String nome, Integer estoque, Double preco){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Integer getEstoque(){
        return this.estoque;
    }

    public Double getPreco(){
        return this.preco;
    }

    public Double getValorDoEstoque(){
        return this.estoque * this.preco;
    }

    public Boolean removerEstoque(){
        if(getEstoque() > 0){
            this.estoque--;
            return true;
        }
        return false;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void adicionarEstoque(Integer estoque){
        this.estoque += estoque;
    }
}
