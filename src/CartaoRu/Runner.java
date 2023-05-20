package CartaoRu;

public class Runner {
    public static void main(final String[] args) {

        CartaoRU meuCartao = new CartaoRU("001", "123456", false);
        System.out.println("saldo esperado = 0.0, atual = " + meuCartao.emitirSaldo());

        Boolean resultado = meuCartao.fazerRefeicao();

        if (resultado) {
            System.out.println("erro - Refeição liberada. Saldo restante = " + meuCartao.emitirSaldo());
        } else {
            System.out.println("esperado - Refeição recusada. Saldo atual = " + meuCartao.emitirSaldo());
        }

        meuCartao.recarregar(2.00);

        resultado = meuCartao.fazerRefeicao();

        if (resultado) {
            System.out.println("esperado - Refeição liberada. Saldo restante = 0.90, atual = " + meuCartao.emitirSaldo());
        } else {
            System.out.println("erro - Refeição recusada. Saldo atual = " + meuCartao.emitirSaldo());
        }

        resultado = meuCartao.fazerRefeicao();


        if (resultado) {
            System.out.println("erro - Refeição liberada. Saldo restante = " + meuCartao.emitirSaldo());
        } else {
            System.out
                    .println("esperado - Refeição recusada. Saldo esperado = 0.90, atual = " + meuCartao.emitirSaldo());
        }

        CartaoRU meuCartao2 = new CartaoRU("002", "654321", true);

        meuCartao2.recarregar(1.10);
        meuCartao2.alterarIsencao(false);

        
        resultado = meuCartao2.fazerRefeicao();


        if (resultado) {
            System.out.println(
                    "esperado - Refeição liberada. Saldo esperado = 1.10, atual = " + meuCartao2.emitirSaldo());
        } else {
            System.out.println("erro - Refeição recusada (deveria permitir para isentos)");
        }

    }
}
