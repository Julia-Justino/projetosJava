package school.sptech;

import java.util.Objects;

public class Produto {
    private String nome;
    private Double preco;
    private Double pesoKg;
    private Boolean fragil;
    private String categoria;

    public Produto(String nome, Double preco, Double pesoKg, Boolean fragil, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.pesoKg = pesoKg;
        this.fragil = fragil;
        this.categoria = categoria;
    }

    public Double calcularFrete(){
        Double frete = 0.0;
        if (Objects.nonNull(fragil)) {

            frete = pesoKg*0.10;
            if (fragil.equals(true)) {
                frete = frete*2;
            }
        }else {
            System.out.println("Operação inválida, frete está nulo");
        }
        return frete;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Boolean getFragil() {
        return fragil;
    }

    public void setFragil(Boolean fragil) {
        this.fragil = fragil;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
