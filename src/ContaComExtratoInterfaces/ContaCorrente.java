package ContaComExtratoInterfaces;

public class ContaCorrente implements Conta {
    private String codigo;
    Double saldo = 0.00;
    Double limite;
    Double[] extrato;
    int i = 0;


    public ContaCorrente(String i, double d) {
        codigo = i;
        limite = 100.00;
        extrato = new Double[20];
        this.depositar(d);
    }

    public Double emitirSaldo() {
        return (saldo + limite);
    }

    public Boolean sacar(double d) {
        if(d <= (saldo + limite)){
            saldo -= d;
            extrato[this.i] = -d;
            i++;
            return true;
        } 

        return false;
    }

    public Boolean depositar(double d) {
        if(d > 0) {
            saldo += d;
            extrato[this.i] = d;
            i++;
            return true;
        } 
        return false;
    }

    public void alterarLimite(double d) {
        limite = d;
    }

    public Double[] emitirExtrato() {
        return extrato;
    }

    public String getCodigo(){
        return this.codigo;
    }
    
}
