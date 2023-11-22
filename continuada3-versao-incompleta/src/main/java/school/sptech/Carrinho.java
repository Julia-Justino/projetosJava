package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho {

    private List <Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto (Produto produto){
        Boolean achou = false;
        if (Objects.nonNull(produto)){
            for (Produto produtoVez : produtos){
                if(produtoVez.getCodigoBarra().equalsIgnoreCase(produto.getCodigoBarra())){
                   achou = true;
                }
            }

            if (achou){
                System.out.println("Produto já cadastrado");
            }else{
                produtos.add(produto);
            }
        }else{
            System.out.println("Objeto nulo");
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

    public Produto obterProduto(int indice) {
        Boolean achou = false;
        Produto prod = null;
        if (Objects.nonNull(indice)) {
            for (int i = 0; i < produtos.size(); i++) {
                if (indice < 0 || indice == produtos.size() || indice > produtos.size()) {
                    System.out.println("erro");
                } else if (produtos.get(indice).equals(produtos.get(i))) {
                    achou = true;
                    prod = produtos.get(i);
                    break;
                }
            }

        }
        return prod;
    }

    public List<Produto> buscarPorCategoria(String categoria){
        List<Produto> lista = new ArrayList<>();
        for (Produto obVez : produtos){
            if (obVez.getCategoria().equalsIgnoreCase( categoria )){
                lista.add( obVez );
            }
        }
        return lista;
    }

    public List<Produto> buscarProdutosInternacionais(){
        List<Produto> ProdutoInternacional = new ArrayList<>();
       for (Produto pv : produtos){
           if (pv instanceof ProdutoInternacional){
               ProdutoInternacional.add(pv);
           }
       }
        return ProdutoInternacional;
    }

    public List<Produto> buscarProdutosNacionais(){
        List<Produto> ProdutoNacional = new ArrayList<>();
        for (Produto pv : produtos){
            if (pv instanceof ProdutoNacional){
                ProdutoNacional.add(pv);
            }
        }
        return ProdutoNacional;
    }
    public Double calcularTotalEmEstoque(){
        double total = 0.0;
        for (Produto pv : produtos){
            total += pv.calcularPrecoTotal();
        }
        return total;
    }

    public Double calcularTotalEmEstoquePorCategoria(String categoria){
        Double total = 0.0;
        List<Produto> lista = new ArrayList<>();
        for (Produto obVez : produtos){
            if (obVez.getCategoria().equalsIgnoreCase( categoria )){
                lista.add( obVez );
            }
        }
        for(Produto pv: lista){
            total += pv.calcularPrecoTotal();
        }

        return total;
    }
    public List<ProdutoInternacional> buscarPorPaisOrigem(String paisOrigem){
        Boolean achou = false;
        List<ProdutoInternacional> Produto = new ArrayList<>();
        if (Objects.nonNull(paisOrigem)){
            for (Produto pv: produtos){
                if (pv instanceof ProdutoInternacional){
                    if (((ProdutoInternacional) pv).getPaisOrigem().equalsIgnoreCase(paisOrigem)){
                        Produto.add((ProdutoInternacional) pv);
                    }
                }
            }
        }
        return Produto;
    }

    public boolean existeProdutoPorCodigoBarra(String codigoBarra){
        boolean achou = false;
        if (Objects.nonNull(codigoBarra)){
            for (Produto produtoVez : produtos){
                if(produtoVez.getCodigoBarra().equalsIgnoreCase(codigoBarra)){
                    achou = true;
                }
            }
    }
        return achou;
    }

    public boolean existePorIndice(int indice) {
        Boolean achou = false;
        if (Objects.nonNull(indice)){
            for (int i = 0; i < produtos.size(); i++) {
                if (indice<0||indice==produtos.size()||indice>produtos.size()){
                    System.out.println("erro");
                }
                else if (produtos.get(indice).equals(produtos.get(i))){
                    achou = true;
                    break;
                }
            }
        }
        return achou;
    }
}
