import java.math.BigDecimal;

public class FreteBuilder {
    private String nomeDoCliente;
    private BigDecimal valorDoProduto;
    private double peso;
    private int distancia;

    public FreteBuilder nomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        return this;
    }

    public FreteBuilder valorDoProduto(BigDecimal valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
        return this;
    }

    public FreteBuilder peso(Double  peso) {
        this. peso =  peso;
        return this;
    }

    public FreteBuilder distancia(int distancia) {
        this.distancia = distancia;
        return this;
    }

    public Frete build() {
        return new Frete(nomeDoCliente, valorDoProduto, peso, distancia);
    }
}
