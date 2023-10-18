package school.sptech.listaUm;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10");
        Integer numEscolhido = leitor.nextInt();
        Integer i = 0;
        Integer aleatorio = 0;

        while(true){
            if (numEscolhido != aleatorio){
                aleatorio = ThreadLocalRandom.current().nextInt(0,11);
                System.out.println("Número sortiado " +aleatorio);
                i++;
            }else {
                if (i <= 3){
                    System.out.println("Você é MUITO sortudo");
                } else if (i <=10) {
                    System.out.println("Você é sortudo");
                } else if (i > 10) {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                }
                break;
            }
        }
    }
}