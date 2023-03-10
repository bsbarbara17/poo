public class Presidente extends Funcionario {
    private double valorCotaAcoes;

    public Presidente(int codigo, String nome, double valorCotaAcoes) {
        super(codigo, nome);
        this.valorCotaAcoes = valorCotaAcoes;
    }

    public double getValorCotaAcoes() {
        return valorCotaAcoes;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + valorCotaAcoes;
    }
}