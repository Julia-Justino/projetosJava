package school.sptech;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno aluno = new Aluno("001", "João");
        aluno.adicionarNota( 10.0 );
        aluno.adicionarNota( 5.0 );
       aluno.calcularMedia();
        turma.adicionarAluno( aluno );
        //System.out.println(aluno.toString());

        Aluno aluno2 = new Aluno( "002", "José luióz" );

        aluno2.adicionarNota( 10.0 );
        aluno2.adicionarNota( 15.0 );
        aluno2.calcularMedia();
        turma.adicionarAluno( aluno2 );
      //  System.out.println(turma.toString());

        //System.out.println( turma.getAlunoPorRa( "001" ));
       // System.out.println(turma.getAlunoPorNome( "José"));
       // System.out.println(turma.getAlunoComMaiorMedia());
      //  System.out.println(turma.getAlunoComMenorMedia());
        //System.out.println(turma.getMediaPorRa( "001" ));
       // System.out.println(turma.calcularMediaDaTurma());
        //System.out.println(turma.getMediana());
      //  System.out.println( turma.toString());

    }
}