package school.sptech.listaUm;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base: ");
        Integer base = leitor.nextInt();
        System.out.println("Digite a potência: ");
        Integer potencia = leitor.nextInt();
        Integer total = 1;
        for (int i = potencia; i >= 1; i--) {
            total = total *base;
            System.out.println(total);
        }
        System.out.println("O resultado da conta "+base+ " na potência " + potencia+ " = "+ total);
    }
}
