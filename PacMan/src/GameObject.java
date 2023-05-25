public class GameObject {
    public int posicaox;
    public int posicaoy;
    public int tamanho;

    public GameObject() {
        
    }

    public GameObject(int posicaox, int posicaoy) {
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
    }

    public int getPosicaox() {
        return posicaox;
    }

    public void setPosicaox(int posicaox) {
        if(posicaox > 0) {
            System.out.println("erro");
        } else {
            this.posicaox = posicaox;
        }

    }

    public int getPosicaoy() {
        return posicaoy;
    }

    public void setPosicaoy(int posicaoy) {
        if(posicaoy > 0) {
            System.out.println("erro");
        } else {
            this.posicaoy = posicaoy;
        }
    }

    public int getTamanho() {
        return tamanho;
    }


    public void setTamanho(int tamanho) {
        if(tamanho > 0) {
            System.out.println("erro");
        } else {
            this.tamanho = tamanho;
        }
        
    }

}
