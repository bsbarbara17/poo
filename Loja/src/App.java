public class App {
    public static void main(String[] args) throws Exception {

        Livro livros = new Livro("nome", 30, "autor");
        System.out.println(livros.getNome() + ", " + livros.getPreco() + ", " + livros.getAutor());

        Eletronico eletro = new Eletronico("nome", 200, "marca", "modelo");
        System.out.println(eletro.getNome() + ", " + eletro.getPreco() + ", " + eletro.getMarca() + ", " + eletro.getModelo());
    }
}
