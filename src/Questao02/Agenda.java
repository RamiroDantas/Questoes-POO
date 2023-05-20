package Questao02;
import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList();
    private int i = 0;

    public Agenda(){
        
    }

    public Boolean adicionar(Contato c){
        int k = 0;
        while(k < i){
            if(contatos.get(k).getNome() == c.getNome()){
                return false;
            }
            k++;
        }

        contatos.add(i, c);
        i++;

        return true;
    }

    public String getTelefone(String nome){
        Contato contato = buscar(nome);

        if(contato == null){
            return "nao existe";
        }

        return contato.getTelefone();
    }

    public Integer getTotalContatos() {
        return i;
    }

    private Contato buscar(String nome){
        Contato item = null;
        int k = 0;

        while(k < i){
            if(contatos.get(k).getNome() == nome){
                item = contatos.get(k);
                break;
            }
            k++;
        }

        return item;
    }
}
