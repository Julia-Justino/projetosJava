package school.sptech.POO_parte_2.Ponto;

public class Ponto {
    private Integer x;
    private Integer y;

    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public void mover(Integer novoX, Integer novoY){
        this.x = novoX;
        this.y = novoY;
    }

    /*Form: d=√((x_2-x_1)²+(y_2-y_1)²)*/
    public Double getDistancia(Ponto outroPonto){
        Integer distanciaX = outroPonto.getX() - this.x;
        Integer distanciaY = outroPonto.getY() - this.y;
        return Math.sqrt(Math.pow(distanciaX,2) + Math.pow(distanciaY,2));
    }

    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }
}
