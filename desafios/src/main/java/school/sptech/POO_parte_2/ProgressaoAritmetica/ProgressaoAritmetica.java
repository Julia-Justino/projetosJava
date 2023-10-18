package school.sptech.POO_parte_2.ProgressaoAritmetica;


public class ProgressaoAritmetica {
    private Double primeiroTermo;
    private Double razao;
    private Double total;

    public ProgressaoAritmetica(Double primeiroTermo, Double razao, Double total) {
        this.primeiroTermo = primeiroTermo;
        this.razao = razao;
        this.total = total;
    }



    public ProgressaoAritmetica(){
        Double primeiroTermo = 0.0;
        Double razao = 0.0;
    }
    public Integer calcularTermo(Integer n){
        total = primeiroTermo + (n - 1) * razao;
        return n;
    }
    public void resul(){
        System.out.println(total);
    }
    public Double getPrimeiroTermo() {
        return primeiroTermo;
    }


    public void setPrimeiroTermo(Double primeiroTermo) {
        this.primeiroTermo = primeiroTermo;
    }


    public Double getRazao() {
        return razao;
    }


    public void setRazao(Double razao) {
        this.razao = razao;
    }
}
