package school.sptech.POO_parte_2.EquacaoDoSegundoGrau;

import java.util.ArrayList;
import java.util.List;

public class EquacaoDoSegundoGrau {
    private Double a;
    private Double b;
    private Double c;

    public EquacaoDoSegundoGrau(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void calcularRaizes(){
        List <Double> geral = new ArrayList<>();
        List <Double> unica = new ArrayList<>();
        List <String> vazia = new ArrayList<>();
        Double delta = (Math.pow(b,2) - 4*a*c);
        if (delta<0){
            vazia.add("Não existe no conjuntos dos Reais (R)");
            System.out.println(vazia);
        } else if (delta.equals(0.0)) {
            Double total = (-b + Math.sqrt(delta))/ 2 * a;
            unica.add(total);
            System.out.println("A solução é: "+unica);
        } else {
            Double total1 = (-b + Math.sqrt(delta))/ 2 * a;
            Double total2 = (-b - Math.sqrt(delta))/ 2 * a;
            geral.add(total1);
            geral.add(total2);
            System.out.println("O conjunto solução é: " + geral);
        }




    }
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
