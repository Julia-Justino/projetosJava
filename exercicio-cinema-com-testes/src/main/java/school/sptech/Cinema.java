package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cinema {
    private String nome;
    private List <Sessao> sessoes;

    public Cinema(String nome) {
        this.nome = nome;
        this.sessoes = new ArrayList<>();
    }

    public void adicionarSessao(Sessao sessao){
        try {
            if (sessao != null){
                sessoes.add(sessao);
            }
        }catch (NullPointerException e) {
            String mensagem = e.getMessage() + ". O objeto nome é NULL.";
            System.out.println(mensagem);
        }
    }

    public Integer getQuantidadeSessoes3d(){
        Integer qtd = 0;
        for (Sessao sessao: sessoes){
            if (sessao.getSessao3d() != false){
                qtd ++;
            }
        }
        return qtd;
    }

    public List<Sessao> getSessoesPorNomeFilme(String filme){
        List <Sessao> sessaoFilmes = new ArrayList<>();
        if(Objects.nonNull(filme)){
            for (Sessao sessaoVez : sessoes){
                if (sessaoVez.getFilme().equalsIgnoreCase(filme)){
                    sessaoFilmes.add(sessaoVez);
                }
            }
        }
        return sessaoFilmes;
    }

    public Double getMediaIngressosVendidos(){
        Double valor = 0.0;
        for (Sessao sessaoVez : sessoes){
            valor += sessaoVez.getIngressosVendidos();
        }
        if (sessoes.size() != 0){
            return valor / sessoes.size();

        }else {
            return 0.0;
        }
    }
    public String getNome() {
        return nome;
    }

    public Double calcularTotalVendas(){
        Double valor = 0.0;
        for (Sessao sessaoVez : sessoes){
            valor += sessaoVez.getIngressosVendidos()* sessaoVez.calcularPrecoDoIngresso();
        }
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
