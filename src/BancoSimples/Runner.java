package BancoSimples;

public class Runner {

    public static void main(final String[] args) {

        Conta minhaConta = new Conta(1001, 200.0);
        System.out.println("saldo esperado = 300, atual = " + minhaConta.emitirSaldo());

        minhaConta.sacar(250.0);
        System.out.println("saldo esperado = 50, atual = " +  minhaConta.emitirSaldo());

        if(minhaConta.sacar(51.0)){
            System.out.println("erro = Saque autorizado");
        } else {
            System.out.println("esperado = Saque não autorizado");
        }

        minhaConta.depositar(500.00);
        System.out.println("saldo esperado = 550, atual = " + minhaConta.emitirSaldo()); 

        if(minhaConta.sacar(150)){
            System.out.println("esperado = Saque autorizado"); 
        } else {
            System.out.println("erro = Saque não autorizado"); 
        }
        
        minhaConta.alterarLimite(50.0);
        System.out.println("saldo esperado = 350, atual = " + minhaConta.emitirSaldo());
        
        if(minhaConta.sacar(400.50)){
            System.out.println("erro = Saque autorizado"); 
        } else {
            System.out.println("esperado = Saque não autorizado"); 
        }

        minhaConta.depositar(50.0);
        System.out.println("saldo esperado = 400, atual = " + minhaConta.emitirSaldo());
    }
}
