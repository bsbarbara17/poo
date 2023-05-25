import java.util.Random;

public class Ghost extends GameObject {
    private int direcao;

    public Ghost() {
        super();
        this.direcao = 0;
    }

    public Ghost(int posicaox, int posicaoy, int direcao) {
        super(posicaox, posicaoy);
        setDirecao(direcao);
    }

    public boolean podeMover() {
        return true;
    }

    public void mova() {
        Random random = new Random();
        setDirecao(random.nextInt(4)); 
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;

        if (direcao >= 0 && direcao <= 3) {
            this.direcao = direcao;
        } else {
            System.out.println("A direção deve ser um valor entre 0 e 3");
        }
    }
}
