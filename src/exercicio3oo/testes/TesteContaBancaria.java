package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TesteContaBancaria {
    private static final String NUMERO_CONTA = "00123-4";
    private static final String TITULAR = "Hellen Brito";
    private static final double SALDO = 150.75;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(NUMERO_CONTA);
        conta.setTitular(TITULAR);
        conta.setSaldo(SALDO);

        System.out.printf("Numero da conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo: %.2f%n", conta.getSaldo());
    }
}