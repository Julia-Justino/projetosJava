package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Faculdade {

  private String nome;
  private List<Aluno> alunos;

  public Faculdade(String nome) {
    this.nome= nome;
    this.alunos = new ArrayList<>();
  }

  /*
      Deve verificar se existe um aluno com o nome informado, caso não exista,
      retorne false;
  */
  public Boolean existsAlunoPorNome(String nome) {
    boolean achou = false;
    if  (nome == null){
      return false;
    }

    for (Aluno alunoVez : alunos){
      if (alunoVez.getNome().equalsIgnoreCase(nome)) {
        achou = true;
        break;
      }
    }

    return achou;
  }

  /*
      Deve matricular um aluno na faculdade (inserir na lista), se a lista já
      possuir um aluno com o nome informado, não deve matricular;
  */
  public void matricularAluno(Aluno aluno) {
   try {
     boolean achou = false;
     for (Aluno alunoVez : alunos) {
       if (aluno.getNome().equalsIgnoreCase(alunoVez.getNome())) {
         achou = true;
         break;
       }
     }
     if (Objects.nonNull(aluno) && !achou){
       alunos.add(aluno);
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
  for (Aluno value : alunos) {
    if (ra.equalsIgnoreCase(value.getRa())) {
      value.setAtivo(false);
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
    return  this.alunos.size();
  }

  /*
      Deve retornar a quantidade de alunos matriculados (contidos na lista)
      no semestre informado;
  */
  public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
    List<Aluno>qtdSemestre = new ArrayList<>();
    for (Aluno alunoVez : alunos){
      if (alunoVez.getSemestre().equals(semestre)){
        qtdSemestre.add(alunoVez);
      }
    }
    return qtdSemestre.size();
  }

  /*
      Deve retornar a quantidade de alunos com matrícula cancelada (contidos na lista);
  */
  public Integer getQuantidadeAlunosComMatriculaCancelada() {
    List<Aluno>qtdSemestre = new ArrayList<>();
    for (Aluno alunoVez : alunos){
      if (alunoVez.isAtivo().equals( false )){
        qtdSemestre.add( alunoVez);
      }
    }
    return qtdSemestre.size();
  }

  public String getNome() {
    return nome;
  }

}