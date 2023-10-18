package school.sptech.listaDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class desafiosNumeros {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
        List<Integer> numerosLista = new ArrayList<Integer>();
        List <Integer> par = new ArrayList<Integer>();
        List <Integer> impar = new ArrayList<Integer>();
        Integer total = 0;
        Integer maior = 0;
        Integer menor = 0;
        Integer numeroEscolhidos = 0;
        do{
            System.out.println("Digite um número inteiro");
            numeroEscolhidos = leitorNum.nextInt();
            numerosLista.add(numeroEscolhidos);
        }while (numeroEscolhidos != 0);
        for (int i = 0; i < numerosLista.size() ; i++) {
            if (numerosLista.get(i)%2 == 0){
                par.add(numerosLista.get(i));
                Collections.sort(par);
            }else {
                impar.add(numerosLista.get(i));
                Collections.sort(impar);
            }
            total += (numerosLista.get(i));
            if(numerosLista.get(i)>maior){
                maior = numerosLista.get(i);
            }
            menor = maior;
            if(numerosLista.get(i)<menor){
                menor = numerosLista.get(i);
            }
        }
        System.out.println("Exiba somente os pares da lista: "+par);
        System.out.println("Exiba somente os ímpares da lista: "+impar);
        System.out.println("Exiba a soma de todos os números da lista:"+total);
        System.out.println("Exiba somente o menor número da lista: "+menor);
        System.out.println("Exiba somente o maior número da lista "+ maior);

    }
}
