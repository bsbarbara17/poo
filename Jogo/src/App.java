public class App {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador("Ba");
        jogador.receberDano(10);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());

        //System.out.println(jogador);
        //teste
    }
}
