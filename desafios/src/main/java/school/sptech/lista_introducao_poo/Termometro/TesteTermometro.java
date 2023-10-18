package school.sptech.lista_introducao_poo.Termometro;

public class TesteTermometro  {
    public static void main(String[] args) {
        Termometro ter = new Termometro();
        ter.temperaturaAtual = 15.0;
        ter.aumentaTemperatura(0.5);
        ter.diminuiTemperatura(5.0);
        ter.exibeFahreinheit();
        ter.dados();
    }

}
