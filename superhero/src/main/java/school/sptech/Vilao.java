package school.sptech;
/*
* D) Uma classe "Vilao" herdeira de "Personagem", que deve conter:

    I. Métodos:

getForcaTotal - Double - esse método deve percorrer a lista de poderes do vilão e retornar o valor total dos poderes (baseado na categoria).

 */
public class Vilao extends Personagem{
    public Vilao(String codinome, String nome) {
        super( codinome, nome );
    }

    @Override
    public Double getForcaTotal() {
        Double total = 0.0;
        for (SuperPoder poderVez : super.poderes){
            total += poderVez.getCategoria();
        }
        return total;
    }
}
