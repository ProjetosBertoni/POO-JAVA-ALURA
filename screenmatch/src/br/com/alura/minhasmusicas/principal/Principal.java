package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica.curte();
        }
        System.out.println(musica.getTotalCurtidas());
    }
}
