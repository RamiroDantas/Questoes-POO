package BancoSimplesExtrato;

public class ContaComExtrato {
    int codigo;
    Double saldo = 0.00;
    Double limite;
    Double[] extrato;
    int i = 0;


    public ContaComExtrato(int i, double d) {
        codigo = i;
        limite = 100.00;
        extrato = new Double[20];
        this.depositar(d);
    }

    public Double emitirSaldo() {
        return (saldo + limite);
    }

    public boolean sacar(double d) {
        if(d <= (saldo + limite)){
            saldo -= d;
            extrato[this.i] = -d;
            i++;
            return true;
        } 

        return false;
    }

    public void depositar(double d) {
        if(d > 0) {
            saldo += d;
            extrato[this.i] = d;
            i++;
        } 
    }

    public void alterarLimite(double d) {
        limite = d;
    }

    public Double[] emitirExtrato() {
        return extrato;
    }
    
}
