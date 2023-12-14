package school.sptech;

public class ValoresInvalidoException extends RuntimeException{
    public ValoresInvalidoException() {
        super("Valores não pode ser nulos");
    }
}
