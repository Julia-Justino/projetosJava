package school.sptech.listaUm;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer mussa =0;
        Integer cala =0;
        Integer qua =0;
        Integer aleatorio = 0;
        for (int i = 1; i <=10 ; i++) {
          aleatorio =  ThreadLocalRandom.current().nextInt(1,4);
          switch (aleatorio){
              case 1:
                  mussa++;
                  break;
              case 2:
                  cala++;
                  break;
              case 3:
                  qua++;
                  break;
              default:
                  System.out.println("Opção inválida");
          }
        }
        System.out.println("Quantos votos obteve cada sabor: mussarela teve "+mussa+ " calabresa teve "+cala+ " quatro queijos "+qua);
        if (mussa<cala){
            System.out.println("Calabresa é a pizza favorita");
        }else if(mussa <qua){
            System.out.println(" Quatro queijos é a pizza favorita");
        }else {
            System.out.println(" Mussarela é a pizza favorita");
        }
    }
}
