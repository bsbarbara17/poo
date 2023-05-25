public class Cartas {

    private int numero;
    private Naipe naipe;
    



    public Cartas(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }


    public String imagePath(){
        return "classic-cards" + numero + this.naipe + ".png";
    }


    public int getNumero() {
        return numero;
    }


    public Naipe getNaipe() {
        return naipe;
    }

   

    
    
}
