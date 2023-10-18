package school.sptech.listaUm;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Integer numero = leitor.nextInt();
        Integer aleatorio = 0;
        Integer par = 0;
        Integer impar =0;
        Integer add =0;
        Integer j=0;
        for (int i = 1; i < 200; i++) {
            if(numero == aleatorio && add>1){
                System.out.println("Foi sortiado na posição " +numero+i );
                j++;
                add++;
            }

            if (i % 2 == 0){
              par++;
            }
            if (i % 2 != 0) {
               impar++;
            }
            aleatorio = ThreadLocalRandom.current().nextInt(1,101);
            System.out.println(aleatorio);
            }
        System.out.println("Quantas vezes  número apareceu "+ j);
        System.out.println("Quantos números pares foram sorteados: "+par);
        System.out.println("Quantos números ímpares foram sorteados: "+impar);
        }
    }

