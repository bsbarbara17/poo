public abstract class Funcionario {
    private int codigo;
    private String nome;

    public Funcionario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario(double salarioBase);
}