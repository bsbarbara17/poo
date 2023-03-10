public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Engenheiro engenheiro = new Engenheiro(1, "João", "Engenharia", "123456");
        double salarioEngenheiro = engenheiro.calcularSalario(1500);
        System.out.printf("O salário de %s é R$ %.2f\n", engenheiro.getNome(), salarioEngenheiro);

        Gerente gerente = new Gerente(2, "Maria", "Vendas", 1000);
        double salarioGerente = gerente.calcularSalario(5000);
        System.out.printf("O salário de %s é R$ %.2f\n", gerente.getNome(), salarioGerente);

        Presidente presidente = new Presidente(3, "José", 5000);
        double salarioPresidente = presidente.calcularSalario(7000);
        System.out.printf("O salário de %s é R$ %.2f\n", presidente.getNome(), salarioPresidente);
    
    }
}
