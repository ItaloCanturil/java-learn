package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Nanatsu no tazai", "Streaming", 30, "Ação", "Production IC");
        anime.imprime();
    }
}
