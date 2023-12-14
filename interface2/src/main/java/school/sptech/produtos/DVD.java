package school.sptech.produtos;

public class DVD extends Produto{

    private  String nome;
    private  String gravadora;

    public DVD(int codigo, double precoCusto, String nome, String gravadora) {
        super( codigo, precoCusto );
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        Double total = super.getPrecoCusto();
        return total += super.getPrecoCusto()*0.20;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "Dados"+ super.toString()+
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                '}';
    }
}