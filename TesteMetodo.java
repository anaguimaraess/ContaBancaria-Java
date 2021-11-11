public class TesteMetodo {
    public static void main(String[] args){
        Conta contaJulia = new Conta(1315, 8753);
        contaJulia.depositar(300);
        System.out.println(contaJulia.getSaldo());

        Conta contaJunior = new Conta(1174, 89852);
        contaJunior.depositar(400);

        contaJunior.sacar(30);
        System.out.println(contaJunior.getSaldo());

        contaJunior.depositar(500);
        System.out.println(contaJunior.getSaldo());

        contaJunior.transferir(100, contaJulia);
        System.out.println("temos isso na conta da julia " + contaJulia.getSaldo());
        System.out.println("na conta do junior temos " + contaJunior.getSaldo());
    }
}