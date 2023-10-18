package school.sptech.lista_introducao_poo.Confeitaria;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitorSabor = new Scanner(System.in);
        Scanner leitorValor = new Scanner(System.in);
        confeitaria bolo1 = new confeitaria();
        confeitaria bolo2 = new confeitaria();
        confeitaria bolo3 = new confeitaria();
        confeitaria bolo4 = new confeitaria();
        confeitaria bolo5 = new confeitaria();


            /*System.out.println(//"Escolha alguma opração do menu abaixo: \n" +
                    "1 - Abacaxi\n" +
                    "2 - Morango\n" +
                    "3 - Chocolate\n");*/
            /*System.out.println("Digite o número relacionado ao sabor");
            Integer opcao = leitorSabor.nextInt();
            System.out.println("Digite o preço do bolo");
            Double preco = leitorValor.nextDouble();
            System.out.println("Digite a quantidade de bolos vendidos no dia");
            Integer dias = leitorValor.nextInt();*/

            bolo1.ValidarSabor(1);
            bolo1.comprarBolo(35.0, 15);

            bolo2.ValidarSabor(2);
            bolo2.comprarBolo(45.5,50);

            bolo3.ValidarSabor(3);
            bolo3.comprarBolo(36.56,63);

            bolo4.ValidarSabor(1);
            bolo4.comprarBolo(45.5, 89);

            bolo5.ValidarSabor(2);
            bolo5.comprarBolo(49.99, 99);
    }
}
