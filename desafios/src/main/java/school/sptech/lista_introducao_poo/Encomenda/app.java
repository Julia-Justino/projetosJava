package school.sptech.lista_introducao_poo.Encomenda;

public class app {
    public static void main(String[] args) {
        Encomenda select = new Encomenda();
        select.SelecionarTamanho(3);
        select.enderecoDestinatario = "Rua das flores";
        select.enderecoRemetente = "Rua das cores azuis";
        select.valorEncomenda = 500.00;
        select.calcularFrete(210.0);
        select.emitirEtiqueta();
    }
}
