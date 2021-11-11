public class CriarConta {
    public static void main(String[] args){
        Conta contaJulia = new Conta(12122, 665);
        contaJulia.depositar(300);
        System.out.println(contaJulia.getSaldo());


    }
}

