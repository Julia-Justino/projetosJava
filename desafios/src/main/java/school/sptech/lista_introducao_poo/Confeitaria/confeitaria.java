package school.sptech.lista_introducao_poo.Confeitaria;
public class confeitaria {
    String sabor;

    Boolean qtdDias;
    Double total = 0.0;
    Boolean valores;

    void ValidarSabor(Integer escolha) {
        System.out.println("Escolha alguma opração do menu abaixo: \n" +
                "1 - Abacaxi\n" +
                        "2 - Morango\n" +
                        "3 - Chocolate\n");
        switch (escolha) {
            case 1:
                sabor = "Abacaxi";
                break;
            case 2:
                sabor = "Morango";
                break;
            case 3:
                sabor = "Chocolate";
                break;
            default:
                System.out.println("Valor inválido, nenhum sabor informado. Fim da aplicação");
        }
    }

    void comprarBolo(Double valor, Integer qtd) {
        qtdDias = (qtd > 100);
        valores = (valor < 30.00 || valor > 50.00);
        if (valores) {
            System.out.printf("""
                    ===========================================================================
                    [ERRO]  
                    O valor inserido está inválido, não está na faixa de preço (O valor é menor que R$: 30.00 ou maior que R$: 50.00)
                     ===========================================================================
                    \n""");
        } else {
            if (qtdDias) {
                System.out.printf("""
          ===========================================================================
            [ERRO]  
           Seu pedido ultrapassou nosso limite diário para esse bolo (O limite é 100 bolos diários)
          ===========================================================================
            \n""");
            } else {
                total = valor * qtd;
                System.out.printf("""
                        -------------------------------------------------------------------
                        O bolo sabor %s, foi comprado %d vezes hoje, totalizando
                        R$ %.2f.
                         -------------------------------------------------------------------
                        """,sabor,qtd,total);
}
}}}
