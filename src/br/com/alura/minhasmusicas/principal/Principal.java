package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("The scientist");
        minhaMusica.setCantor("Coldplay");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();
            
        }

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("bolha dev");
       meupodcast.setApresentador("Marcos Mendes");

       for (int i = 0; i < 5000; i++){
        meupodcast.reproduzir();
       }

        for (int i = 0; i < 1000; i++) {
            meupodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluirPreferida(meupodcast);
        preferidas.incluirPreferida(minhaMusica);
    }
}
