import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Monte {

    private List<Cartas>cartas = new ArrayList<>();

    public Monte() {
    }

    public void embaralhar(){
        Collection.shuffle(cartas);
    }

    public Cartas virar(){
        if(this.cartas.isEmpty()){
            return null;
        }

        return this.cartas.remove(0);
    }




    
    
}
