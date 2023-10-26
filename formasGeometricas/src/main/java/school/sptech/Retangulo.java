package school.sptech;

public class Retangulo extends Figura{

    private Double base;
    private Double altura;

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.altura = altura;
        this.base = base;
    }


    @Override
    public Double calcularArea() {
        return base*altura;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                super.toString()+
                "Base=" + base +
                ", Altura=" + altura +
                ", Total = " + calcularArea()+
                '}';
    }
}
