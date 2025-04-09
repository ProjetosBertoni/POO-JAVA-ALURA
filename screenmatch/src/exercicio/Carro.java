package exercicio;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int calcularIdadeDOCarro(int anoAtual){
        return anoAtual - ano;
    }
}
