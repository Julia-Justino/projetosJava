package school.sptech.listaUm;

public class ContadorVariado {
    public static void main(String[] args) {
        Double number = 0.15;
        Double total=0.0;
        for (int i = 0; i < 5; i++) {
            total += total+0.15;
            System.out.printf("\n %.1f", total);
        }
    }
}
