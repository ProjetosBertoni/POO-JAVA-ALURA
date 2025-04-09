package exercicio4;

public class TabuadaMultplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        for (int i = 1; i <= 10; i++){
           int mostra = num * i;
           System.out.println(num + " * " + i +  " = " + mostra);
        }

    }
}
