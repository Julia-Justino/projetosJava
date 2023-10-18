package school.sptech;

public class aaa {
    public static void main(String[] args) {
        OperacaoBancaria ob = new OperacaoBancaria( "0001", "vai", 250.5 );
        ContaCorrente cc = new ContaCorrente( "eu", "0005", "123");
        cc.adicionarOperacao( "0001", "vai", 250.5 );

        String a = "";
        String b = "xcxzdcxscv";
        Boolean olha = b.isEmpty();
        System.out.println("sdffsd "+olha);
    }
}
