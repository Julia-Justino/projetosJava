package school.sptech;
/*
*  Uma classe "Confronto", que deve conter:

    I. Métodos:

lutar - void - método estático que recebe dois argumentos, "Heroi heroi" e "Vilao vilao", esse método deve comparar o valor total dos poderes dos personagens
* recebidos e exibir no console um texto com o nome do vencedor do combate, inclusive, deve tratar caso ocorra um empate.

* */
public class Confronto {

    public void  lutar(Heroi heroi, Vilao vilao){
        if (heroi.getForcaTotal()> vilao.getForcaTotal()){
            System.out.println("Heroi venceu");
        } else if (heroi.getForcaTotal()< vilao.getForcaTotal()) {
            System.out.println("Vilão venceu");
        } else if (heroi.getForcaTotal().equals( vilao.getForcaTotal() )) {
            System.out.println("Deu empate");
        }else {
            System.out.println("A luta foi tão épica que até o Java não aguentou e quebrou.");
        }
    }
}
