public class Conta {
    public int numero;
    public double saldo;

    public Conta() {
        
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double calcularSaldo()  {
        return saldo;
    }
}