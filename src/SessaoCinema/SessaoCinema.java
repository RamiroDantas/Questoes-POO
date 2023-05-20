package SessaoCinema;

public class SessaoCinema {
    String data;
    String horario;
    String filme;
    Cliente[] assentos;
    public SessaoCinema(String data, String horario, String filme, Integer capacidade){
        this.data = data;
        this.horario = horario;
        this.filme = filme;
        this.assentos = new Cliente[capacidade.intValue()];
    }

    public Boolean reservar(Cliente c, Integer assento){  
        if(this.assentos[assento-1] == null){
            for(int i = 0; i < this.assentos.length; i++){
                if(this.assentos[i] != null){
                    if(this.assentos[i].getCpf() == c.getCpf()){
                        return false;
                    }           
                }
            }

            this.assentos[assento-1] = c;
            return true;
        }
        return false;
    }

    public void cancelar(String cpf){
        for(int i = 0; i < this.assentos.length; i++){
            if(this.assentos[i] != null){
                if(this.assentos[i].getCpf() == cpf){
                    this.assentos[i] = null;
                }
            }
        }
    }

    public String getMapaReservas(){
        String mapaReservas = "";

        for(int i = 0; i < this.assentos.length; i++){
            if(this.assentos[i] != null){
                mapaReservas += i+1 + " ";
            }
        }

        mapaReservas += "Demais assentos devem estar livres";
        return mapaReservas;
    }
}