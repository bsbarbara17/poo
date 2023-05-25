import java.math.BigDecimal;

public class FreteService {
    
    public BigDecimal calcularValor(Frete frete) {
        // até 100km 10% do valor
        // até 500km 20% do valor
        // mis que 500km 50% do valor

        return new RegraFreteCurto() 
            .depois(new RegraFreteMedio())
            .depois(new RegraFreteLongo())
            .calcular(frete);
    }
}
