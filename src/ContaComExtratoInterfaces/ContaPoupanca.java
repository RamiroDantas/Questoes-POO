package ContaComExtratoInterfaces;

public class ContaPoupanca implements Conta {
    private String codigo;
    Double saldo = 0.00;
    Double[] extrato;
    int i = 0;

    public ContaPoupanca(String i, double d) {
        codigo = i;
        extrato = new Double[20];
        this.depositar(d);
    }

    public Double emitirSaldo() {
        return saldo;
    }

    public Boolean sacar(double d) {
        if (d <= saldo) {
            saldo -= d;
            extrato[this.i] = -d;
            i++;
            return true;
        }

        return false;
    }

    public Boolean depositar(double d) {
        if (d > 0) {
            saldo += d;
            extrato[this.i] = d;
            i++;
            return true;
        }
        return false;
    }

    public void alterarLimite(double d) {

    }

    public Double[] emitirExtrato() {
        return extrato;
    }

    public String getCodigo() {
        return this.codigo;
    }

}
