package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno>alunos;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }
//**************************************************************************
    public void adicionarAluno(Aluno aluno) {alunos.add( aluno );}
    public Aluno getAlunoPorRa(String ra) {
        Boolean achou = false;
        for (Aluno alunoVez : alunos){
            if (ra.equalsIgnoreCase( alunoVez.getRa() )){
                achou = true;
                return alunoVez;
            }
        }
        return null;
    }
    public List getAlunoPorNome(String nome) {
        Boolean achou = false;
        List <Aluno> aluno = new ArrayList<Aluno>();
        for (Aluno alunoVez : alunos){
            if (alunoVez.getNome().contains( nome )){
                achou = true;
                aluno.add( alunoVez );
                return aluno;}
        }
        return aluno ;
    }
    public Aluno getAlunoComMaiorMedia(){
        Double media = 0.0;
       Aluno alunoMaior = null;
        for (Aluno alunoVez : alunos){
            if(alunoVez.getMedia() > media){
                media = alunoVez.getMedia();
                alunoMaior = alunoVez;
            }
        }
        if (!media.equals( 0.0 )){
            return alunoMaior;
        }
        return null;
    }

    public Aluno  getAlunoComMenorMedia(){
        Double media = 0.0;
        Aluno alunoMenor = null;
        for (Aluno alunoVez : alunos){
            if(alunoVez.getMedia() > media){
                media = alunoVez.getMedia();
            }
        }
        for (Aluno alunoVez : alunos){
            if(alunoVez.getMedia() < media){
                media = alunoVez.getMedia();
                alunoMenor = alunoVez;
            }
        }
        if (!media.equals( 0.0 )){
            return alunoMenor;
        }
        return null;
    }
    public Double calcularMediaDaTurma(){
        Double mediaFinal = 0.0;
        for (Aluno alunoVez : alunos){
            mediaFinal += alunoVez.getMedia();
        }
        System.out.println(alunos);
        mediaFinal= mediaFinal/alunos.size();
      if (!mediaFinal.isNaN()){
          return mediaFinal;
      }else{
          return 0.0;
      }
    }
    public double getMediaPorRa(String ra) {
        Boolean achou = false;
        Double media= 0.0;
        for (Aluno alunoVez : alunos){
            if (ra.equalsIgnoreCase( alunoVez.getRa() )){
                achou = true;
                media = alunoVez.calcularMedia();
            }

        }
        if (!achou.equals( false )){
           return  media;
        }else{
            return  0.0;
        }
    }
    public Double getMediana(){
        if (this.alunos.isEmpty()) {
            return 0.0;
        }
        List <Double> mediaFinal = new ArrayList<Double>();
        for (Aluno alunoVez: alunos){
            mediaFinal.add( alunoVez.getMedia() );
        }
        Integer meio = mediaFinal.size() / 2;
        if (mediaFinal.size()%2 == 1){
            return mediaFinal.get( meio );
        }else {
            return (mediaFinal.get( meio ) + mediaFinal.get( meio - 1 )) / 2;
        }
    }

    @Override
    public String toString() {
        return "\n" +
                "\n Turma {" +
                "\n  Alunos=" + alunos +
                '}';
    }
}
