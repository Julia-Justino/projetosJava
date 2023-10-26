package school.sptech;

public class Triangulo extends Figura{

    private Double base;
    private Double altura;

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                super.toString()+
                "Base=" + base +
                ", Altura=" + altura +
                ", Total = " + calcularArea()+
                '}';
    }
}
