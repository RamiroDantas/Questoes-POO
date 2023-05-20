package BancoSimples;

public class Conta {
    int codigoConta;
    Double saldo;
    Double limite;
    public Conta(int i, double d) {
        codigoConta = i;
        saldo = d;
        limite = 100.0;

    }
    public boolean sacar(double d) {
        if(d <= (saldo + limite)){
            saldo -= d;
            return true;
        } 

        return false;
    }
    public void depositar(Double i) {
        saldo += i;
    }
    public void alterarLimite(double d) {
        limite = d;
    }
    public Double emitirSaldo() {
        return (saldo + limite);
    }

    
}
