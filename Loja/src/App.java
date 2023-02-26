public class App {
    public static void main(String[] args) throws Exception {

        Livros livros = new Livros("nome", 30, "autor");
        System.out.println(livros.getNome() + ", " + livros.getPreco() + ", " + livros.getAutor());

        Eletronicos eletro = new Eletronicos("nome", 200, "marca", "modelo");
        System.out.println(eletro.getNome() + ", " + eletro.getPreco() + ", " + eletro.getMarca() + ", " + eletro.getModelo());
    }
}
