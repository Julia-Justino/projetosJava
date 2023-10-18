package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Compra {
    private String nomeCliente;
    private List<Produto> produtos;

    public Compra(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<Produto>();
    }
    public void adicionarProduto(Produto produto){
        Boolean achou = false;
        if (Objects.nonNull(produto)){
            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.get(i).equals(produto)){
                    achou = true;
                    break;
                }
            }
            if (achou){
                System.out.println("Produto já existe");
            }else {
                produtos.add(produto);
            }
        }else {
            System.out.println("operação inválida, produto null");
        }
    }
    public void removerProduto(int indice) {
        Boolean achou = false;
        if (Objects.nonNull(indice)){
            for (int i = 0; i < produtos.size(); i++) {
                if (indice<0||indice==produtos.size()||indice>produtos.size()){
                    System.out.println("erro");
                }
                else if (produtos.get(indice).equals(produtos.get(i))){
                    produtos.remove(i);
                    break;
                }
            }
        }
    }

    public Integer getQuantidadeProdutos(){
        Integer i= 0;
        for (Produto poVez : produtos){
            i++;
        }
        return i;
    }
    public Integer getQuantidadeProdutosFrageis(){
        Integer i=0;
        for (Produto proVez: produtos){
            if (proVez.getFragil().equals(true)){
                i++;
            }
        }
        return i;
    }
    public String getProdutoPorNome(String nome){
        String nom = "";
        Boolean achou = false;
        if (Objects.nonNull(nome)){
            for (Produto po: produtos){
                if (po.getNome().equalsIgnoreCase(nome)|| po.getNome().toLowerCase().contains( nome.toLowerCase() )){
                    nom = po.getNome();
                    achou = true;
                    break;
                }
            }
        }else{
            return null;
        }
        if (achou) {
            return nome;
        }else{
            return null;
        }
    }


    public List<Produto> getProdutosPorCategoria(String categoria){
        List<Produto> lista = new ArrayList<>();
        for (Produto obVez : produtos){
            if (obVez.getCategoria().equalsIgnoreCase( categoria )){
                lista.add( obVez );
            }
        }
        return lista;
    }

    public Double calcularTotalFrete(){
        Double total = 0.0;
        for (Produto poVez: produtos){
            total += poVez.calcularFrete();
        }
        return total;
    }


    public Double calcularTotalProdutos(){
        Double total = 0.0;
        for (Produto poVez: produtos){
            total += poVez.getPreco();
        }
        return total;
    }
    public Double calcularTotalCompra(){
        Double totalG = 0.0;
      totalG= calcularTotalProdutos()+calcularTotalFrete();
        return totalG;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
