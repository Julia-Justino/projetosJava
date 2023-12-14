package school.sptech;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    @DisplayName("Somar quando acionado com valores 2 e 2 deve retornar 4 ")
    void somarQuandoAcionadoComValor2e2DeveRetornar4(){
        Calculadora cal = new Calculadora();
        Integer valor1 = 2;
        Integer valor2 = 2;
        Integer valorEsperado = 4;

        Integer resultado = cal.somar(valor1, valor2);

        assertEquals(valorEsperado, resultado);
    }

    @Test
    @DisplayName("Somar qundo acionado com valores nulos deve lançar ILegalArgumentException")
    void somarQuandoAcionadaComValoresNulosDeveLancaException(){
        Calculadora cal = new Calculadora();
        String msgEsperada = "Valores não pode ser nulos";
        ValoresInvalidoException exception = assertThrows(
               ValoresInvalidoException.class,
                () -> cal. somar(null, null)
        );
        String mensagem = exception.getMessage();
        assertEquals(msgEsperada, mensagem);
    }
}