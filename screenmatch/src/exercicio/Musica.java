package exercicio;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibirFichaTecnica(){
        System.out.println("O titulo é: " + titulo);
        System.out.println("O nome do artista é: " + artista);
        System.out.println("O ano de lançamento é: " + anoLancamento);
        System.out.println("o Numero de avaliação é: " + numAvaliacao);
    }

    void avalieMusica(double nota){
        avaliacao = nota;
        numAvaliacao++;
    }


    double retorneMediaDeAvaliacao(){
        return avaliacao/numAvaliacao;
    }
}
