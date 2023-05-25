public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();
    
    
    public Jogo() {
    }

    public Cartas distribuirCartaParaJogador(Jogador jogador){

        if(jogador.parou()){
            return null;
        }
        Cartas cartas = this.virar();
        jogador.receberCarta(cartas);
        return cartas;
    }

    public String resultado(){
        int pontosJogador = this.jogador.getPonto();
        int pontosComputador = this.computador.getPonto();

        if(pontosJogador > 21){
            return "Jogador perdeu";
        }else if(pontosJogador>pontosComputador){
            return "Jogador ganhou";
        }else if(pontosJogador == pontosComputador){
            return "Empate";
        }
    
    }

    public boolean acabou(){
        boolean jogadorParou = this.jogador.parou();
        boolean computadorParou = this.computador.parou;
        int pontosJogador = this.jogador.parou();
        int pontosComputador =  this.computador.parou;

        return (jogadorParou && computadorParou)|| pontosJogador > 21 || pontosComputador>16;


    }



    public Jogador getJogador() {
        return jogador;
    }


    public Computador getComputador() {
        return computador;
    }
    

    
    
}
