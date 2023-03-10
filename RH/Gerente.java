

public class Gerente extends Funcionario {
    private String area;
    private double bonus;

    public Gerente(int codigo, String nome, String area, double bonus) {
        super(codigo, nome);
        this.area = area;
        this.bonus = bonus;
    }

    public String getArea() {
        return area;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + bonus;
    }
}