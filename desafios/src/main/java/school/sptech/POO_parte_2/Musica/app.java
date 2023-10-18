package school.sptech.POO_parte_2.Musica;

public class app {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.adicionarMusica(new Musica("Música 1", "Artista 1", "Gênero 1", 3.2));
        playlist.adicionarMusica(new Musica("Música 2", "Artista 2", "Gênero 2", 5.45));
        playlist.adicionarMusica(new Musica("Música 3", "Artista 3", "Gênero 3", 7.42));

        System.out.println("Duração da playlist: " + playlist.getDuracao() + " minutos");
        playlist.moverMusica(0, 2);
        playlist.removerMusica(0);
        playlist.exibirMusicas();

    }
}
