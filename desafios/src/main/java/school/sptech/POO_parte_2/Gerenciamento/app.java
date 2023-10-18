package school.sptech.POO_parte_2.Gerenciamento;


public class app {
    public static void main(String[] args) {
        Estudante manu = new Estudante("Manoel Gomes", "ADS", 1500.00);
        manu.aplicarDesconto(10.0);
        manu.trancarMatricula();
        manu.aplicarDesconto(5.0);


    }
}
