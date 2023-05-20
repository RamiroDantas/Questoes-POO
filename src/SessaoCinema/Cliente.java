package SessaoCinema;

public class Cliente {
    private String cpf = null;
    private String telefone = null;

    public Cliente (String cpf, String telefone){
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }
}
