package school.sptech;
/*
* Uma classe "SuperPoder", que deve conter:

    I. Atributos:

nome - String - representa o nome do super poder.
categoria - Integer - representa a força do super poder.
    II. Métodos:

getters - para recuperar as informações do objeto.
toString() - String - retorna uma string para exibir as informações do objeto.
* */
public class SuperPoder {
    private String nome;
    private Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "SuperPoder{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
