package br.com.alura.minhasmusicas.modelo;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int totalDeCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public  void curte (){
        this.totalDeCurtidas++;
    }

    public  void reproduzir (){
        this.totalDeReproducao++;
    }



}
