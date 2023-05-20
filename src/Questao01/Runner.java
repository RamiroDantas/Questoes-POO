package Questao01;

public class Runner {
	public static void main(final String[] args) {

        ProdutoAVenda p1 = new ProdutoAVenda("xilitos",10,2.30);
        System.out.println("esperado = 2.30, atual = " + p1.getPreco());
        System.out.println("esperado = 10, atual = " + p1.getEstoque());
        System.out.println("esperado = 23.0, atual = " + p1.getValorDoEstoque());
        System.out.println("esperado = true, atual = " + p1.removerEstoque());
        System.out.println("esperado = 9, atual = " + p1.getEstoque());

        ProdutoAVenda p2 = new ProdutoAVenda("chiclete",2,4.50);
        System.out.println("esperado = true, atual = " + p2.removerEstoque());
        System.out.println("esperado = true, atual = " + p2.removerEstoque());
        System.out.println("esperado = false, atual = " + p2.removerEstoque());
        System.out.println("esperado = 0, atual = " + p2.getEstoque());

        ProdutoAVenda p3 = new ProdutoAVenda("biscoito",20,1.50);
        System.out.println("esperado = 30.0, atual = " + p3.getValorDoEstoque());
        System.out.println("esperado = true, atual = " + p3.removerEstoque());
        System.out.println("esperado = true, atual = " + p3.removerEstoque());
        p3.setPreco(1.90);
        System.out.println("esperado = 34.2, atual = " + p3.getValorDoEstoque());

        ProdutoAVenda p4 = new ProdutoAVenda("bombom",1,10.50);
        System.out.println("esperado = 10.50, atual = " + p4.getValorDoEstoque());
        p4.adicionarEstoque(11);
        System.out.println("esperado = 126.0, atual = " + p4.getValorDoEstoque());

    }
}
