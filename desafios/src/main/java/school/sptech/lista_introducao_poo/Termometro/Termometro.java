package school.sptech.lista_introducao_poo.Termometro;

public class Termometro {
    Double temperaturaAtual = 0.0;
    Double temperaturaMax = 0.0;
    Double temperaturaMin = 0.0;
    Double tempFa =0.0;
    Double aumentaTemperatura(Double tempAumenta){
        temperaturaAtual = temperaturaAtual + tempAumenta;
        if (temperaturaAtual > temperaturaMax){
            temperaturaMax = temperaturaAtual;
        }
        return temperaturaAtual;
    }
    Double diminuiTemperatura(Double tempDimunuida){
        temperaturaMin = temperaturaMax;
        temperaturaAtual = temperaturaAtual - tempDimunuida;
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
        return temperaturaAtual;
    }
    Double exibeFahreinheit(){
        //Multiplicamos a temperatura em ºC por 1,8 e somamos 32 ao resultado.
        tempFa = (temperaturaAtual*1.8)+32;
        return tempFa;
    }
    void dados(){
        System.out.printf("""
                Temperatura atual: %.1f °C
                Temperatura máxima: %.1f °C
                Temperatura minima: %.1f°C
                Temperatura em Fahrenheit: %.1f °F
                """,temperaturaAtual,temperaturaMax,temperaturaMin,tempFa);
    }
}
