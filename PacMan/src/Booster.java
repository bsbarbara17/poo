public class Booster extends Item {
    private int duracao; 

    public Booster() {
        super();
        this.duracao = 0;
    }

    public Booster(int posicaox, int posicaoy, boolean visivel, int duracao) {
        super(posicaox, posicaoy, visivel);
        if(duracao < 0){
            System.out.println("so pode numero positivo");
        }
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if(duracao < 0){
            System.out.println("so pode numero positivo");
        } else {
            this.duracao=duracao;
        }
        
    }

    

    

    
}

