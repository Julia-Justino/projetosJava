package school.sptech.produto;

public class Vestuario extends Produtos{

    private String cor;
    private  String tamanho;
    private Boolean whiteLabel;

    public Vestuario(Integer id, String nome, Double precoBase, String cor, String tamanho, Boolean whiteLabel) {
        super(id, nome, precoBase);
        this.cor = cor;
        this.tamanho = tamanho;
        this.whiteLabel = whiteLabel;
    }

    public Vestuario() {
    }

    @Override
    public Double calcularImposto() {
        return getPrecoBase() * 0.10;
    }

    @Override
    public String toString() {
        return "Vestuario{" +
                "cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", whiteLabel=" + whiteLabel +
                "} \n" + super.toString();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getWhiteLabel() {
        return whiteLabel;
    }

    public void setWhiteLabel(Boolean whiteLabel) {
        this.whiteLabel = whiteLabel;
    }
}
