package school.sptech;

import java.util.Objects;

public class Calculadora {
    public Integer somar(Integer val1, Integer val2){
        if (Objects.isNull(val1) || Objects.isNull(val2)){
            throw new ValoresInvalidoException();
        }
        return val1+val2;
    }
}
