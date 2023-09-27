package school.sptech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Aluno {
    private List<Double> listaNota;
    private  Double media = 0.0;
    private String ra;
    private String nome;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.listaNota = new ArrayList<Double>();
        this.media = media;
    }
    public void adicionarNota(Double nota) {
        listaNota.add( nota );
    }
    public List<Double> getListaNota() {
        return listaNota;
    }
    public  Double calcularMedia( ){
        for (Double i : listaNota){
            media += i;
        }
        media = media/listaNota.size();
        return  media;
    }

    public Double getMedia() {
        return media;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }



    @Override
    public String toString() {
        return """
             
             Aluno {
                        RA = %s,
                        Nome = %s,
                        Notas %s,
                        Média: %.2f
                }
                """.formatted( ra, nome, listaNota, media );
    }
}
