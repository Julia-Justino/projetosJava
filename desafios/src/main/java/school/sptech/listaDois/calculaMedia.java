package school.sptech.listaDois;

import java.util.Scanner;

public class calculaMedia {
    public static void main(String[] args) {
        Scanner leitorNota = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        Integer nota1 = leitorNota.nextInt();
        System.out.println("Digite a segunda nota:");
        Integer nota2 = leitorNota.nextInt();

        Double media = ((nota1 * 0.4) + (nota2 * 0.6));
        String resultado = String.format("primeira nota %d e a segunda nota %d, o resultado final é: %.2f  \n", nota1, nota2,media);
        System.out.printf(resultado);
    }
}
