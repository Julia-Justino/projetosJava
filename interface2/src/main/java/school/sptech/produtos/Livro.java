package school.sptech.produtos;

import school.sptech.Vendavel;

public class Livro extends Produto {

    private  String nome;
    private String autor;
    private String isbn;

    public Livro(int codigo, double precoCusto, String nome, String autor, String isbn) {
        super( codigo, precoCusto );
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getValorVenda() {
        Double total = super.getPrecoCusto();
        return total += super.getPrecoCusto()*0.10;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Dados"+ super.toString()+
                ",nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }


}
