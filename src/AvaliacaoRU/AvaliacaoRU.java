package AvaliacaoRU;

public class AvaliacaoRU {

    private String data;
    private String turno;
    private String proteina;
    private int nota;
    private String comentario;

    public AvaliacaoRU(String data, String turno, String proteina, int nota, String comentario) {
        this.data = data;
        this.turno = turno;
        this.proteina = proteina;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getData(){
        return this.data;
    }

    public String getTurno(){
        return this.turno;
    }

    public String getProteina(){
        return this.proteina;
    }

    public Integer getNota(){
        return this.nota;
    }

    public String getComentario(){
        return this.comentario;
    }

}
