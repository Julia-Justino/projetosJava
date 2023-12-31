package school.sptech.produto;

public class Eletronico extends Produtos{

    public Integer tensao;
    private Double peso;

    private String fabricante;

    public Eletronico(Integer id, String nome, Double precoBase, Integer tensao, Double peso, String fabricante) {
        super(id, nome, precoBase);
        this.tensao = tensao;
        this.peso = peso;
        this.fabricante = fabricante;
    }

    public Eletronico() {}

    @Override
    public Double calcularImposto() {
        return getPrecoBase()*0.15;
    }

    public Integer getTensao() {
        return tensao;
    }

    public void setTensao(Integer tensao) {
        this.tensao = tensao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "tensao=" + tensao +
                ", peso=" + peso +
                ", fabricante='" + fabricante + '\'' +
                "} \n" + super.toString();
    }
}
