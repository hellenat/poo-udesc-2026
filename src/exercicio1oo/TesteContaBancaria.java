package exercicio1oo;

class TesteContaBancaria {
    private static final String NUMERO_CONTA = "00123-4";
    private static final String TITULAR = "Hellen Brito";
    private static final double SALDO = 150.75;

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = NUMERO_CONTA;
        conta.titular = TITULAR;
        conta.saldo = SALDO;

        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}