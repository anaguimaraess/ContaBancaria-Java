public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }


        public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }


    public boolean transferir(double valor, Conta destino){
        if(valor <= this.saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
            } else{
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void getAgencia() {
        if (agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;

    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }



}
