package school.sptech.POO_parte_2.Gerenciamento;


public class Estudante {
    private String nome;
    private String curso;
    private Double mensalidade;
    private Boolean status;


    public Estudante(String nome, String curso, Double mensalidade) {
        this.nome = nome;
        this.curso = curso;
        this.mensalidade = mensalidade;
        this.status = true;
    }
    void aplicarDesconto(Double porcentagem){
        if (status){
            System.out.printf("Olá, aluno: %s \n", nome);
            Double resul = mensalidade - (mensalidade * (porcentagem/100));
            System.out.printf("Seu desconto é: R$ %.2f", resul);
        }else {
            System.out.println("Não é possível aplicar o desconto, para não alunos");
        }
    }
    public Double getMensalidade() {
        return mensalidade;
    }


    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }


    public Boolean getStatus() {
        return status;
    }


    public void trancarMatricula() {
        System.out.println("\nMatricula trancanda com sucesso");
        this.status = false;
    }
    public void abrirMatricula(){
        System.out.println("\nMatricula realizada com sucesso");
        this.status = true;
    }
}
