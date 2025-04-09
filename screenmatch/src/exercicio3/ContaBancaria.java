package exercicio3;

public class ContaBancaria {
    protected int saldo;
    private String nome;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double valor){
        if (this.saldo < 0){
            System.out.println("Digite um valor maior que 0!");
        }
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso!");
    }

    public void sacar(double num){
        if (this.saldo < num || this.saldo <= 0){
            System.out.println("Tente sacar com um valor valido!");
        }

        this.saldo -= num;
        System.out.println("saque de " + num + " realizado com sucesso!");
    }

    public void consultarSaldo(){
        System.out.println("O seu saldo é " + saldo);
    }


}
