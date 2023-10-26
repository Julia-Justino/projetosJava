package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionarFigura(Figura figura){
        if (Objects.nonNull(figura)){
            Boolean achou = false;
            for (Figura figVez: figuras){
                if (figura.equals(figVez)){
                    achou =  true;
                }
            }
            if (!achou){
                figuras.add(figura);
                System.out.println("Cadastrado com sucesso");
            }
        }else{
            System.out.println("Objet nulo");
        }
    }

    public void exibeFiguras(){
        for (Figura figVez:figuras){
            System.out.println(figVez.toString());
        }
    }
    public void exibeSomaArea(){
        Double total = 0.0;
        for (Figura figVez:figuras){
            total += figVez.calcularArea();
        }
        System.out.println("Resultado da soma: "+Math.round(total));
    }

    public void exibeFiguraAreaMaior(){
        for (Figura figVez:figuras){
            if (figVez.calcularArea() > 20){
                System.out.println("Maior que 20: "+ figVez.toString());
            }
        }
    }

    public void exibeQuadrado(){
       for (Figura figVez : figuras){
           if (figVez instanceof Quadrado){
               System.out.println(figVez);
           }
       }
    }
}
