package exercicio3;

public class Test {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setNome("Felipe Bertoni");
        contaBancaria.setSaldo(1200);

        contaBancaria.depositar(1500);
        contaBancaria.sacar(1100);
        contaBancaria.consultarSaldo();
    }

}
