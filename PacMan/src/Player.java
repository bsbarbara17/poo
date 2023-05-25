public class Player extends GameObject {
    private int vidas = 3;
    private int direcao = 0;
    private boolean invensivel = false;

    
    public Player() {
        super();
    }

    public Player(int posicaox, int posicaoy, int direcao) {
        super(posicaox, posicaoy);
        this.direcao = direcao;
    }

   

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public boolean isInvensivel() {
        return invensivel;
    }

    public void setInvensivel(boolean invensivel) {
        this.invensivel = invensivel;
    }


    @Override
    public int getPosicaox() {
        // TODO Auto-generated method stub
        return super.getPosicaox();
    }

    @Override
    public int getPosicaoy() {
        // TODO Auto-generated method stub
        return super.getPosicaoy();
    }

    @Override
    public void setPosicaox(int posicaox) {
        // TODO Auto-generated method stub
        super.setPosicaox(posicaox);
    }

    @Override
    public void setPosicaoy(int posicaoy) {
        // TODO Auto-generated method stub
        super.setPosicaoy(posicaoy);
    }

    
}
