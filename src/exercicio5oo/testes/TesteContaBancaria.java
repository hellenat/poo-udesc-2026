package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String NUMERO_CONTA = "00123-4";
    private static final String TITULAR = "Hellen Brito";
    private static final double SALDO = 150.75;
    private static final double DEPOSITO = 100.0;
    private static final double SAQUE = 50.25;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(NUMERO_CONTA);
        conta.setTitular(TITULAR);
        conta.setSaldo(SALDO);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.imprimirSaldo();

        conta.depositar(DEPOSITO);
        System.out.printf("Apos deposito de %.2f:%n", DEPOSITO);
        conta.imprimirSaldo();

        conta.sacar(SAQUE);
        System.out.printf("Apos saque de %.2f:%n", SAQUE);
        conta.imprimirSaldo();
    }
}