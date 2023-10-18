package school.sptech.listaUm;

import java.util.concurrent.ThreadLocalRandom;

public class acumulador {
    public static void main(String[] args) {
        Integer numero = 0;
        Integer sortiador = 1;
        Integer i = 0;
        Integer total = 0;
        while (true){
            if (numero!=sortiador){
                sortiador = ThreadLocalRandom.current().nextInt(0,10);
                total += sortiador;
                System.out.println("Número sortiado: " + sortiador);
                i++;
            }
            else {
                System.out.println("A soma dos sortiados foi: " +total);
                break;
            }
        }
    }
}
