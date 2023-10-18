package school.sptech.listaDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fruta {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        List<String> frutas = new ArrayList<String>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Morango");
        frutas.add( "Pêssego");
        frutas.add("Abacaxi");
        frutas.add( "Manga");
        frutas.add("Melancia");
        frutas.add("Kiwi");
        frutas.add("Cereja");
        frutas.add("Pera");
        frutas.add( "Amora");
        frutas.add("Framboesa");
        frutas.add( "Limão");
        frutas.add("Tangerina");
        frutas.add("Mamão");
        frutas.add("Ameixa");
        frutas.add("Romã");
        frutas.add("Coco");

        System.out.println("Qual a fruta você procura?");
        String resposta = pergunta.nextLine();

        boolean encontrada = false;
        for (String fruta : frutas) {
            if (fruta.equalsIgnoreCase(resposta)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println(resposta + " está na lista de frutas.");
        } else {
            System.out.println(resposta + " não está na lista de frutas.");
        }
        }
    }

