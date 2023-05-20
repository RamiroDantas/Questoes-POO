package CartaoRu;

public class CartaoRU {
    String idCartao, siapeDiscente;
    boolean isencao;
    Double saldo = 0.00;

    
    public CartaoRU(String idCartao, String siapeDiscente, boolean isencao) {
        this.idCartao = idCartao;
        this.siapeDiscente = siapeDiscente;
        this.isencao = isencao;
    }


    public void recarregar(double d) {
        if(d > 0.00){
            this.saldo =  this.saldo + d;
        }
    }

    public boolean fazerRefeicao(){

        
        if (this.saldo >= 1.10 && this.isencao == false){
            this.saldo = this.saldo - 1.10;

            if(this.saldo < 0.00){
                this.saldo = 0.00;
            }

            return true;
        } else if (this.isencao == true) {

            if(this.saldo < 0.00){
                this.saldo = 0.00;
            }
            return true;
        } else  {

            if(this.saldo < 0.00){
                this.saldo = 0.00;
            }
            return false;
        }
        
    }

    public Double emitirSaldo() {
        return saldo;
    }

    public void alterarIsencao (Boolean isencao) {
        this.isencao = isencao;
    }
    
}
