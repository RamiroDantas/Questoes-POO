package PedidoInternet;

public class Runner {

    public static void main(final String[] args) {

        ItemDePedido item1 = new ItemDePedido("101010", "Pendrive", 2, 0.100, 39.90);
        System.out.println("01 valor esperado = 79.8, atual = " + item1.getValorTotal());
        System.out.println("02 peso esperado = 0.2, atual = " + item1.getPesoTotal());

        ItemDePedido item2 = new ItemDePedido("100100", "Impressora", 1, 2950.0, 825.90);
        System.out.println("03 valor esperado = 825.90, atual = " + item2.getValorTotal());
        System.out.println("04 peso esperado = 2950.00, atual = " + item2.getPesoTotal());
        
        Pedido p1 = new Pedido("0000123", "Belem", "PA");
        p1.adicionarItem("101010", "Pendrive", 2, 0.100, 39.90);
        p1.adicionarItem("", "Mouse", 1, 0.200, 10.90); // invalido
        System.out.println("05 valor esperado = 79.8, atual = " + p1.getValorTotal());
        System.out.println("06 frete esperado = 4.0, atual = " + p1.getValorFrete());

        Pedido p2 = new Pedido("0000456", "Palmas", "TO");
        p2.adicionarItem("100100", "Impressora", 1, 2950.0, 825.90);
        System.out.println("07 frete esperado = 73.75, atual = " + p2.getValorFrete());
        p2.adicionarItem("111100", "Kit Teclado/Mouse Developer", 1, 0.5, 239.90);
        System.out.println("08 frete esperado = 0.0, atual = " + p2.getValorFrete());

        
        Pedido p3 = new Pedido("0000456", "Florionopolis", "SC");
        p3.adicionarItem("100110", "Impressora", 1, 2950.0, 825.90);
        System.out.println("09 frete esperado = 73.75, atual = " + p3.getValorFrete());
        p3.adicionarItem("111110", "Kit Teclado/Mouse Developer", 1, 0.5, 239.90);
        System.out.println("10 frete esperado = 0.0, atual = " + p3.getValorFrete());
 
    }
}
