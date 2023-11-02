package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  abstract class Personagem {
    /* Uma classe abstrata "Personagem", que deve conter:

    I. Atributos:

    codinome - String - representa o codinome(como ele costuma ser reconhecido) do personagem.
    nome - String - representa o nome verdadeiro, caso o personagem tenha um codinome.
    poderes - List - representa a lista de poderes que o personagem possuí.


    II. Métodos:
adicionaPoder - void - recebe dois argumentos, "String nome" e "Integer categoria", cria e adiciona um super poder à lista de poderes do personagem. +
getForcaTotal - Double - método abstrato.
getters - para recuperar as informações do objeto.
toString() - String - retorna uma string para exibir as informações do objeto.
*/
    protected String codinome;
    protected   String nome;
    protected List<SuperPoder>poderes;


    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList<>();
    }

    public  void adicionarPoder(String nome, Integer categoria){
        if (Objects.nonNull( nome )&&Objects.nonNull( categoria )){
            Boolean achou = false;
                SuperPoder poder = new SuperPoder( nome, categoria );
                poderes.add(poder);
        }
    }

    public  abstract  Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "codinome='" + codinome + '\'' +
                ", nome='" + nome + '\'' +
                ", poderes=" + poderes +
                '}';
    }
}
