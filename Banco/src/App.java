public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(1234, 100);
        System.out.println(conta.calcularSaldo());

        ContaCorrente cc = new ContaCorrente(3214, 200, 10);
        System.out.println(cc.calcularSaldo());

        ContaVip cv = new ContaVip(3214, 200, 1000);
        System.out.println(cv.calcularSaldo());
    }
}
