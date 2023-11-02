package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Superman", "Clark Kent");
        heroi1.adicionarPoder("Voar", 20);
        heroi1.adicionarPoder("Força", 0);

        Heroi heroi2 = new Heroi("Batman", "Bruce Wayne");
        heroi2.adicionarPoder("Inteligência", 20);
        heroi2.adicionarPoder("Força", 10);

        // Criando instâncias de vilões
        Vilao vilao1 = new Vilao("Lex Luthor", "Lex Luthor");
        vilao1.adicionarPoder("Inteligência", 20);
        vilao1.adicionarPoder("Dinheiro", 3);

        Vilao vilao2 = new Vilao("Coringa", "Coringa");
        vilao2.adicionarPoder("Inteligência", 15);
        vilao2.adicionarPoder("Dinheiro", 5);

        // Criando os combates
        Confronto confronto = new Confronto();
        System.out.println("** Combate 1 **");
        confronto.lutar(heroi1, vilao1);
       
        System.out.println("** Combate 2 **");
        confronto.lutar(heroi2, vilao2);
    }
}