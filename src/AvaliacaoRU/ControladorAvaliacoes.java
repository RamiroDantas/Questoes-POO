package AvaliacaoRU;

public class ControladorAvaliacoes {
    AvaliacaoRU[] avaliacoes = new AvaliacaoRU[50];
    int i = 0;

    public boolean adicionarAvaliacao(AvaliacaoRU avaliacao) {

        if (avaliacao.getData() == "") {
            return false;
        }

        if (avaliacao.getTurno() == "jantar" || avaliacao.getTurno() == "almoco") {
            if (avaliacao.getProteina() == "animal" || avaliacao.getProteina() == "vegetal") {
                if (avaliacao.getNota() >= 1 && avaliacao.getNota() <= 5) {
                    if (avaliacao.getNota() == 1 || avaliacao.getNota() == 2) {
                        if (avaliacao.getComentario() != "") {
                            avaliacoes[i] = avaliacao;
                            i++;
                            return true;
                        } else {
                            return false;
                        }
                    }

                    avaliacoes[i] = avaliacao;
                    i++;
                    return true;
                }
            }
        }

        return false;
    }

    public Double getMediaAvaliacoes() {
        int t = 0;
        Double soma = 0.0;
        Double media = 0.0;
        while (t < i) {
            soma += avaliacoes[t].getNota();
            t++;
        }

        if(i == 0){
            return 0.0;
        }

        media = soma / i;

        return media;
    }

    public Double getMediaAvaliacoesPorProteina(String proteina) {
        int t = 0, k = 0;
        Double soma = 0.0;
        Double media = 0.0;
        while (t < i) {
            if (avaliacoes[t].getProteina() == proteina) {
                soma += avaliacoes[t].getNota();
                k++;
            }
            t++;
        }

        if(k == 0){
            return 0.0;
        }

        media = soma / k;

        return media;
    }

    public Double getMediaAvaliacoesPorTurno(String turno) {
        int t = 0, k = 0;
        Double soma = 0.0;
        Double media = 0.0;
        while (t < i) {
            if (avaliacoes[t].getTurno() == turno) {
                soma += avaliacoes[t].getNota();
                k++;
            }
            t++;
        }

        if(k == 0){
            return 0.0;
        }

        media = soma / k;

        return media;
    }

    public Double getMediaAvaliacoesPorData(String data) {
        int t = 0, k = 0;
        Double soma = 0.0;
        Double media = 0.0;
        while (t < i) {
            if (avaliacoes[t].getData() == data) {
                soma += avaliacoes[t].getNota();
                k++;
            }
            t++;
        }

        if(k == 0){
            return 0.0;
        }

        media = soma / k;

        return media;
    }

    public String getTodosComentarios() {
        int t = 0;
        String resultado = "";
        while (t < i) {
            if (avaliacoes[t].getComentario() != "") {
                resultado += avaliacoes[t].getData() + "-" + avaliacoes[t].getTurno() + "-" + 
                avaliacoes[t].getProteina() + "-" + avaliacoes[t].getNota() + "-" + avaliacoes[t].getComentario() + "\n";
            }
            t++;
        }
        return resultado;
    }

}
