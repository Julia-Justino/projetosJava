package school.sptech;
/*
* C) Uma classe "Heroi" herdeira de "Personagem", que deve conter:

    I. Métodos:

getForcaTotal - Double - esse método deve percorrer a lista de poderes do heroi e retornar
* o valor total dos poderes (baseado na categoria), adicionando 15% ao valor total.

* */
public class Heroi extends Personagem {
    public Heroi(String codinome, String nome) {
        super( codinome, nome );
    }

    @Override
    public Double getForcaTotal() {
        Double total = 0.0;
        for (SuperPoder poder : poderes) {
            total += poder.getCategoria();
        }
        total = total + (total * 0.15);
        return  total;
    }


}
