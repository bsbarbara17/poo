import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        FreteService service = new FreteService();

        Frete frete = Frete.builder()
            .nomeDoCliente("Joao")
            .valorDoProduto(new BigDecimal(100))
            .build();

        System.out.println(frete);
        System.out.println(frete.calcularValor());
    }
}
