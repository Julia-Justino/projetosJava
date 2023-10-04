package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Faculdade {

  private String nome;
  private List<Aluno> alunos = new ArrayList<Aluno>();

  public Faculdade(String nome) {
  }

  /*
      Deve verificar se existe um aluno com o nome informado, caso não exista,
      retorne false;
  */
  public Boolean existsAlunoPorNome(String nome) {
    Boolean achou = false;
    if  (nome == null){
      return false;
    }
    for (Aluno alunoVez : alunos){
      if (nome.equalsIgnoreCase( alunoVez.getNome()  )){
        achou = true;
      }
    }
    return achou;
  }

  /*
      Deve matricular um aluno na faculdade (inserir na lista), se a lista já
      possuir um aluno com o nome informado, não deve matricular;
  */
  public void matricularAluno(Aluno aluno) {
    System.out.println(alunos.size());
   try {
     Boolean achou = false;
     for (int i = 0; i <alunos.size() ; i++) {
       if (aluno.getNome().equalsIgnoreCase( alunos.get( i ).getNome() )){
         achou = true;
       }
     }
     if (!aluno.equals( null ) && achou == false){
       alunos.add(aluno );
     }
   }catch (NullPointerException e) {
     String mensagem = e.getMessage() + ". O objeto nome é NULL.";
     System.out.println(mensagem);
   }
  }

  /*
      Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
      um aluno com o RA informado, não faça nada.
  */
  public void cancelarMatricula(String ra) {
try {
  Boolean achou =  false;
  Aluno aluno;

  for (int i = 0; i < alunos.size(); i++) {
    aluno = alunos.get( i );

    if (ra.equalsIgnoreCase(aluno.getRa())){
      aluno.setAtivo( false );
      achou = true;
      break;

    }
  }
} catch (NullPointerException e){
  String mensagem = e.getMessage() + ". O objeto nome é NULL.";
  System.out.println(mensagem);
}
  }

  /*
      Deve retornar a quantidade de alunos contidos na lista (matriculados);
  */
  public Integer getQuantidadeAlunos() {
    Integer tam = alunos.size();
    return tam;
  }

  /*
      Deve retornar a quantidade de alunos matriculados (contidos na lista)
      no semestre informado;
  */
  public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
    List<Aluno>qtdSemestre = new ArrayList<Aluno>();
    for (Aluno alunoVez : alunos){
      if (alunoVez.getSemestre().equals( semestre )){
        qtdSemestre.add( alunoVez);
      }
    }
    Integer qtd = qtdSemestre.size();
    return qtd;
  }

  /*
      Deve retornar a quantidade de alunos com matrícula cancelada (contidos na lista);
  */
  public Integer getQuantidadeAlunosComMatriculaCancelada() {
    List<Aluno>qtdSemestre = new ArrayList<Aluno>();
    for (Aluno alunoVez : alunos){
      if (alunoVez.isAtivo().equals( false )){
        qtdSemestre.add( alunoVez);
      }
    }
    Integer qtd = qtdSemestre.size();
    return qtd;
  }

  public String getNome() {
    return nome;
  }


}