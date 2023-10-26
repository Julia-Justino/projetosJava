package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado("Vermelho", 2, 5.0);
        Retangulo retangulo1 = new Retangulo("Azul", 2, 5.0, 2.0);
        Triangulo triangulo1 = new Triangulo("Amarelo", 3, 3.0, 5.0);
        Circulo circulo1 = new Circulo("Roxo", 6, 2.5);
        Imagem imagem = new Imagem();


        imagem.adicionarFigura(quadrado1);
        imagem.adicionarFigura(retangulo1);
        imagem.adicionarFigura(triangulo1);
        imagem.adicionarFigura(circulo1);
        imagem.adicionarFigura(circulo1);

        imagem.exibeFiguras();
        imagem.exibeSomaArea();
        imagem.exibeFiguraAreaMaior();
        imagem.exibeQuadrado();
    }
}