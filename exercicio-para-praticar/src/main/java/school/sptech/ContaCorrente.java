package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContaCorrente {
    private String titular;
    private String agencia;
    private String numero;
    private List <OperacaoBancaria> operacoes = new ArrayList<>();

    public ContaCorrente(String titular, String agencia, String numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void adicionarOperacao(String categoria, String descricao, Double valor){
        OperacaoBancaria ob = new OperacaoBancaria( categoria, descricao, valor );
        Boolean achou = false;
        System.out.println("8 "+ achou);
        if (Objects.isNull( categoria ) ||  Objects.isNull( descricao ) || Objects.isNull( valor ) || valor==0 || descricao.equalsIgnoreCase( " " )|| categoria.equalsIgnoreCase( " " )){
            System.out.println("Operação inválida");
        }else {
            operacoes.add(ob) ;
        }
    }
    public List<OperacaoBancaria> buscarOperacoesPorCategoria(String categoria){
        List<OperacaoBancaria> lista = new ArrayList<>();
        for (OperacaoBancaria obVez : operacoes){
            if (obVez.getCategoria().equalsIgnoreCase( categoria )){
                lista.add( obVez );
            }
        }
        return lista;
    }
    public List<OperacaoBancaria> buscarOperacoesPorValor(Double valor){
        List<OperacaoBancaria> lista = new ArrayList<>();
        for (OperacaoBancaria obVez : operacoes){
            if (obVez.getValor().equals( valor )){
                lista.add( obVez );
            }
        }
        return lista;
    }
    public List<OperacaoBancaria> buscarOperacoesSaida (){
        List<OperacaoBancaria> lista = new ArrayList<>();
        for (OperacaoBancaria obVez : operacoes){
            if (obVez.getValor()<0){
                lista.add( obVez );
            }
        }
        return lista;
    }

    public List<OperacaoBancaria> buscarOperacoesEntrada (){
        List<OperacaoBancaria> lista = new ArrayList<>();
        for (OperacaoBancaria obVez : operacoes){
            if (obVez.getValor()>0){
                lista.add( obVez );
            }
        }
        return lista;
    }
    public List<OperacaoBancaria>buscarOperacoesPorDescricao  (String descricao){
        List<OperacaoBancaria> lista = new ArrayList<>();
        if (Objects.isNull( descricao )){
            System.out.println("Inválido");
        }else {
            for (OperacaoBancaria obVez : operacoes) {

                if (obVez.getDescricao().equalsIgnoreCase( descricao ) || obVez.getDescricao().toLowerCase().contains( descricao.toLowerCase() )) {
                    lista.add( obVez );
                }
            }
        }
        return lista;
    }
    public Double buscarMaiorValor(){
        Double total = -45678950.0;
        if (operacoes.isEmpty()){
            total = 0.0;
        }else {
            for (OperacaoBancaria ob : operacoes) {
                if (total < ob.getValor()) {
                    total = ob.getValor();
                }
            }
        }
        return total;
    }

    public Double buscarMenorValor(){
        Double total = 45678950.0;
        if (operacoes.isEmpty()){
            total = 0.0;
        }else {
            for (OperacaoBancaria ob : operacoes) {
                if (total > ob.getValor()) {
                    total = ob.getValor();
                }
            }
        }
        return total;
    }

    public Double obterSaldo(){
        Double total = 0.0;
            for (OperacaoBancaria ob : operacoes) {
                    total += ob.getValor();
            }

        return total;
    }

}
