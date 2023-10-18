package school.sptech.listaUm;

public class NumerosPares {
    public static void main(String[] args) {
        //• Exiba todos os números pares de 0 a 40 usando while;
        Integer i = 0;
        while (i <= 40){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
