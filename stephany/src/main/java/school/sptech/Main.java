package school.sptech;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Produto po = new Produto("Notebook", 3400.0, 1.65, false, "Informática");
    Compra co = new Compra("aa");
    co.getProdutoPorNome("Notebook");

  }
}