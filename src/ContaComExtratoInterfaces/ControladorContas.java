package ContaComExtratoInterfaces;

import java.util.ArrayList;

public class ControladorContas {

    ArrayList<Conta> contas;
    int i = 0;

    public ControladorContas() {
        this.contas = new ArrayList<Conta>();
    }

    public Boolean cadastrarContaCorrente(String codigoConta, Double d) {
        if (this.buscarConta(codigoConta) == null) {
            Conta conta = new ContaCorrente(codigoConta, d);
            contas.add(i, conta);
            i++;
            return true;
        }

        return false;
    }

    public Boolean cadastrarContaPoupança(String codigoConta, Double d) {
        if (this.buscarConta(codigoConta) == null) {
            Conta conta = new ContaPoupanca(codigoConta, d);
            contas.add(i, conta);
            i++;
            return true;
        }
        return false;
    }

    public Boolean realizarSaque(String codigoConta, Double valor) {
        Conta conta = this.buscarConta(codigoConta);

        if (conta == null) {
            return false;
        }

        Boolean result = conta.sacar(valor);

        return result;
    }

    public Boolean realizarDeposito(String codigoConta, Double valor) {
        Conta conta = this.buscarConta(codigoConta);

        if (conta == null) {
            return false;
        }

        Boolean result = conta.depositar(valor);

        return result;

    }

    public Boolean realizarTransferencia(String contaOrigem, String contaDestino, Double valor) {
        Conta contaO = this.buscarConta(contaOrigem);
        Conta contaD = this.buscarConta(contaDestino);

        if (contaO == null) {
            return false;
        }

        if (contaD == null) {
            return false;
        }

        Boolean saque = contaO.sacar(valor);

        if (!saque) {
            return false;
        }

        Boolean deposito = contaD.depositar(valor);

        if (!deposito) {
            return false;
        }

        return true;
    }

    public Double emitirSaldo(String codigoConta) {
        Conta conta = this.buscarConta(codigoConta);

        if (conta == null) {
            return -1.0;
        }

        return conta.emitirSaldo();

    }

    private Conta buscarConta(String codigoConta) {

        for (Conta c : this.contas) {
            if (c.getCodigo() == codigoConta) {
                return c;
            }
        }

        return null;
    }

}
