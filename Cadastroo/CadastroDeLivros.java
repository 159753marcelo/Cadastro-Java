 public class CadastroDeLivros {

    public static void main(String[] args) {

         Autor autor = new Autor();
        autor.nome = "  Rodrigo Turini";
        autor.email = " rodrigo.turini@caelum.com";
        autor.cpf = " 123.654.789.78";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descrição = "Novos recursos da linguagem";
        livro.valor= 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = " paulo.silveira@caelum.com";
        outroAutor.cpf = " 123. 159.624-50";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descrição = " Crie seus primeiros programas";
        outroLivro.valor = 60;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.autor= outroAutor;

        outroLivro.mostrarDetalhes();

        
    }
 }