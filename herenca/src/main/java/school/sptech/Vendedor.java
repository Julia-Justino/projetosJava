package school.sptech;

public class Vendedor extends Funcionario{
    private Double vendas;
    private Double taxa;
    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = vendas;
    }

    @Override
    public Double calcSalario() {
        return vendas*taxa/100;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + vendas +
                ", taxa=" + taxa +
                '}';
    }
}
