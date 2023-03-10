public class Engenheiro extends Funcionario {
    private String departamento;
    private String crea;

    public Engenheiro(int codigo, String nome, String departamento, String crea) {
        super(codigo, nome);
        this.departamento = departamento;
        this.crea = crea;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCrea() {
        return crea;
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 1.5;
    }
}