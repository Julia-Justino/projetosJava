package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(String cor, Integer espessura, Double lado) {
        super(cor, espessura);
        this.lado = lado;
    }


    @Override
    public Double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "Lado=" + lado +
                ", Total = " + calcularArea()+
                '}';
    }
}
