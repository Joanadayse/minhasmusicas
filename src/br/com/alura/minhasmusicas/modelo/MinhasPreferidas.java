package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferidas {
    public void incluirPreferida(Audio audio) {

        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        }else{
            System.out.println(audio.getTitulo() + " tambem é um dos que todo mundo esta curtindo");
        }

    }
}
