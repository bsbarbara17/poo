public class Item extends GameObject{
    private boolean visivel;

    public Item() {
    }

    public Item(int posicaox, int posicaoy, boolean visivel) {
        super(posicaox, posicaoy); 
        this.visivel = false;
    }
    
    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
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
