public class TesteSacarNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(6646,969060);
        conta.depositar(100);
        System.out.println(conta.sacar(101));

        conta.sacar(101);

        System.out.println(conta.getSaldo());

    }
}