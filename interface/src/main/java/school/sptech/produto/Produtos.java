package school.sptech.produto;

public abstract class Produtos {
    private Integer id;
    private String nome;
    private  Double precoBase;

    public abstract Double calcularImposto();

    public Produtos(Integer id, String nome, Double precoBase) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public  Produtos (){}

    public Integer getId() {
        return id;
    }
    public Double precoTotal(){
        return precoBase + calcularImposto();
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoBase=" + precoBase +
                ", Calcular imposto" + calcularImposto()+
                ", Preço total" + precoTotal()+
                "}\n";
    }
}
