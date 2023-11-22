package school.sptech;

public class ProdutoInternacional extends Produto{
    public static final double TAXA_IMPORTACAO = 1.6;
    private String paisOrigem;

    public ProdutoInternacional(String codigoBarra, String nome, String descricao, String categoria, Double preco, int quantidade, String paisOrigem) {
        super(codigoBarra, nome, descricao, categoria, preco, quantidade);
        this.paisOrigem = paisOrigem;
    }

    @Override
    public Double calcularPrecoUnitario() {
        return getPreco()*TAXA_IMPORTACAO;
    }

    @Override
    public Double calcularPrecoTotal() {
        return (getPreco()*getQuantidade())*TAXA_IMPORTACAO;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
