package exercicio3;

public class ContaCorrente extends ContaBancaria {
    private int valorTaxa;

    public void cobrarTarifaMensal(){
        this.saldo -= valorTaxa;
        System.out.println("Taxa realizada com sucesso!");
        System.out.println("O saldo da sua conta atualizado é " + this.saldo);
    }
}
