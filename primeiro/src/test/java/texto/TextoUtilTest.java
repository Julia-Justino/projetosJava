package texto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import school.sptech.ValoresInvalidoException;

import static org.junit.jupiter.api.Assertions.*;

class TextoUtilTest {
    @Test
    @DisplayName("Palavra total não pode ser nula")
    void palavraNaopodeSerNula(){
        TextoUtil tu = new TextoUtil ();
        String msgEsperada = "Valores não pode ser nulos";
        ValoresInvalidoException exception = assertThrows(
                ValoresInvalidoException.class,
                () -> tu.contarLetras(null)
        );
        String mensagem = exception.getMessage();
        assertEquals(msgEsperada, mensagem);
    }

    @Test
    @DisplayName("Número total de palavras")
    void numeroTotalDePalavras(){
        TextoUtil tu = new TextoUtil();
        String  mensagem = "Mensagem";
        Integer valorEsperado = mensagem.length();
        Integer resultado = tu.contarLetras(mensagem);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    @DisplayName("Palavra oposta não pode ser nula")
    void palavraInvertidaNaopodeSerNula(){
        TextoUtil tu = new TextoUtil ();
        String msgEsperada = "Valores não pode ser nulos";
        ValoresInvalidoException exception = assertThrows(
                ValoresInvalidoException.class,
                () -> tu.inverterLetras(null)
        );
        String mensagem = exception.getMessage();
        assertEquals(msgEsperada, mensagem);
    }
    @Test
    @DisplayName("Palavra oposta")
    void palavraOposta(){
        TextoUtil tu = new TextoUtil();
        String  valorEsperado = "lagel é oluap";
        String  mensagem = "paulo é legal";
        String resultado = tu.inverterLetras(mensagem);
        assertEquals(valorEsperado, resultado);
    }

    @Test
    @DisplayName("Palavra capitalizada não pode ser nula")
    void palavraCapitalizadaNaopodeSerNula(){
        TextoUtil tu = new TextoUtil ();
        String msgEsperada = "Valores não pode ser nulos";
        ValoresInvalidoException exception = assertThrows(
                ValoresInvalidoException.class,
                () -> tu.capitalizar(null)
        );
        String mensagem = exception.getMessage();
        assertEquals(msgEsperada, mensagem);
    }

    @Test
    @DisplayName("Palavra capitalizada")
    void palavraCapitalizada(){
        TextoUtil tu = new TextoUtil();
        String  valorEsperado = "Paulo É Legal";
        String  mensagem = "paulo é legal";
        String resultado = tu.capitalizar(mensagem);
        assertEquals(valorEsperado, resultado);
    }
}