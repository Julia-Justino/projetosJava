package school.sptech.POO_parte_2.Musica;

import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private List <Musica> musicas;
    public Playlist() {
        musicas = new ArrayList<>();
    }
    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
    public void moverMusica(Integer posicao, Integer novaPosicao) {
        if (posicao < 0 || posicao >= musicas.size()) {
            System.out.println("Não foi possível mover, tente novamente mais tarde.");
        }
        Musica musica = musicas.get(posicao);
        musicas.remove(posicao);
        musicas.add(novaPosicao, musica);
    }
    public void removerMusica(Integer posicao) {
        musicas.remove(posicao);
        //musicas.remove(0);
    }
    public int getDuracao() {
        int duracaoTotal = 0;
        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracao();
        }
        return duracaoTotal;
    }

    public void exibirMusicas() {
        for (Musica musica : musicas) {
            System.out.println(musica.exibirInformacoes());
        }
    }
}

