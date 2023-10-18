package school.sptech.POO_parte_2.Ponto;

public class app {
    public static void main(String[] args) {
        Ponto a = new Ponto(2,3);
        Ponto b = new Ponto(4,4);

        b.mover(7,8);

        System.out.println("Distância entre os pontos: " + a.getDistancia(b));
    }
}
