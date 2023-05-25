import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0;
    private List<Cartas> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Cartas cartas){
        this.cartas.add(cartas);
        this.pontos += cartas.getNumero();
    }

    public void para(){
        this.pontos = null;
    }

    public boolean parou(){
        if(this.pontos >=21){
            return true;
        }
        return false;
    }



    
}
