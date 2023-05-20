package ContaBancariaControlador;
import java.util.ArrayList;


public class ControladorContas {

    ArrayList<ContaComExtrato> contas = new ArrayList();
    int i = 0;

    public Boolean cadastrarConta(String codigoConta, Double d) {

        int t = 0;
        while(t < i){
            if(contas.get(t).getCodigo() == codigoConta) {
                return false;
            }
            t++;
        }
        ContaComExtrato conta = new ContaComExtrato(codigoConta, d);
        contas.add(i, conta);
        i++;

        return true;
    }

    public Boolean realizarSaque(String codigoConta, Double valor){
        ContaComExtrato conta = this.buscarConta(codigoConta);

        if(conta == null){
            return false;
        }

        Boolean result = conta.sacar(valor);

        return result;
    }

    public Boolean realizarDeposito(String codigoConta, Double valor){
        ContaComExtrato conta = this.buscarConta(codigoConta);

        if(conta == null){
            return false;
        }

        Boolean result = conta.depositar(valor);

        return result;

    }

    public Boolean realizarTransferencia(String contaOrigem, String contaDestino, Double valor){
        ContaComExtrato contaO = this.buscarConta(contaOrigem);
        ContaComExtrato contaD = this.buscarConta(contaDestino);

        if(contaO == null){
            return false;
        }

        if(contaD == null){
            return false;
        }

        Boolean saque = contaO.sacar(valor);

        if(!saque){
            return false;
        }

        Boolean deposito = contaD.depositar(valor);

        if(!deposito){
            return false;
        }

        return true;
    }

    public Double emitirSaldo(String codigoConta){
        ContaComExtrato conta = this.buscarConta(codigoConta);

        if(conta == null){
            return -1.0;
        }

        return conta.emitirSaldo();

    }

    private ContaComExtrato buscarConta(String codigoConta){
        ContaComExtrato item = null;
        int k = 0;

        while(k < i){
            if(contas.get(k).getCodigo() == codigoConta){
                item = contas.get(k);
                break;
            }
            k++;
        }

        return item;
    }


}
