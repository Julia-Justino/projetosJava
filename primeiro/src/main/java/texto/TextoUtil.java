package texto;

import school.sptech.ValoresInvalidoException;

import java.util.Objects;

public class TextoUtil {
    public Integer contarLetras(String palavra){
        if (Objects.isNull(palavra)){
            throw new ValoresInvalidoException();
        }
        Integer total = palavra.length();
        return total;
    }

    public static String inverterLetras(String string) {
        if (Objects.isNull(string)){
            throw new ValoresInvalidoException();
        }
        StringBuffer invertida = new StringBuffer(string);
        invertida.reverse();
        return invertida.toString();
    }

    public static String capitalizar(String string) {
        if (Objects.isNull(string)){
            throw new ValoresInvalidoException();
        }
        StringBuilder capitalizada = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i == 0 || !Character.isLetter(string.charAt(i - 1))) {
                capitalizada.append(Character.toUpperCase(string.charAt(i)));
            } else {
                capitalizada.append(string.charAt(i));
            }
        }
        return capitalizada.toString();
    }



}
