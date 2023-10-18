package school.sptech.POO_parte_2.ProgressaoAritmetica;

public class app {
    public static void main(String[] args) {
        ProgressaoAritmetica pa = new ProgressaoAritmetica();
        pa.setPrimeiroTermo(1.0);
        pa.setRazao(-4.0);
        pa.calcularTermo(5);
        pa.resul();
    }
}
