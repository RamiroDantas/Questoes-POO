package ContaComExtratoInterfaces;

public interface Conta {

    public void alterarLimite(double d);
    public Boolean depositar(double valor);
    public Double emitirSaldo();
    public Boolean sacar(double valor);
    public Double[] emitirExtrato();
    public String getCodigo();
}


