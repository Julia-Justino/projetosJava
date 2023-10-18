package school.sptech.lista_introducao_poo.Encomenda;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia = 0.0;
    Double valorEncomenda = 0.0;
    Double taxaEncomenda = 0.0;
    Double total = 0.0;

    void SelecionarTamanho(Integer escolhaTamanho){
        System.out.printf("""
                Selecione o tamanho a baixo:
                1 - P;
                2 - M;
                3 - G
                """);
        switch (escolhaTamanho) {
            case 1:
                tamanho = "P";
                System.out.println("O tamanho selecionado: "+tamanho);
                break;
            case 2:
                tamanho = "M";
                System.out.println("O tamanho selecionado: "+tamanho);
                break;
            case 3:
                tamanho = "G";
                System.out.println("O tamanho selecionado: "+tamanho);
                break;
            default:
                System.out.println("Valor inválido, nenhum sabor informado. Fim da aplicação");
        }
    }
    void calcularFrete(Double dis){
        // ************************* Frete da distância *********************************
        distancia = dis;
        if (distancia <= 50) {
            taxaEncomenda = 3.0;
        } else if (distancia >= 51 && distancia <= 200) {
            taxaEncomenda = 5.0;
        } else if (distancia >= 201) {
            taxaEncomenda = 7.0;
        }
        // ***************************** Frete da peça *******************************
        if (tamanho.equalsIgnoreCase("P")){
            taxaEncomenda += valorEncomenda*0.01;
        } else if (tamanho.equalsIgnoreCase("M")){
            taxaEncomenda += valorEncomenda*0.03;
        } else if (tamanho.equalsIgnoreCase("G")){
            taxaEncomenda += valorEncomenda*0.05;
        }
        total = valorEncomenda + taxaEncomenda;
    }
   void emitirEtiqueta(){
       System.out.printf("""
               ***** ETIQUETA PARA ENVIO *****\s
                               Endereço do remetente: %s
                               Endereço do destinatário: %s
                               Tamanho: %s
                               --------------------------------------------------\s
                               Valor encomenda: R$ %.2f
                               Valor frete: R$ %.2f
                               --------------------------------------------------
                               Valor total: R$ %.2f
               """ ,enderecoRemetente,enderecoDestinatario,
               tamanho,valorEncomenda,taxaEncomenda, total);

    }
}
