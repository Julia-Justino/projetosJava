package school.sptech.listaDois;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
        Scanner leitoOpe = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Integer numero = leitorNum.nextInt();

        System.out.println("Escolha alguma opração do menu abaixo: \n" +
                "1 - Soma\n" +
                "2 - Multiplicação\n" +
                "3 - Divisão\n" +
                "4 - Subtração\n" +
                "5 - Potência\n"+
                "6 - Resto da divisão\n" +
                "0 - Sair\n");
        System.out.println("Digite o número relacionado a operação");
        Integer escolha = leitoOpe.nextInt();
        if (escolha >=7){
            do {
                System.out.println(escolha + " está errado, tente novamente!");
                System.out.println("Escolha alguma opração do menu abaixo: \n" +
                        "1 - Soma\n" +
                        "2 - Multiplicação\n" +
                        "3 - Divisão\n" +
                        "4 - Subtração\n" +
                        "5 - Potência\n"+
                        "6 - Resto da divisão\n" +
                        "0 - Sair\n");
                System.out.println("Digite o número relacionado a operação");
                escolha = leitoOpe.nextInt();
            }while (escolha >=7);
        }

        switch(escolha) {
            case 1:
                for (int i = 1; i < 11; i++) {
                    Integer tabu = numero + i;
                    System.out.printf("%d + %d = %d \n", numero, i, tabu);
                }
                break;
            case 2:
                for (int i = 1; i < 11; i++) {
                    Integer tabu = numero * i;
                    System.out.printf("%d * %d = %d \n", numero, i, tabu);
                }
                break;
            case 3:
                for (int i = 1; i < 11; i++) {
                    Integer tabu = numero / i;
                    System.out.printf("%d / %d = %d \n", numero, i, tabu);
                }
                break;
            case 4:
                for (int i = 1; i < 11; i++) {
                    Integer tabu = numero - i;
                    System.out.printf("%d - %d = %d \n", numero, i, tabu);
                }
                break;
            case 5:
                Integer total = 1;
                for (int i = 1; i<= 10; i++) {
                    total = total *numero;
                    System.out.printf("%d ^ %d = %d \n", numero, i, total);
                }
            case 6:
                for (int i = 1; i < 11; i++) {
                    Integer tabu = numero % i;
                    System.out.printf("%d / %d = %d \n", numero, i, tabu);
                }
                break;
            case 0:
                System.out.println("Até mais");
                break;
            default:
                System.out.println("Valor inválido");
        }
        }
    }

