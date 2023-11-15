package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho{

    List<Vendavel>cart;

    public Carrinho() {
        cart = new ArrayList<>();
    }
    public  void adicionaVendavel(Vendavel v){
        if (Objects.nonNull( v )){
            cart.add( v );
        }
    }

    public double calculaTotalVenda( ){
        double total = 0.0;
        for (Vendavel a: cart){
           total+= a.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho( ){
        for (Vendavel a: cart){
            System.out.println( a.toString());
        }
    }
}
